declare
       a integer;
       procedure square_of_n(x in out number)is
              begin
                      x:=x*x;
              end;
begin
             a:=5;
             square_of_n(a);
             dbms_output.put_line('square of a is:'||a);
end;
