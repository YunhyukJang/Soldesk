--�����͸� �����ϴ� ������ ��ġ=�ϵ��ũ
--����Ŭ������ �ý��� ��� �ʿ��� �����ͺ��̽��� �⺻ ������ ����Ǵ� ���� ������ �ʿ���
--�̸� TableSpace��� ��
create tablespace md_tbs 
datafile 'C:\Web Development\MADANG\oData\md_tbs_data01.dbf' 
size 10m;

create tablespace md_test 
datafile 'C:\Web Development\MADANG\oData\md_test_data01.dbf' 
size 10m;

--����
create user mdguest identified by mdguest 
default tablespace md_tbs;

grant connect, resource to mdguest;

--��ȸ
Select * 
from sys.dba_tablespaces;

--�̸�, ����, �⺻ ���
Select tablespace_name, status, contents 
from sys.dba_tablespaces;

--�뷮
Select * 
from sys.dba_data_files;

--���� ����
Select * 
from sys.dba_free_space;

--���� *������ ���ϱ��� ��� ����
drop tablespace md_tbs including contents and datafiles;