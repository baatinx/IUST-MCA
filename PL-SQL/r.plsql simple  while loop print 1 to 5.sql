declare
       n number(2):=1;
begin
while(n<>6)
loop
        dbms_output.put_line(n);
        n:=n+1;
end loop;
end;