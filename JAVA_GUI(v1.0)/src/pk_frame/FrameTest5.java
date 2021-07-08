package pk_frame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest5 {

	public static void main(String[] args) {
		MyFrame fr=new MyFrame();
		
		fr.setBackground(Color.RED);
		fr.setTitle("다섯 번째");
		
		//방법 1.
		fr.addWindowListener(new MyEventListener());
		
		//방법 2.
		//fr.addWindowListener(new WinClosingListener());
		
		//방법 3.
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
