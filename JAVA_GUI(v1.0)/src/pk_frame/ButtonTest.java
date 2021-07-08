package pk_frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f=new Frame("버튼 테스트");
		
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null); //자동 배치 끄기
		
		//사용자 정의로 위치와 크기 결정
		Button btnOk=new Button("확인");
		
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose=new Button("닫기");
		
		btnClose.setBounds(btnOk.getBounds());
		
		//겹치는 버튼 분리
		btnClose.setLocation(btnOk.getWidth()+btnOk.getX()+60, btnOk.getY());
		
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
