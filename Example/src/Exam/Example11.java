package Exam;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		/*
		 * 학생들의 수학, 영어성적을 등록하는 프로그램이 있다. 
		 * 프로그램을 실행하면 몇 명의 정보를 저장할 것인지를 입력받은 후 
		 * 입력받은 수 만큼 학생들의 이름과 수학, 영어성적을 입력받는 프로그램을 구현하라
		 */
		int math=0;
		int eng=0;
		String name=null;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("등록할 인원수:");
		int n=sc.nextInt();
		
		String str[][]=new String[n][3];
		
		for(int i=0; i<str.length; i++) {
			System.out.print("이름:");
			str[i][0]=sc.next();
			
			System.out.print("수학:");
			str[i][1]="수학:"+sc.next();
			
			System.out.print("영어:");
			str[i][2]="영어:"+sc.next();
			
			System.out.println("--------------------");
			}
		
		System.out.println(str.length+"명 등록 완료!!");
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j]+" ");
			}
			
			System.out.println();
		}	
	}
}
