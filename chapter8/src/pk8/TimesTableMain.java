package pk8;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {		
		TimesTable time=new TimesTable();
		
		System.out.println("숫자를 입력하세요 -> ");
		
		Scanner sc=new Scanner(System.in);
		
		time.showTable(sc.nextInt());
	}
}
