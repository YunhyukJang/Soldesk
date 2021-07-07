package pk22;

public class Account {
	int balance=1000;
	
	//출금 메서드
	//synchronized:자원을 공유하지 않음(작업하는 동안 동시 접속 불가능)
	public synchronized void withdraw(int money) {
		//잔액이 출금 금액보다 적을 경우
		if(balance < money) {
			try {
				wait(); //일시정지 쓰레드
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		balance -= money;
	}
	
	public synchronized void deposit(int money) {
		balance += money;
		
		notify(); //일시정지 쓰레드
	}
}
