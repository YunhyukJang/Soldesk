package business;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		CompanyService comService=new CompanyService();
		
		outer:while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1. 사원정보 입력");
			System.out.println("2. 사원정보 개별 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("-> ");
			
			int menu=sc.nextInt();
			
			switch(menu) {
				case 1:
					comService.insertMember();
					
					break;
				case 2:
					comService.searchMember();
					
					break;
				case 3:
					System.out.println("프로그램 종료");
					System.exit(0);
			}
			
		}
	}
}
