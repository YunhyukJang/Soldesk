package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		//숫자 야구 게임
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		}while(com1 == com2 || com1 == com3 || com2 == com3);
		
		int user1=0;
		int user2=0;
		int user3=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1~9사이의 숫자를 입력하세요.");
			System.out.print("첫 번째 숫자를 입력하세요:");
			user1=sc.nextInt();
			System.out.print("두 번째 숫자를 입력하세요:");
			user2=sc.nextInt();
			System.out.print("세 번째 숫자를 입력하세요:");
			user3=sc.nextInt();
			
			int strike=0;
			int ball=0;
			
			if(user1 == com1) {
				strike++;
			}else if(user1 == com2 || user1 == com3) {
				ball++;
			}
			
			if(user2 == com2) {
				strike++;
			}else if(user2 == com1 || user2 == com3) {
				ball++;
			}
			
			if(user3 == com3) {
				strike++;
			}else if(user3 == com1 || user3 == com2) {
				ball++;
			}
			
			if(strike == 3) {
				System.out.println("WIN!! 첫 번째 숫자:"+com1+" 두 번째 숫자:"+com2+" 세 번째 숫자:"+com3);
				
				break;
			}else {
				if(strike>0 || ball>0) {
					System.out.println(strike+" Strike "+ball+" Ball");
				}else {
					System.out.println("OUT!!");
				}
			}
		}
	}
}
