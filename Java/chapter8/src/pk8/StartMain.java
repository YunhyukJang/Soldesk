package pk8;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		int answer=0;
		String check;
		
		Start game=new Start();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요 ->");
			answer=sc.nextInt();
			
			check=game.check(answer);
			
			if(check.equals("SUCCESS")) {
				break;
			}
			
		}
	}
}
