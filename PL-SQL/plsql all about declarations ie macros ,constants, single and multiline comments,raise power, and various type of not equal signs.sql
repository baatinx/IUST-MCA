declare
            a int:=5;   
            b constant int:=3;   /*variable b is similar to macro i.e in the life time
                                     of this program no one change the value of b e.g b:=20  */  
            c int;               -- that is  multi-line comment and this is single line 
            d real;
                       /* here integer is 
                             referred as int  */
begin
           c:=a**b;
           dbms_output.put_line('a raise power b is :'||c);
           if a<> 4 then
                   dbms_output.put_line('a is not equal to 4');
           end if;

                        if b!=4 then
                                 dbms_output.put_line('also b ');
                        end if;
                                                   d:=70/3;
                                                   if a~= 4 then
                                                             dbms_output.put_line('and c');
                                                   end if;
                                                                  if a~= 4 then
                                                                         dbms_output.put_line('d at last i.e '||d);
                                                                  end if;
end;
                                                                      