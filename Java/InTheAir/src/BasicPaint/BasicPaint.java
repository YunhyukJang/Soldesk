package BasicPaint;

import java.awt.Color;

import javax.swing.JFrame;



public class BasicPaint extends JFrame {
	public BasicPaint(String msg) {
		super(msg);
		java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
		add(new MyPanel());
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 400,
				600, 800);
		setBackground(Color.pink);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
