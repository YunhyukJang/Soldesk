package pk_frame;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
