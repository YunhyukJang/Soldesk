package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		//변수 선언
		String select="";
		int money=0;
		
		//객체 선언
		Vending vend=new Vending();
		vend.init(); //음료수 셋팅 완료
		
		//입력받아 showCans 호출
		System.out.print("돈을 투입하세요 -> ");
		
		Scanner sc=new Scanner(System.in);
		money=sc.nextInt();
		
		vend.showCans(money);
		
		//outCans 호출
		System.out.println("음료를 선택하세요 -> ");
		
		select=sc.next();
		
		vend.outCans(select);
	}
}
