--�Է�
--����
insert into ���� values(1, '����', '����'); 
insert into ���� values(2, '��Ƽ', '����'); 
insert into ���� values(3, '��Ƽ', '���');
insert into ���� values(4, 'CGV', '����� ������'); 
insert into ���� values(5, '�ް��ڽ�', '����� ������');

--�󿵰�
insert into �󿵰� values(1, 1, '�ż���', 9000, 35); 
insert into �󿵰� values(1, 2, '����ȣ��', 9000, 40); 
insert into �󿵰� values(3, 3, '���극��', 9000, 10);
insert into �󿵰� values(3, 4, '������ ����', 7000, 50); 
insert into �󿵰� values(3, 5, '�Ű� �Բ�', 7500, 20);

--��
insert into �� values(1, '�����', '����� ������');
insert into �� values(2, 'ȫ�浿', '����� ������');
insert into �� values(3, '������', '����� ������');
insert into �� values(4, '����ȣ', '����� ������');
insert into �� values(5, '������', '����� ������');

--����
insert into ���� values(1, 1, 1, 30, to_date('2019-10-15', 'yyyy-mm-dd'));
insert into ���� values(2, 1, 2, 25, to_date('2019-10-15', 'yyyy-mm-dd'));
insert into ���� values(3, 1, 3, 35, to_date('2019-10-17', 'yyyy-mm-dd'));
insert into ���� values(4, 2, 4, 20, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into ���� values(4, 3, 3, 10, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into ���� values(1, 3, 2, 40, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into ���� values(3, 1, 2, 45, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into ���� values(2, 2, 1, 50, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into ���� values(2, 3, 1, 55, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into ���� values(1, 2, 4, 15, to_date('2020-09-01', 'yyyy-mm-dd'));

--��� ������ �̸��� ��ġ�� ���̽ÿ�.
Select �����̸�, ��ġ 
from ����;

--'���'�� �ִ� ������ ���̽ÿ�.
Select * 
from ���� 
where ��ġ like '���';

--'����� ������'�� ��� ���� ������ ���̵� �̸��� ������������ ���̽ÿ�.
Select * 
from �� 
where �ּ� like '����� ������' 
order by �̸�;

--������ 8,000�� ������ ��ȭ�� �����ȣ, �󿵰���ȣ, ��ȭ������ ���̽ÿ�.
Select �����ȣ, �󿵰���ȣ, ��ȭ���� 
from �󿵰� 
where ���� <= '8000';

--���� ��ġ�� ���� �ּҰ� ���� ������ ���̽ÿ�.
Select * 
from ����, �� 
where ����.��ġ=��.�ּ�;

--�����Լ�
--������ ���� �� ���ΰ�?
Select count(*) 
from ����;

--�󿵵Ǵ� ��ȭ�� ��� ������ ���ΰ�?
Select avg(����) 
from �󿵰�;

--2020�� 9�� 1�Ͽ� ��ȭ�� ������ ���� ���� ���ΰ�?
Select count(*) 
from ���� 
where ��¥ like '20/09/01';

--�μ�����
--'����'���忡�� �󿵵� ��ȭ������ ���̽ÿ�.
Select ��ȭ���� 
from ����, �󿵰� 
where ����.�����ȣ=�󿵰�.�����ȣ 
and �����̸� like '����';

--'����'���忡�� ��ȭ�� �� ���� �̸��� ���̽ÿ�.
Select �̸� 
from ����, ��, ���� 
where ����.�����ȣ=����.�����ȣ and ��.����ȣ=����.����ȣ 
and �����̸� like '����';

--'����'������ ��ü ������ ���̽ÿ�.
Select sum(����) 
from ����, �󿵰�, ����  
where ����.�����ȣ=�󿵰�.�����ȣ and �󿵰�.�����ȣ=����.�����ȣ 
and ����.�󿵰���ȣ=�󿵰�.�󿵰���ȣ 
and �����̸� like '����';

--�׷�
--���庰 �󿵰� ���� ���̽ÿ�.
Select �����ȣ, count(*) 
from �󿵰� 
group by �����ȣ;

--2020�� 9�� 1�Ͽ� ���庰 ��� ���� ���� ���� ���̽ÿ�.
Select �����ȣ, count(*) 
from ���� 
where ��¥ like to_date('2020-09-01', 'yyyy-mm-dd') 
group by �����ȣ;

--2020�� 9�� 1�Ͽ� ���� ���� ���� ������ ��ȭ�� ������ ���̽ÿ�.
Select ��ȭ���� 
from ����, �󿵰� 
where ����.�󿵰���ȣ=�󿵰�.�󿵰���ȣ 
and ��¥ like to_date('2020-09-01', 'yyyy-mm-dd')
group by �󿵰�.��ȭ���� 
having count(*) 
in (select max(count(*)) 
from ����, �󿵰� 
where ����.�󿵰���ȣ=�󿵰�.�󿵰���ȣ 
and ��¥ like to_date('2020-09-01', 'yyyy-mm-dd')
group by �󿵰�.��ȭ����);

--��ȭ ���� 10% �λ�
Update �󿵰� 
set ����=����*1.1;