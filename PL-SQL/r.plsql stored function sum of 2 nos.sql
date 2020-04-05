create or replace function sumofnos(a in number,b in number) return number is s number(2); 
begin
s:=a+b;
return (s);
end;                         --stored function is created 

 
select sumofnos(2,8) from dual   -- we can also check stored funtion using dual

declare
a number(2);
b number(2);
s number(2);
begin
a:=:a;
b:=:b;
s:=sumofnos(a,b);                --here goes two values to stored function;
dbms_output.put_line('sum of a and b is '||s);         
end;




