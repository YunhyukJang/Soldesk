package exam;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		//두 수를 입력받아 최대공약수를 구하라	
		int num1=0;
		int num2=0;
		int min=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫 번째 숫자:");
		num1=sc.nextInt();
		System.out.println("두 번째 숫자:");
		num2=sc.nextInt();
		
		if(num1 >= num2) {
			min=num2;
		}else {
			min=num1;
		}
		
		int i=0;
		
		for(i=min; i >= 1; i--) {
			if(num1%i==0 && num2%i==0) {
				break;
			}
		}
		
		if(i == 1) {
			System.out.println("최대공약수가 존재하지 않습니다.");
		}else {
			System.out.println("최대공약수="+i);
		}
	}
}
