--Trigger
--insert into ������ ����ϴ� trigger
drop table book_log;

create table book_log(
bookid_l number, 
bookname_l varchar2(40), 
publisher_l varchar2(40), 
price_l number
);

Select * 
from book_log;

--���ϸ�:AfterInsertBook
create or replace trigger AfterInsertBook 
after insert on book for each row 
begin 
insert into book_log 
values(:new.bookid, :new.bookname, :new.publisher, :new.price); 
dbms_output.put_line('Ʃ���� book_log ���̺� ��� �Ϸ�'); 
end; 
/

set serveroutput on 
insert into book values(9, '������ ����1', '�̻�̵��', 25000);
insert into book values(100, '������ ��ſ�', '���ѹ̵��', 9000);
insert into book values(200, '������ ��ſ�', '���ѹ̵��', 200);

--delete ������ ����ϴ� trigger
drop table book_delete_log;

create table book_delete_log(
bookid_l number, 
bookname_l varchar2(40), 
publisher_l varchar2(40), 
price_l number
);

Select * 
from book_delete_log;

create or replace trigger AfterDeleteBook 
after delete on book for each row 
begin 
insert into book_delete_log 
values(:old.bookid, :old.bookname, :old.publisher, :old.price); 
dbms_output.put_line('Ʃ���� book_delete_log ���̺� ��� �Ϸ�'); 
end; 
/

set serveroutput on 
delete from book where bookid=100;
delete from book where bookid=200;

--update ������ ����ϴ� trigger
drop table book_update_log;

create table book_update_log(
bookid_l number, 
bookname_l varchar2(40), 
publisher_l varchar2(40), 
price_l number
);

Select * 
from book_update_log;

create or replace trigger AfterUpdateBook 
after update on book for each row 
begin 
insert into book_update_log 
values(:old.bookid, :old.bookname, :old.publisher, :old.price);
dbms_output.put_line('Ʃ���� book_update_log ���̺� ��� �Ϸ�');
end; 
/

set serveroutput on 
update book set publisher='SOLDESK' 
where bookid=51;