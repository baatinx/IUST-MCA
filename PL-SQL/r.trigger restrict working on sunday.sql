create or replace trigger restrict_working_on_sunday
before insert or update or delete on employee
for each row
declare
         day char;
begin
         day:=upper(    to_char(sysdate,'day')    );
         if(day='SUNDAY') then
                   raise_application_error(-20022,'no working possible on sunday');
                   
         end if;
end;

update employee set e_name='basit' where e_id=1804;
drop trigger restrict_working_on_sunday