declare
         a integer;
begin
                  <<outer_loop>>
                  for a in 1..3
                  loop
                             <<inner_loop>>
                             for b in 1..3
                             loop
                                    dbms_output.put_line('a='||a||'    '||'b='||b);
                             end loop outer_loop;
                             dbms_output.new_line;
                 end loop outer_loop;
end;