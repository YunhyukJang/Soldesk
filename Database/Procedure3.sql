Select * from book;

create or replace procedure UPDATE_PROC(
B_bookid in number, 
B_bookname in varchar2, 
B_publisher in varchar2, 
B_price in number
) is 
begin
update book 
set bookid=B_bookid, 
bookname=B_bookname, 
publisher=B_publisher, 
price=B_price 
where B_bookid=bookid;
end;
/

exec UPDATE_PROC(50, '���̾�Ʈ', '�ֵ���ũ', 32000);

Select * from customer;

create or replace procedure customer_proc(
C_name in varchar2, 
C_address in varchar2, 
C_phone in varchar2
) as 
begin 
update customer 
set name=C_name, 
address=C_address, 
phone=C_phone 
where name=C_name; 
end; 
/

exec customer_proc('������', '���� ���α�', '010-8888-9999');

create or replace procedure DELETE_PROC1(
B_bookid in number
) 
is 
begin 
delete from book 
where B_bookid=bookid;
end; 
/

exec DELETE_PROC1(50);

--�̸��� �Ű������� �Ͽ� ���� �����͸� �����ϴ� ���ν����� ����
create or replace procedure delete_proc2(
B_name in varchar2
) 
is 
begin 
delete from customer 
where B_name=name; 
end; 
/

exec delete_proc2('�ڼ���');