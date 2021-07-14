package exam;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/*
		 * Scanner를 통해 정수 n을 입력받는다. 
		 * 그리고 1부터 입력받은 정수 n까지의 합을 계산하여 그 결과를 출력하라
		 */
		int result=0; //1부터 n까지의 합
		
		System.out.println("숫자를 입력하세요:");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			result += i;
		}
		
		System.out.println("1부터 "+n+"까지의 합="+result);
	}
}
