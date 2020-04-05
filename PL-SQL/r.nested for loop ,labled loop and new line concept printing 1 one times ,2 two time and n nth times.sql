declare
         a number(4);
         
begin
                  <<outer_loop>>
                  for a in 1..5
                  loop
                             <<inner_loop>>
                             for b in 1..a
                             loop
                                    dbms_output.put_line('*'||'     '||a);
                             end loop outer_loop;
                             dbms_output.new_line;
                 end loop outer_loop;
end;