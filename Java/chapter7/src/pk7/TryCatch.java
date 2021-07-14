package pk7;

import javax.swing.JOptionPane;

public class TryCatch {
	
	public static void main(String[] args) {
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값 1:"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값 2:"));
		
		try {
			System.out.println(num1/num2); //해당 작업을 구현
		} catch (ArithmeticException e) { //에러가 나면
			System.out.println("0을 입력하지 마세요."); //에러 시 수행될 행위
		}
		
		System.out.println("Error 후 컴파일 -> 프로그램 수행 끝");
	}
}
