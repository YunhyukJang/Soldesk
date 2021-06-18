package pk9;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int area;
		String str="";
		
		Encapsulation en=new Encapsulation();
		
		side=Integer.parseInt(JOptionPane.showInputDialog("가로는?"));
		height=Integer.parseInt(JOptionPane.showInputDialog("세로는?"));
		
		area=en.Cal_Area(side, height);
		
		str="사각형의 넓이는 "+area+"입니다.";
		
		System.out.println("사각형의 넓이는 "+area+"입니다.");
		JOptionPane.showMessageDialog(null, str);
	}
}
