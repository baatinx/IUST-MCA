declare 
        name                      varchar(6);
        id                        number(8);
        user_def_exception        exception;
begin 
       id:=0;
       if id<=0 then
                  raise user_def_exception;
       else 
                  select e_name into name from  employee where e_id=id;
                  dbms_output.put_line(name);
      end if;
exception 
 when user_def_exception then
            dbms_output.put_line('id no must be greater than 0');
end;        