declare
        a number(2);
        b number(2);
        c number(2);

begin
     a:=:enter_value_for_a;
     b:=:enter_value_for_b;
     c:=a+b;
     dbms_output.put_line('the sum of a and b is '||c);
end;