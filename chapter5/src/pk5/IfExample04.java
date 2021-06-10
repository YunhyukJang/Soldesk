package pk5;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		int age=9;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이:"));
		
		if(age<8) {
			charge=1000;
			
			System.out.println("미취학 아동입니다.");
		}else if(age<14) {
			charge=2000;
			
			System.out.println("초등학생입니다.");
		}else if(age<20) {
			charge=2500;
			
			System.out.println("청소년입니다.");
		}else {
			charge=3000;
			
			System.out.println("성인입니다.");
		}
		System.out.println(charge+"원 입니다.");
	}
}
