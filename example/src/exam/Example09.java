package exam;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		int studentNum=0;
		int[] score=null;
		int total=0;
		double avg=0.0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 -> ");
			
			int select=sc.nextInt();
			
			if(select == 1) {
				System.out.print("학생의 수를 입력하세요. -> ");
				
				studentNum=sc.nextInt();
			}else if(select == 2) {
				score=new int[studentNum];
				
				for(int i=0; i<score.length; i++) {
					
					System.out.print("점수를 입력하세요. -> ");
					score[i]=sc.nextInt();
				}
				
			}else if(select == 3) {
				for(int i=0; i<score.length; i++) {
					System.out.println(score[i]);	
				}
				
			}else if(select == 4) {
				for(int i=0; i<score.length; i++) {
					total += score[i];
				}
				
				avg=(double)total/studentNum;
				
				System.out.println("총점="+total);
				System.out.println("평균="+String.format("%.2f", avg));
				
			}else if(select == 5) {
				System.out.println("프로그램을 종료합니다.");
				
				break;
			}
		}
	}
}
