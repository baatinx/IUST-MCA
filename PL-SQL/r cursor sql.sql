declare
             name           employee.e_name%type;
             id             employee.e_name%type;
             dept           employee.e_dept_id%type;
             pos            employee.position%type;
             total_amount   employee.e_salary%type;

            cursor total is select e_name,e_id,e_dept_id,position from employee where e_salary<=10000;
begin
            open total;
            dbms_output.put_line('name           '||'id           '||'dept           '||'positon  ');
            loop
                     fetch total into name,id,dept,pos;
                             if(total%found) then
                                          
                                          dbms_output.put_line(name||'           '||id||'           '||dept||'             '||pos);
                             else 
                                          dbms_output.put_line('ok all records processed');
                                          exit;
                             end if;
           end loop;
end;