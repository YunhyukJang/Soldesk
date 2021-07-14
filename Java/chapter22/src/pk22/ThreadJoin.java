package pk22;

public class ThreadJoin implements Runnable{
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
		System.out.println("Main class start");
		
		ThreadJoin t1=new ThreadJoin();
		
		//일반 클래스의 객체를 쓰레드로 생성
		Thread mThread=new Thread(t1);
		
		mThread.start(); //run()
		
		try {
			//run()이 완전히 작업을 마칠 때까지 main이 기다려준다.
			mThread.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Main class end");
	}
}
