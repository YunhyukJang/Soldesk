package pk7;

import java.util.Scanner;

public class MethodTest {
	
	void makebread(int count) {
		System.out.println("주문할 빵 갯수:");
		count=sc.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 빵이 만들어지고 있다.");
		}
		
		System.out.println(count+"개의 빵이 완성되었다!!");
	}
	
	void makebread(int count, String bread) {
		System.out.println("빵 갯수:");
		count=sc.nextInt();
		System.out.println("빵 이름:");
		bread=sc.next();
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 "+bread+"빵이 만들어지고 있다.");
		}
		
		System.out.println(count+"개의 "+bread+"빵이 완성되었다!!");
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void order() {
		while(true) {
			System.out.println("1. 빵 갯수만 선택 | 2. 빵 갯수와 종류 선택 | 3. 종료");
			
			System.out.println("선택 > ");
			int select=sc.nextInt();
			
			if(select == 1) {
				MethodTest bread1=new MethodTest();
				
				bread1.makebread(0);
			}else if(select == 2) {
				MethodTest bread2=new MethodTest();
				
				bread2.makebread(0, null);
			}else if(select == 3) {
				System.out.println("프로그램 종료");
				
				break;
			}
		}
	}
}
