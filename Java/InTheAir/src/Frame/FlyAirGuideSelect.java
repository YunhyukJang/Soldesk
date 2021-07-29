package Frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import FlyVO.FlyAirGuideDAO;
import FlyVO.FlyChoiceAirGuide;
import FlyVO.FlyFrameAirGuideInfo;


public class FlyAirGuideSelect extends JPanel{//로그인 성공시
	private Image back;
	public FlyAirGuideSelect(){
		
		JPanel p = new JPanel();
		setLayout(null);
		ImageIcon travel1 = new ImageIcon("공항정보.png");//공항정보 이미지 추가
		JButton btntravel1 = new JButton(travel1);
		btntravel1.setName("공항정보");

		btntravel1.setSize(235,295);
		btntravel1.setLocation(35,30);
		add(btntravel1);
		
		btntravel1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyChoiceAirGuide city1 = new FlyAirGuideDAO().searchcity("<공항정보>");
				FlyFrameBase.getInstance(new FlyFrameAirGuideInfo(city1));
			}
		});
		
		ImageIcon travel2 = new ImageIcon("체크인정보.png");//체크인 이미지 추가
		JButton btntravel2 = new JButton(travel2);
		btntravel2.setName("체크인정보");

		btntravel2.setSize(235,295);
		btntravel2.setLocation(310,30);
		add(btntravel2);

		btntravel2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FlyChoiceAirGuide city2 = new FlyAirGuideDAO().searchcity("<체크인정보>");
				FlyFrameBase.getInstance(new FlyFrameAirGuideInfo(city2));
			}
		});
		
		ImageIcon travel3 = new ImageIcon("라운지정보.jpg");//라운지 이미지 추가
		JButton btntravel3 = new JButton(travel3);
		btntravel3.setName("라운지");

		btntravel3.setSize(235,295);
		btntravel3.setLocation(35,340);
		add(btntravel3);

		btntravel3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FlyChoiceAirGuide city3 = new FlyAirGuideDAO().searchcity("<라운지>");
				FlyFrameBase.getInstance(new FlyFrameAirGuideInfo(city3));
			}
		});
		
		ImageIcon travel4 = new ImageIcon("환승절차.png");//환승절차 이미지 추가
		JButton btntravel4 = new JButton(travel4);
		btntravel4.setName("환승절차");

		btntravel4.setSize(235,295);
		btntravel4.setLocation(310,340);
		add(btntravel4);

		btntravel4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FlyChoiceAirGuide city4 = new FlyAirGuideDAO().searchcity("<환승절차>");
				FlyFrameBase.getInstance(new FlyFrameAirGuideInfo(city4));
			}
		});
    
    
    
		add(p);
	
		setLayout(null);
		setSize(600,800);
		setVisible(true);
		
		
	
		
		JButton btnBack = new JButton("뒤로가기");
			
		btnBack.setBackground(new Color(0xF6F6F6));
		btnBack.setSize(170, 70);
		btnBack.setLocation(15, 680);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		add(btnBack);
		/*
		btnBack.setSize(183, 87);
		btnBack.setLocation(0, 0);
		btnBack.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		
		btnBack.setBackground(new Color(0x99ccff));
		*/
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			FlyFrameBase.getInstance(new FlyFrameBegin("soldesk"));
			}
		});
	
	
		//창화면 그림 넣기
		setLayout(null);
	  	
		back=Toolkit.getDefaultToolkit().getImage("backg2.jpg");
		
	}
	 public void paintComponent(Graphics g)
	    {
	        g.drawImage(back,0,0,getWidth(),getHeight(),this);
	    }
		
}