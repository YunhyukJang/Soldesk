package exam;

import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		int menu;
		int money;
		
		UserInfo bank=new UserInfo();
		
		outer:while(true) {
			System.out.println("1. 입 금");
			System.out.println("2. 출 금");
			System.out.println("3. 잔액 확인");
			System.out.println("4. 종료");
			System.out.println("원하시는 메뉴를 선택하세요. -> ");
			
			Scanner sc=new Scanner(System.in);
			
			menu=sc.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("-- 입 금 --");
					System.out.print("입금할 금액을 입력 : ");
					money=sc.nextInt();
					
					bank.deposit(money);
					
					break;
				case 2:
					System.out.println("-- 출 금 --");
					System.out.print("출금할 금액을 입력 : ");
					money=sc.nextInt();
					
					bank.withdraw(money);
					
					break;
				case 3:
					System.out.println("-- 잔액 확인 --");
					System.out.println(bank.showMoney()+"원");
					
					break;
				default:
					System.out.println("-- 종 료 --");
					
					break outer;
			}
			
			System.out.println("------------------------------");
		}
	}
}
