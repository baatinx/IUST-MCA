declare
        a number(2);
        b number(2);
        c number(2);

begin
     a:=6;
     b:=3;
     c:=a+b;
     dbms_output.put_line('the sum of a and b is '||c);
end