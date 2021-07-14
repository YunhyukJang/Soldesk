--���� ����
create user movie identified by 12341234;

--���� �߰�
alter user movie account unlock;

--���� ��й�ȣ ���� *system or sys
alter user movie identified by 12341234;

/*
sys �� system �������� ����
1. cmd â���� sqlplus ����
2. ����ڸ� �Է�:sys as sysdba
3. ��й�ȣ �Է�:
4. alter user sys identified by 12341234; *��й�ȣ ����
5. conn sys/12341234 as sysdba
*/

--���� ����
grant connect, resource to movie;
grant create table, create view, create sequence, 
create procedure, create session to movie;

--���� ����
drop user movie;

drop user movie cascade;

--���� ����(DML ���� �ο�)
grant select on Employee to movie;
grant insert on Employee to movie;
grant delete on Employee to movie;
grant update on Employee to movie;

--�� ���� ���� ����
grant select, insert, delete, update on Employee to movie;

--���� ����(DML ���� ����)
revoke select on Employee from movie;
revoke insert on Employee from movie;
revoke delete on Employee from movie;
revoke update on Employee from movie;

--�� ���� ���� ����
revoke select, insert, delete, update on Employee from movie;