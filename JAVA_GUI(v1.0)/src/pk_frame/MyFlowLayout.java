package pk_frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {
	Frame f=new Frame();
	
	Button jb1=new Button("버튼 1");
	Button jb2=new Button("버튼 2");
	Button jb3=new Button("버튼 3");
	Button jb4=new Button("버튼 4");
	Button jb5=new Button("버튼 5");
	Button jb6=new Button("버튼 6");
	
	public MyFlowLayout() {
		f.setLayout(new FlowLayout()); //Frame을 FlowLayout으로 set
		
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		f.add(jb4);
		f.add(jb5);
		f.add(jb6);
		
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
		new MyFlowLayout();
	}
}
