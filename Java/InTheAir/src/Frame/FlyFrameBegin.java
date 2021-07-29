package Frame;

import java.awt.Color;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import FlyVO.FlyPlace;
import FlyVO.FlyPlaceDAO;
import FlyVO.FlyPlaneDAO;
import FlyVO.Flydata;

public class FlyFrameBegin extends JPanel implements test1{//로그인 성공시 메인메뉴
	public FlyFrameBegin(String id){
		
		setLayout(null);
		JPanel p = new JPanel();
		
		//하단 버튼 설정
	    JButton j1 = new JButton("공항안내");
	    JButton j2 = new JButton("예매");
	    JButton j3 = new JButton("마이페이지");
	    add(j1);
	    add(j2);
	    add(j3);
	    
	    //j1.setBounds(0, 660, 195, 100); // 포인트좌우 , 위아래, 창크기 좌우 위아래
	    //j2.setBounds(195, 660, 195, 100);
	    //j3.setBounds(385, 660, 200, 100);
	    
	    //버튼컬러
	    //.setBackground(new Color(0x99ccff));
	    //j2.setBackground(new Color(0x99ccff));
	    //j3.setBackground(new Color(0x99ccff));
	    
	    j1.setBackground(new Color(0xF6F6F6));
	    j1.setSize(170, 70);
	    j1.setLocation(15, 680);
	    j1.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
	    

		
	    j2.setBackground(new Color(0xF6F6F6));		
	    j2.setSize(170, 70);
	    j2.setLocation(208, 680);
	    j2.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
	    
	    j3.setBackground(new Color(0xF6F6F6));
	    j3.setSize(170, 70);
	    j3.setLocation(400, 680);
	    j3.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
	    
	    
	    //이미지 넣기
		ImageIcon inAir = new ImageIcon("menu5.jpg");
		JLabel lblinAir = new JLabel(inAir);
		lblinAir.setBounds(0, 0, 600, 800);
		add(lblinAir);
		
		Font font= new Font("맑은 고딕",Font.PLAIN,25);
		Font font1= new Font("맑은 고딕",Font.PLAIN,25);
		//j1.setFont(font1);
		//j2.setFont(font);
		//j3.setFont(font);
		
		
	    add(p);
		setSize(600,800);
		setVisible(true);
	
	j1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JComponent comp = (JComponent) e.getSource();
			Window win = SwingUtilities.getWindowAncestor(comp);
			FlyFrameBase.getInstance(new FlyAirGuideSelect());
			win.dispose();
			
		}
	});
	
	j2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// 예매 페이지로 넘겨
			test1.test.clear();
			FlyPlace sf=new FlyPlaceDAO().searchPlace("괌");
			JComponent comp = (JComponent) e.getSource();
			Window win = SwingUtilities.getWindowAncestor(comp);
			FlyFrameBase.getInstance(new FlyGuam(sf));
			win.dispose();
		}
	});
	
	j3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {			//
			Flydata data=new FlyPlaneDAO().searchdata(id);			
			JComponent comp = (JComponent) e.getSource();
			Window win = SwingUtilities.getWindowAncestor(comp);
			FlyFrameBase.getInstance(new FlyplaneMypage(data));
			win.dispose();
		}
	});
	
	
	
	}
}