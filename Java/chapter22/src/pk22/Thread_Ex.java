package pk22;

public class Thread_Ex extends Thread {
	private int[] temp;
	
	public Thread_Ex() {
		temp=new int[10];
		
		for(int i=0; i<temp.length; i++) {
			temp[i]=i;
		}
		
	}

	@Override
	public void run() { //Thread class에서는 Thread를 작동하기 위해서 반드시 run() 호출이 있어야 한다.
		for(int i:temp) {
			try {
				Thread.sleep(1000); //1초 대기
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("temp:"+temp[i]);
		}
		
	}
}
