package MoreShapes;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoreShapes extends JFrame{
	public MoreShapes() {
		super("park minwoo");
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 400,
				600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new MyShapePanel();
		add(panel);
		setVisible(true);
		
		
		
	}
	

}
