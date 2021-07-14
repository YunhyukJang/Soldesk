package pk5;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		//로그인
		Scanner scan=new Scanner(System.in);
		
		System.out.print("아이디:");
		String ID=scan.nextLine();
		
		System.out.println("비밀번호:");
		String PW=scan.nextLine();
		
		//비밀번호 형 변환(String->int)
		int pass=Integer.parseInt(PW);
		
		if(ID.equals("YUNHYUK")) {
			if(pass == 1004) {
				System.out.println("로그인 성공!!");
			}else {
				System.out.println("비밀번호가 맞지 않습니다.");
			}			
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
	}
}
