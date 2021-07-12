package pk14;

import javax.swing.JOptionPane;

public class WrapperTest {

	public static void main(String[] args) {
		String str1="";
		String str2="";
		double num1, num2; //자료형
		char ch=65; //자료형
		
		//Unboxing
		num1=Double.parseDouble(JOptionPane.showInputDialog("값 1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("값 2"));
		
		if(num2 != 0) {
			System.out.println(num1/num2);
		}
		
		//Boxing
		if(Character.isDigit(ch)) {
			System.out.println(ch+"는 문자가 아닙니다.");
		}else {
			System.out.println(ch+"는 숫자입니다.");
		}
	}
}
