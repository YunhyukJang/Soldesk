package frame;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame {
	private static FrameBase instance;
	
	public FrameBase(JPanel jp) {
		Toolkit tk=Toolkit.getDefaultToolkit();
		
		setTitle("in the Air");
		setLayout(null);
		setBounds(((int)tk.getScreenSize().getWidth())/2-300, 
				((int)tk.getScreenSize().getHeight())/2-400, 
		600, 800);
		
		add(jp);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void getInstance(JPanel jp) {
		instance=new FrameBase(jp);
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(jp);
		instance.revalidate();
		instance.repaint();
	}
}
