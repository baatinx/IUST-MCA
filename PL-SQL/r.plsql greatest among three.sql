declare
       a number(2);
       b number(2);
       c number(2);
begin
      a:=:a;
      b:=:b;
      c:=:c;

               if(a>b) then
                            if(a>c) then
                                  dbms_output.put_line('a is greatest '||a);
                                  
                                  else 
                                  
                                  dbms_output.put_line('c is greatest'||c);
                             end if;
                else
                           if(b>c) then
                                                        dbms_output.put_line('b is greatest'||b);
                                    
                                                        else
                                                       
                                                        dbms_output.put_line('c is greatest');
               
                                            end if;
             end if;

end;         





