--���� �б� uncommitted *������ �б⸸ ����
--uncommitted�� �̿��Ͽ� rollback�� �����ϵ��� ó���ϰ�
--���� �б⸦ �����Ѵ�.
set transaction isolation 
level read committed;

Select * 
from madang.users 
where id=1;