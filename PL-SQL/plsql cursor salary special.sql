declare
     name           employee.e_name%type;
     id             employee.e_name%type; 
     dept           employee.e_dept_id%type;
     pos            employee.position%type;
     c_salary       employee.e_salary%type;
     total_amount   employee.e_salary%type;

--insert into employee values(:e_id,:e_name,:e_sex,:e_dept_id,e_address,:e_salary,:position)
--select * from employee
cursor total is select e_name,e_id,e_dept_id,position,e_salary from employee where e_salary<20000;
begin
total_amount:=0;
dbms_output.put_line('NAME         '||'ID      '||'DEPt_ID   '||'POSITION     '||'current salary');
     open total;

loop
     fetch total into name,id,dept,pos,c_salary;
     if(total%found) then
     dbms_output.put_line(name||'      '||id||'       '||dept||'      '||pos ||'          '||c_salary);
     else
           dbms_output.put_line('ok all records processed');
           exit;
     end if;
end loop;
end;