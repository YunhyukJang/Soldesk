package pk22;

public class ThreadMain {

	public static void main(String[] args) {
		//has a
		ThreadEx t=new ThreadEx();
		
		t.start(); //run() 메서드가 호출
		//t.run(); //t.run()은 일반 메서드이므로 독립적으로 실행할 수 없음
		//*run()을 독립적인 Thread로 실행하고 싶다면 t.start()로 호출해야 한다.
		
		System.out.println("main");
	}
}
