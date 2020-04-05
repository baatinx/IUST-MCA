declare 
a number(4);
b number(3);
begin
a:=7;
b:=3;
              if(b<a) then
                      dbms_output.put_line('1 ');
                               if(a>b ) then
                                         dbms_output.put_line('2 ');
                                end if;
              else
                      dbms_output.put_line('3 ');
              end if; 
end;        