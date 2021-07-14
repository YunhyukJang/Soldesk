package pk22;

public class DaemonMain implements Runnable {
	//문서 작성 도중 3초 간격으로 자동 저장 기능이 필요하다고 가정하고 구현
	static boolean autoSave=false;
	
	@Override
	public void run() {
		while(true) {
			try{
				Thread.sleep(3000);	
			}catch(Exception e) {
				System.out.println(e);
			}
			
			if(autoSave == true) {
				System.out.println("자동 저장 기능 수행");
			}
			
		}
	}

	public static void main(String[] args) {
		//데몬 쓰레드는 일반 쓰레드를 돕는 보조적인 역할을 수행한다.
		//함께 구동중이던 일반 쓰레드가 종료되면 데몬 쓰레드도 자동 종료된다.
		DaemonMain dm=new DaemonMain();
		
		//t 객체는 쓰레드가 데몬 쓰레드임을 명시
		Thread t=new Thread(dm);
		
		//Main 쓰레드가 종료될 때 같이 종료
		t.setDaemon(true);
		
		//run() 실행
		t.start();
		
		for(int i=1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println(i);
			
			if(i == 3) {
				autoSave=true;
			}
			
		}
	}
}
