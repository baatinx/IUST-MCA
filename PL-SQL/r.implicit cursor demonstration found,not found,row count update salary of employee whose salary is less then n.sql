DECLARE    
total_rows number(2); 
BEGIN   
UPDATE employee   SET e_salary = e_salary + 500 where e_salary<2000;   
IF sql%notfound THEN      
dbms_output.put_line('no customers selected');   
ELSIF sql%found THEN      
total_rows := sql%rowcount;      
dbms_output.put_line( total_rows || ' customers selected ');   
END IF; 
END;