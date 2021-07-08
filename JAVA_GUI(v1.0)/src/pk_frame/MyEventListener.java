package pk_frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class MyEventListener implements WindowListener {
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(null, "프로그램 종료");
		
		System.out.println("X 버튼 클릭");
		
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래대로 돌아옴");
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
}
