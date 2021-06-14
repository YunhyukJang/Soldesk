package Exam;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		//두 수를 입력받아 최소공배수를 구하라
		int num1=0;
		int num2=0;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫 번째 숫자:");
		num1=sc.nextInt();
		System.out.println("두 번째 숫자:");
		num2=sc.nextInt();
		
		int i=0;
		
		for(i=1; i <= num1*num2; i++) {
			if(i%num1==0 && i%num2==0) {
				break;
			}
		}
		
//		while(true) {
//			i++;
			
//			if(i%num1==0 && i%num2==0) {
//				break;
//			}
			
//		}
		
		System.out.println("최소공배수="+i);
	}
}
