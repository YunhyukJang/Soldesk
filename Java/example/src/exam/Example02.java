package exam;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * Scanner를 통해 정수 n1, n2를 입력받는다. 
		 * 그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하라
		 * 만약 큰 수가 n1에 입력되면 스왑을 이용하여 작은 수가 n1에 오도록 하라
		 */
		int result=0; //n1부터 n2까지의 합
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요:");
		int n1=sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요:");
		int n2=sc.nextInt();
		
		if(n1 > n2) {
			int n3=n1;
			n1=n2;
			n2=n3;
		}
		
		for(int i=n1; i <= n2; i++) {
			result += i;
		}
		
		System.out.println(n1+"부터 "+n2+"까지의 합="+result);	
	}
}
