package pk22;

public class Thread_Ex_Test {

	public static void main(String[] args) {
		//쓰레드
		Thread_Ex t1=new Thread_Ex();
		
		t1.start();
		
		try {
			Thread.sleep(2000); //2초 대기
			
			System.out.println("프로그램 종료");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
