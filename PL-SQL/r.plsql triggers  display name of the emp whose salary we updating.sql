create or replace trigger display_name
before update of e_salary on employee
for each row
declare
a number(5);
b varchar2(20);
begin
a:=:new.e_salary-:old.e_salary;
b:=:old.e_name;
dbms_output.put_line('u have update the salary of '||b||' by '||a);
end;
select * from employee
update employee set e_salary=18000 where e_id=1803;
update employee set e_salary=16000 where e_dept_id=6;