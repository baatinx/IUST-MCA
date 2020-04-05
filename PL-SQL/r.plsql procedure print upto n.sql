create or replace procedure print_upto_n(limit number ) is 
               i number(4):=0;
begin
               while(i<=limit)
               loop
                             dbms_output.put_line(i);
                             i:=i+1;
               end loop;
end;
