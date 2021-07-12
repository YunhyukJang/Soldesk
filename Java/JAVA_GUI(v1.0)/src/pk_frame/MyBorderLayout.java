package pk_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBorderLayout {
	Frame f=new Frame();
	
	Button jb1=new Button("북");
	Button jb2=new Button("서");
	Button jb3=new Button("중앙");
	Button jb4=new Button("동");
	Button jb5=new Button("남");
	Button jb6=new Button("버튼 6");
	
	public MyBorderLayout() {
		f.setLayout(new BorderLayout());
		
		//버튼 추가 시 배치 위치 설정
		f.add(jb1, BorderLayout.NORTH);
		f.add(jb2, BorderLayout.WEST);
		f.add(jb3, BorderLayout.CENTER);
		f.add(jb4, BorderLayout.EAST);
		f.add(jb5, BorderLayout.SOUTH);
		f.add(jb6, "Center");
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	

	public static void main(String[] args) {
		new MyBorderLayout();
	}
}
