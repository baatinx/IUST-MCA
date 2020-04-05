create table logoff_tbl(
                          who varchar2(30),
                          when date
                        );
create or replace trigger trg_logoff
before logoff on database
begin
     insert into logoff_tbl values(sys_context('userenv','session_user'),sysdate);
end;

select * from logoff_tbl