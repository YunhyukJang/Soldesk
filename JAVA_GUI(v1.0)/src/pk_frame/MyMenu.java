package pk_frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Print SetUp")) {
			System.out.println("Print SetUp!");
		}else if(e.getActionCommand().equals("Close")) {
			System.out.println("Close.");
			
			System.exit(0);
		}
		
	}
}
