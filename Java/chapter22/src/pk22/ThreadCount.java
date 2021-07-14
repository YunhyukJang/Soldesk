package pk22;

import java.util.Scanner;

public class ThreadCount implements Runnable {
	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	
	@Override
	public void run() {
		for(int i=n; i>=0; i--) {
			try {
				System.out.println(i);
				
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		System.out.println("종료");
	}

	public static void main(String[] args) {
		/* 스캐너를 이용하여 키보드에서 숫자를 입력받고 
		 * 쓰레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을 때 
		 * "종료"라는 메시지와 함께 쓰레드를 빠져나오도록 하라. */
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자 입력 -> ");
		
		ThreadCount tc=new ThreadCount(sc.nextInt());
		Thread t=new Thread(tc);
		
		t.start();
	}	
}
