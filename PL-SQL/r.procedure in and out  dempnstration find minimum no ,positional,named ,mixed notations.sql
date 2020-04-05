declare
           a integer;
           b integer;
           c integer;
           procedure find_min(x in  number, y in  number, z out number ) is 
               begin
                           if x>y then
                                  z:=y;
                           else
                                  z:=x;
                           end if;
               end;
begin
           a:=4;
           b:=9;
           find_min(a,b,c);    --find_min(y=>b,x=>a,z=>c); or find_min(a,b,z=>c); ie positinal,named,mixed notations respectively    
           dbms_output.put_line('the minimum no. is: '||c);
end;