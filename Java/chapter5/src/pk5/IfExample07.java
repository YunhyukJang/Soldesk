package pk5;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값 1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값 2"));

		/*
		 * num1이 num2보다 크면 "num1이 더 큽니다." 
		 * num2이 num1보다 크면 "num2가 더 큽니다." 
		 * "두 값이 같습니다."
		 */
		
		if(num1>num2) {
			System.out.println(num1+"이(가) 더 큽니다.");
		}else if(num2>num1){
			System.out.println(num2+"이(가) 더 큽니다.");
		}else {
			System.out.println("두 값이 같습니다.");
		}
	}
}
