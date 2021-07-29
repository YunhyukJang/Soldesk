--customer 테이블에 대한 insert, update, delete 작업 trigger
--테이블(customer_log)은 하나로 통합하되 날짜와 시간 및 수행 작업이 명시되어야 한다.
drop table customer_log;

create table customer_log(
custid_l number, 
name_l varchar2(20), 
address_l varchar2(30), 
phone_l varchar2(20), 
date_l varchar2(20), 
worked_l varchar2(20)
);

Select * 
from customer_log;

--insert
create or replace trigger After_Insert_Customer 
after insert on customer for each row 
begin 
insert into customer_log 
values(:new.custid, :new.name, :new.address, :new.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'insert');
dbms_output.put_line('튜플을 customer_log 테이블에 백업 완료'); 
end; 
/

--update
create or replace trigger After_Update_Customer 
after update on customer for each row 
begin 
insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'update');
dbms_output.put_line('튜플을 customer_log 테이블에 백업 완료');
end; 
/

--delete
create or replace trigger After_Delete_Customer 
after delete on customer for each row 
begin 
insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'delete');
dbms_output.put_line('튜플을 customer_log 테이블에 백업 완료');
end; 
/

--if문을 활용한 통합
create or replace trigger After_CRUD_Customer 
after insert or update or delete on customer for each row 
begin 
if inserting 
then insert into customer_log 
values(:new.custid, :new.name, :new.address, :new.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'insert'); 
dbms_output.put_line('튜플을 customer_log 테이블에 백업 완료'); 
elsif updating 
then insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'update'); 
dbms_output.put_line('튜플을 customer_log 테이블에 백업 완료'); 
elsif deleting 
then insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'delete'); 
dbms_output.put_line('튜플을 customer_log 테이블에 백업 완료'); 
end if;
end; 
/

set serveroutput on 
insert into customer values(5, '박세리', '대한민국 부산', 010-1111-2222);
delete from customer where custid=5;
update customer set address='대한민국 서울' where name like '박세리';