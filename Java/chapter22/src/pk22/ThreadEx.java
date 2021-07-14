package pk22;

public class ThreadEx extends Thread {
	@Override
	public void run() {
		//프로세스의 독립적인 작업을 수행하는 영역
		for(int i=0; i<10; i++) {
			System.out.println("쓰레드 실행");
		}
		
	}
}
