package pk10;

import javax.swing.JOptionPane;

public class FinalTest {
	private static final int MAX=3;

	public static void main(String[] args) {
		int num;
		
		for(int i=0; i<MAX; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값"));
			
			if(num>MAX) {
				System.out.println("입력값이 3보다 큽니다.");
			}else {
				System.out.println("입력값이 3보다 크지 않습니다.");
			}
			
		}
	}
}
