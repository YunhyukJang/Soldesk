package pk5;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("값 입력:"));
		
		if(dat%10 == 0) {
			System.out.println(dat+"은(는) 10의 배수 입니다.");
		}else {
			System.out.println(dat+"은(는) 10의 배수가 아닙니다.");
		}
	}
}
