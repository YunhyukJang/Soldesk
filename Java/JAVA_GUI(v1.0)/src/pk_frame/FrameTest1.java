package pk_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest1 {

	public static void main(String[] args) {
		Frame frame=new Frame("첫 번째 프레임"); //프레임의 제목
		
		frame.setBounds(800, 100, 400, 300); //setBounds(x 좌표, y 좌표, 너비, 높이);
		
		System.out.println(frame.getBounds().getWidth()); //가로(double)
		System.out.println(frame.getBounds().height); //세로(int)
		
		frame.setBackground(Color.BLUE); //배경색
		frame.setVisible(true); //false는 화면에 보이지 않음.
	}
}
