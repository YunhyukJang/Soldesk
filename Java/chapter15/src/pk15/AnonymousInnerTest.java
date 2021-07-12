package pk15;

class Outer2{
	Runnable getRunnable(int i) {
		int num=100;
		
		//클래스명이 생략됨
		//class Inner{}
		
		//익명의 클래스
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
			
		};
		
	}
	
	//익명의 클래스
	Runnable runner=new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 재구현됨");
		}
		
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 outer2=new Outer2();
		
		Runnable runnerable=outer2.getRunnable(10);
		
		runnerable.run();
		
		outer2.runner.run();
	}
}
