--procedure �ǽ�
--�Ǹ� ������ ���� ���ͱ��� ����ϴ� ���α׷�
--�Ű������� ���� ���ν���
--30000 �̻��̸� 10%������ ���� �������� 5%�� ������ ���
create or replace procedure Interest
as 
myInterest number; --��������
price number; 
cursor InterestCursor 
is select saleprice 
from orders; 
begin
myInterest := 0.0; --���� �ʱ�ȭ
open InterestCursor; --Ŀ�� ���
loop 
fetch InterestCursor into price;
exit when InterestCursor%notfound;
if price >= 30000 
then myInterest := myInterest+price*0.1;
else myInterest := myInterest+price*0.05;
end if; --if ����
end loop; --loop ����
close InterestCursor; --Ŀ���� ��� �۾��� ����
dbms_output.put_line('��ü ���� �ݾ�=' || myInterest); --����� ���
end;
/

set serveroutput on;
exec Interest;