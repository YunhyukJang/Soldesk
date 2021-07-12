package pk22;

public class Thread_Main implements Runnable {
	@Override
	public void run() {
		System.out.println("run()");
		
		first();
	}
	
	public void first() {
		System.out.println("first()");
		
		second();
	}
	
	public void second() {
		System.out.println("second()");
	}

	public static void main(String[] args) {
		//메인 클래스가 실행된 후에 쓰레드의 객체를 호출하고 start()를 사용하여 run()이 호출된다.
		System.out.println("Main class start");
		
		Thread_Main t1=new Thread_Main();
		Thread mThread=new Thread(t1);
		
		mThread.start(); //run() 호출
		
		System.out.println("Main class end");
	}
}
