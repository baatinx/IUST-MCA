declare
a number(2);
b number(2);
s number(2);
function sum2nos(a in number,b in number) return number is
begin
s:=a+b;
return s;
end;

begin
a:=:a;
b:=:b;
s:=sum2nos(a,b);
dbms_output.put_line('sum of a and b is '||s);
end;