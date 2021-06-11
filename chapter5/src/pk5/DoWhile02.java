package pk5;

import javax.swing.JOptionPane;

public class DoWhile02 {

	public static void main(String[] args) {
		//doWhile문은 무조건 한번 실행하고 반복 시작됨
		int num1, num2;
		
		do {
			num1=Integer.parseInt(JOptionPane.showInputDialog("값 1"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("값 2"));
			
			if(num1 == num2) {
				System.out.println("Same!!");
				
				break;
			}
			
			System.out.println("Different!!");
		}while(num1 != num2);
	}
}
