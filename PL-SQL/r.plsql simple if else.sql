declare
        a number(2);
     
begin
     a:=:enter_value_for_a;
     if(a>50) then
     dbms_output.put_line('value of a is greater than 50');
     else
     dbms_output.put_line('value of a is not greater than 50');
     end if;
end;