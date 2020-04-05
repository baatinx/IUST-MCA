declare 
        name varchar(6);
begin 
       select e_name into name from  employee where e_id=04;
       dbms_output.put_line(name);
exception
 when no_data_found then
        dbms_output.put_line('no data found');
   
end;        