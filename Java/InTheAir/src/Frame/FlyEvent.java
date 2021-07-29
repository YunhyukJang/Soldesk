package Frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FlyEvent extends JPanel{
	private Image back;
	private ImageIcon Roulette;
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();
	
	
	public FlyEvent() {
		
		//	//JPanel 기본 구조
		back=Toolkit.getDefaultToolkit().getImage("fly.jpg");
		setLayout(null);
		setSize(600,800);
		
		JLabel Et=new JLabel("이벤트 페이지");
		
		Et.setFont(new Font("굴림", Font.BOLD, 25));
		Et.setBounds(225, -25, 200, 150);
		
		
		
		add(Et);
		

		Roulette=new ImageIcon("Roulette2.png");
		Image Ro=Roulette.getImage();
		Image Ro1=Ro.getScaledInstance(380, 380, Image.SCALE_DEFAULT);
		ImageIcon Roulette2=new ImageIcon(Ro1);
		JLabel img=new JLabel(Roulette2);
		img.setBounds(110, 100, 380, 380);
		add(img);
		
		Shape s;
		
		s=new Arc2D.Float(220, 100, 160, 160, 45, 90, Arc2D.PIE);
		
		
		
		
		
		
		
		
		JButton btnHome = new JButton("Home");
		
		btnHome.setBackground(Color.white);
		btnHome.setSize(150, 30);
		btnHome.setLocation(225, 690);
		btnHome.setFont(new Font("나눔고딕", Font.BOLD, 20));
		
		/*btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FlyFameBase.getinstance(new ?????()) 
			
			}
		});
		 */
		add(btnHome);
		
	}
	
	//배경 이미지 관련
		 public void paintComponent(Graphics g)
		    {
		        g.drawImage(back,0,0,getWidth(),getHeight(),this);
		    }
		 


}
