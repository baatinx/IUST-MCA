DECLARE   
employee_rec employee%rowtype; 
BEGIN   
SELECT * into employee_rec FROM employee   WHERE e_id = 1805;
dbms_output.put_line('Customer ID: ' || employee_rec.e_id);   
dbms_output.put_line('Customer Name: ' || employee_rec.e_name);   
dbms_output.put_line('Customer Address: ' || employee_rec.e_address);   
dbms_output.put_line('Customer Salary: ' || employee_rec.e_salary); 
END;