package pk22;

public class Thread_Ex_Main {

	public static void main(String[] args) {
		Thread_Test1 t1=new Thread_Test1();
		Thread_Test2 t2=new Thread_Test2();
		
		//실행하면 쓰레드는 동시에 진행되거나 순서대로 진행되지 않고 번갈아 가면서 실행된다.
		t1.start();
		t2.start();
	}
}
