package Exam;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		//수를 입력받아 소수인지 아닌지 판별하라
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		num=sc.nextInt();
		
		int i=0;
		
		for(i=2; i <= num; i++) {
			if(num%i == 0) {
				break;
			}
		}
		
		if(i == num) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
