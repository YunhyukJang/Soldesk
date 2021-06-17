package exam;

import java.util.Scanner;

public class Example13Main {

	public static void main(String[] args) {
		Example13 ws=new Example13();
		
		//정답 반환 메서드 호출
		String answer=ws.getAnswer(); 
		
		//가져온 단어를 섞어서 변수에 넣기 즉 문제 생성
		String question=ws.getScrambledWord(answer);
		
		//문제 출력
		System.out.println("문제:"+question);
		
		while(true) {
			System.out.print("단어는? -> ");
			
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			
			if(str.equalsIgnoreCase(answer)) {
				System.out.println(str+" 정답!!");
				
				break;
			}else {
				System.out.println(str+" 오답..");
			}
			
		}
	}
}
