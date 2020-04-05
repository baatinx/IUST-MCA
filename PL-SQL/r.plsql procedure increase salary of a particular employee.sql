create or replace procedure increase_salary(id number,amount number) is
begin
           update employee set e_salary=e_salary+amount where e_id=id;
           dbms_output.put_line('ok salary has been updated ');         
end;

begin 
increase_salary(1805,300);
end;

select * from employee