package pk15;

class Outer{
	//외부 필드
	int outNum=100;
	static int sNum=200;
	
	//java.lang.Thread # run()
	//Runnable은 매개 변수(int i)와 지역 변수를 final처럼 사용
	Runnable getRunnable(int i) {
		int num=100;
		
		class myRunnable implements Runnable{
			int localNum=10;
			
			@Override
			public void run() {
				//num=200; *Runnable이므로 상수로 바뀜
				//i=100; *Runnable이므로 매개 변수 역시 상수로 바뀜
				
				System.out.println("outNum="+outNum+" -> 외부 인스턴스");
				System.out.println("Outer.sNum="+Outer.sNum+" -> 외부 static 변수");
				System.out.println("i="+i);
				System.out.println("num="+num);
				System.out.println("localNum="+localNum);
			};
			
		}
		
		return new myRunnable();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		Outer out=new Outer();
		
		Runnable runner=out.getRunnable(10);
		
		//Runnable에 getRunnable이 사용했던 매개 변수 메서드는 소멸
		runner.run();
	}
}
