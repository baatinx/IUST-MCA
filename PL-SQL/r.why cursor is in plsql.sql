declare
a employee.e_salary%type;
b number(5):=80;
cursor c is select e_salary from employee where e_id =1804;
begin
open c;
fetch c into a;
b:=b+a;
dbms_output.put_line(b);
end;