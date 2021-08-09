package algorithm;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		
		System.out.print("두 자리 숫자를 입력하세요.");
		
		do {
			System.out.print("입력 -> ");
			
			num=sc.nextInt();
		}while(num<10 || num>99);
		
		System.out.println("두 자리 숫자는 "+num+"입니다.");
	}
}
