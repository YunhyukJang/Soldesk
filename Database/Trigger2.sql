--customer ���̺� ���� insert, update, delete �۾� trigger
--���̺�(customer_log)�� �ϳ��� �����ϵ� ��¥�� �ð� �� ���� �۾��� ��õǾ�� �Ѵ�.
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
dbms_output.put_line('Ʃ���� customer_log ���̺� ��� �Ϸ�'); 
end; 
/

--update
create or replace trigger After_Update_Customer 
after update on customer for each row 
begin 
insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'update');
dbms_output.put_line('Ʃ���� customer_log ���̺� ��� �Ϸ�');
end; 
/

--delete
create or replace trigger After_Delete_Customer 
after delete on customer for each row 
begin 
insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'delete');
dbms_output.put_line('Ʃ���� customer_log ���̺� ��� �Ϸ�');
end; 
/

--if���� Ȱ���� ����
create or replace trigger After_CRUD_Customer 
after insert or update or delete on customer for each row 
begin 
if inserting 
then insert into customer_log 
values(:new.custid, :new.name, :new.address, :new.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'insert'); 
dbms_output.put_line('Ʃ���� customer_log ���̺� ��� �Ϸ�'); 
elsif updating 
then insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'update'); 
dbms_output.put_line('Ʃ���� customer_log ���̺� ��� �Ϸ�'); 
elsif deleting 
then insert into customer_log 
values(:old.custid, :old.name, :old.address, :old.phone, 
to_char(sysdate, 'yyyy-mm-dd hh:mi:ss'), 'delete'); 
dbms_output.put_line('Ʃ���� customer_log ���̺� ��� �Ϸ�'); 
end if;
end; 
/

set serveroutput on 
insert into customer values(5, '�ڼ���', '���ѹα� �λ�', 010-1111-2222);
delete from customer where custid=5;
update customer set address='���ѹα� ����' where name like '�ڼ���';