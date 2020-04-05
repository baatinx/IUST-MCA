declare
       n number(2):=1;
begin
loop
       dbms_output.put_line(n);
       n:=n+1;
       exit when n=6;
end loop;
end;