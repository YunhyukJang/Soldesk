package pk_frame;

import java.awt.Frame;

import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		JFrame fr=new JFrame("두 번째 프레임");
		
		fr.setSize(400, 400);
		fr.setLocation(800, 100);
		
		//X 버튼으로 프레임 닫기
		//프레임이 닫힐 때 메모리를 반납. 이 기능은 JFrame에서만 가능하다.
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
		//dispose()=여러 개의 프레임 중 원하는 프레임만 종료하고자 할 경우
		//System.exit();=열려있는 프레임의 수와 상관없이 강제로 JVM을 종료할 경우
	}
}
