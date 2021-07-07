package pk22;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account acc=new Account();
		Runnable r=new AccountThread(acc);
		Thread t=new Thread(r);
		
		t.start();
		
		while(true) {
			System.out.println("출금 중입니다.");
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			
			acc.deposit(n);
		}
	}
}
