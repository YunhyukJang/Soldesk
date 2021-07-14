package pk_frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		Frame f=new Frame();
		
		f.setLayout(null);
		f.setBounds(500, 100, 512, 512);
		
		//이미지
		ImageIcon img=new ImageIcon("jjanggu.jpg");
		
		JLabel ji=new JLabel(img);
		
		ji.setBounds(10, 30, 500, 500);
		
		f.add(ji);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
