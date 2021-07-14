package exam;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다. 
		 * 입력받은 문자열의 소문자 a가 몇 개나 있는지를 판별하는 로직을 구현하라
		 */
		String str="";
		int count=0;
		
		System.out.println("문자열을 입력하세요:");
		
		Scanner sc=new Scanner(System.in);
		
		str=sc.next();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
			
		}
		
		System.out.println("a의 갯수는 "+count+"개");
	}
}
