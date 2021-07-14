package pk_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest1_Br {

	public static void main(String[] args) {
		Frame frame=new Frame("Basic");
		
		//버튼 객체 배열로 준비
		Button[] arrbtn=new Button[5];
		String[] btnTitle={"닫기", "열기", "취소", "확인", "안녕"};
		
		for(int i=0; i<arrbtn.length; i++) {
			arrbtn[i]=new Button(btnTitle[i]);	
		}
		
		//Frame도 BorderLayout과 같이 위치 선정이 가능
		frame.add(arrbtn[0], BorderLayout.EAST);
		frame.add(arrbtn[1], BorderLayout.WEST);
		frame.add(arrbtn[2], BorderLayout.SOUTH);
		frame.add(arrbtn[3], BorderLayout.NORTH);
		frame.add(arrbtn[4], BorderLayout.CENTER);
		
		//Frame에 내용이 있을 때 그 내용만큼만 영역 확보
		frame.pack();
		frame.setVisible(true);
		
		//EAST에 위치한 닫기 버튼 기능 구현
		arrbtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		//Window 자체 X 버튼 기능 구현
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
