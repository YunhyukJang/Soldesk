package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		//기본 생성자로 객체를 만들되 객체의 이름은 R1(Move 2, RAge)
		ThisTest R1=new ThisTest();
		
		R1.Move();
		R1.Move();
		R1.RAge();
		
		System.out.println("===객체 2===");
		//swing으로 입력을 받아 로봇의 속도와 나이, 이름, 로봇 번호를 출력하라
		int rSpeed=Integer.parseInt(JOptionPane.showInputDialog("속도"));
		int rAge=Integer.parseInt(JOptionPane.showInputDialog("나이"));
		String rName=JOptionPane.showInputDialog("이름");
		String rNum=JOptionPane.showInputDialog("로봇 번호");
		
		ThisTest R2=new ThisTest(rSpeed, rAge, rName , rNum);
		
		System.out.println("속도="+rSpeed);
		System.out.println("나이="+rAge);
		System.out.println("이름="+rName);
		System.out.println("로봇 번호="+rNum);
		
		//ThisTest의 모든 메서드 사용
		R2.Move();
		R2.Stop();
		R2.RAge();
		R2.RName();
		R2.RNum();
	}
}
