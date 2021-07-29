--pl/sql
--in:�Է� *�Ű�����
create or replace procedure insertBook(
mybookID in number, 
mybookName in varchar2, 
myPublisher in varchar2, 
myPrice in number
) as begin
insert into book(bookid, bookname, publisher, price) 
values(mybookID, mybookName, myPublisher, myPrice); 
end;
/

exec insertBook(50, '����������', '������м���', 25000);

--���� �̸��� ������ �����ϸ� �Է��� ���� �ʰ� ������Ʈ ����
--���� �̸��� ������ ������ �Է�
create or replace procedure BookInsertOrUpdate(
mybookID number, 
mybookName varchar2, 
myPublisher varchar2, 
myPrice number
) as myCount number; --���������ν� ���� ������ �ִ��� ī��Ʈ�� Ȯ��
begin 
select count(*) into myCount from book 
where bookName like mybookName;
if mycount != 0 --myCount ���� ������ ���� ���� �ִٰ� �Ǵ�
then update book set price=myPrice 
where bookName like mybookName;
else insert into book(bookid, bookname, publisher, price) 
values(mybookID, mybookName, myPublisher, myPrice);
end if; --if ����
end; --procedure ����
/

exec BookInsertOrUpdate(8, '�߱��� ��Ź��', '�̻�̵��', 18000);
exec BookInsertOrUpdate(51, '�౸�� ��Ź��', '���ѹ̵��', 15000);

--book ���̺� ����� ������ ��� ������ ��ȯ�ϴ� ���α׷�
create or replace procedure AveragePrice(
averageVal out number --out�� �Ű�����
) as 
begin
select avg(price) into averageVal from book 
where price is not null;
end;
/

/*
AveragePrice test
dbms_output.put_line�� ���� ��� ���θ� ����
*/
set serveroutput on; --���� on
declare averageVal number; --���� ����
begin
AveragePrice(averageVal);
dbms_output.put_line('å�� ��հ�:' || round(AverageVal, 2));
end;