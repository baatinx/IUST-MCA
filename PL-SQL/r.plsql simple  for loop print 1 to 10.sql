declare
       n number(2);
begin
for n in 1..10
loop
        dbms_output.put_line(n);
end loop;
end;