package pk10;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		System.out.print("관광객 수:");
		
		Scanner sc=new Scanner(System.in);
		
		int people=sc.nextInt();
		
		//초기화되면서 메모리 확보 및 객체 생성(Guide에서 Guest의 객체 생성)
		Guide travel=new Guide(people);
		
		System.out.println("관광객 등록");
		
		for(int i=0; i<people; i++) {
			System.out.print((i+1)+". 이름:");
			String name=sc.next();
			travel.guest[i].setgName(name);
			System.out.print((i+1)+". 성별:");
			String gender=sc.next();
			travel.guest[i].setgGender(gender);
			System.out.println("--------------------");
		}
		
		outer:while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.println("선택 >> ");
			int menu=sc.nextInt();
			
			switch(menu) {
				case 1:
					for(int i=0; i<travel.guest.length;) {
						System.out.println((i+1)+". 이름:"+travel.guest[i].getgName());
						System.out.println((i+1)+". 성별:"+travel.guest[i].getgGender());
						System.out.println((i+1)+". 목적지:"+travel.guest[i].getPoint());
						System.out.println("--------------------");
						
						i++;
					}
				
				break;
				
				case 2:
					System.out.println("어디로 변경하시겠습니까? >> ");
					
					Guide.point=sc.next();
				break;
					
				case 3:
					System.out.println("프로그램 종료");
					
				break outer;
			}
			
		}
	}
}
