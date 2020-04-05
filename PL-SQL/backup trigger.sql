
create or replace trigger dept_backup_trigger
before insert or update or delete or alter on dept
for each row
begin
                if inserting then          
                           insert into dept_backup(dept_name,dept_id,dept_location) values(:new.dept_name,:new.dept_id,:new.dept_location);
                           dbms_output.put_line('Backup updated.');
                else
                if updating then
                           update dept_backup set dept_name,dept_id,dept_location=:new.dept_name,:new.dept_id,:new.dept_location;
                           dbms_output.put_line('Backup updated.');
                else
                if deleting then
                          delete dept_backup where dept_name,dept_id,dept_location=:new.dept_name,:new.dept_id,:new.dept_location;
                          dbms_output.put_line('Backup updated.');
                end if;
                end if;
                end if;
end;
                  