declare
             a employee.e_name%type;
             b employee.e_id%type;
             cursor emp is select e_name,e_id from employee where e_salary>6000;
begin
             open  emp;
             loop 
                        fetch emp into a,b;
                        if(emp%notfound) then
                              dbms_output.put_line('ok all records processed');
                              exit;
                              else
                              dbms_output.put_line(a||b);
                              
                        end if;
            end loop;
close emp;
end; 