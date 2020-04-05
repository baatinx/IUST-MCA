declare
         a integer;
begin
         a:=20;
         if(a>10) then
                dbms_output.put_line('a is greater than 10');
                goto jump;
          end if;
                    dbms_output.put_line('a is less than 10');

<<jump>>
                   dbms_output.put_line('ok thanks');
end;
