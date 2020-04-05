declare
     name           employee.e_name%type;
     id             employee.e_name%type; 
     dept           employee.e_dept_id%type;
     pos            employee.position%type;
     c_salary       employee.e_salary%type;
     manager_amount        number(5);
     clerk_amount          number(5);
     assistant_amount      number(5);
     accountant_amount     number(5);
     before_updated_salary   number(8);
     after_updated_salary    number(8);
     addition_to_salary      number(6);
     temp number(4);

cursor total is select e_name,e_id,e_dept_id,position,e_salary from employee where e_salary<20000;
begin
        manager_amount:=5000;
        clerk_amount:=3000;
        assistant_amount:=2000;
        accountant_amount:=2000;
        
        
        dbms_output.put_line('NAME         '||'ID      '||'DEPT_ID   '||'POSITION     '
        ||'current salary       '||'updated salary     '||'addition amount');
        open total;
    
        loop
              fetch total into name,id,dept,pos,c_salary;
              if(total%found) then
                      dbms_output.put_line(name||'      '||id||'       '||dept||'      '||pos
                      ||'           '||c_salary);
                    if(pos='manager') then
         
                        before_updated_salary:=before_updated_salary+c_salary;
                        update employee set e_salary=e_salary+manager_amount where e_id=id;
                        temp:=c_salary+manager_amount;
                        after_updated_salary:=after_updated_salary+c_salary+manager_amount;
                        addition_to_salary:=addition_to_salary+manager_amount;
                        dbms_output.put_line('     '||||'       '||manager_amount);
                    end if;
              else
                      dbms_output.put_line('ok all records processed');
                      exit;
              end if;
      end loop;
end;