package BasicPaint;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	
	public MyPanel() {
		//필요한 초기화 기능 설정
		setBorder(BorderFactory.createLineBorder(Color.pink));
	
		
	}
	
	public void paintComponent(Graphics g){
		
	g.drawRect(50, 50, 50, 50);
	g.drawOval(200,50,50,50);
		
	}
	
	
	

}
