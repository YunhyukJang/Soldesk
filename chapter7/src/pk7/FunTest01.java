package pk7;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	public static void sum(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}

	public static void main(String[] args) {
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값 1:"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값 2:"));
		
		sum(num1, num2);
	}
}
