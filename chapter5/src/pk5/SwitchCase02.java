package pk5;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		/*
		 * 1. 예금 조회 
		 * 2. 출금 
		 * 3. 입금 
		 * 그 외
		 */
		
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("번호 입력"));
		
		switch(num) {
			case 1:System.out.println("1. 예금 조회");
			break;
			
			case 2:System.out.println("2. 출금");
			break;
			
			case 3:System.out.println("3. 입금");
			break;
			
			default:System.out.println("잘못된 번호입니다.");
		}
	}
}
