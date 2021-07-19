package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import vo.MyPlace;
import vo.Place;
import vo.PlaceDAO;

public class FrameAuckland extends JPanel {
	private Image backImg;
	
	public FrameAuckland() {
		Place sf=new PlaceDAO().searchPlace("오클랜드");
		
		FrameBase.getInstance(new FrameAuckland(sf));
	}
	
	public FrameAuckland(Place p) {
		backImg=Toolkit.getDefaultToolkit().getImage("비행2.jpg");
		
		setLayout(null);
		setSize(600, 800);
		
		//여행지 이미지
		ImageIcon iconAuckland1=new ImageIcon("오클랜드.jpg");
		ImageIcon iconAuckland2=new ImageIcon("헤헤.jpg");
		JButton btnAuckland1=new JButton(iconAuckland1);
		JButton btnAuckland2=new JButton(iconAuckland2);
		
		btnAuckland1.setSize(550, 355);
		btnAuckland1.setLocation(17, 12);
		btnAuckland1.setRolloverSelectedIcon(iconAuckland1);
		btnAuckland1.setBorderPainted(false);
		
		btnAuckland2.setSize(550, 355);
		btnAuckland2.setLocation(17, 12);
		btnAuckland2.setRolloverSelectedIcon(iconAuckland2);
		btnAuckland2.setBorderPainted(false);
		btnAuckland2.setVisible(false);
		
		btnAuckland1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAuckland2.setVisible(true);
				btnAuckland1.setVisible(false);
			}
			
		});
		
		btnAuckland2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAuckland1.setVisible(true);
				btnAuckland2.setVisible(false);
			}
			
		});
		
		add(btnAuckland1);
		add(btnAuckland2);
		
		//여행지 정보 TextArea
		//여행지 이름 라벨
		JLabel pName=new JLabel(p.getpName());
		
		pName.setBounds(20, 388, 350, 31);
		pName.setOpaque(true);
		pName.setBackground(new Color(0xF6F6F6));
		pName.setFont(new Font("나눔고딕코딩", Font.BOLD, 30));
		
		add(pName);
		
		//여행지 티켓 가격 라벨
		JLabel pPrice=new JLabel(p.getpPrice());
		
		pPrice.setBounds(20, 478, 350, 26);
		pPrice.setOpaque(true);
		pPrice.setBackground(new Color(0xF6F6F6));
		pPrice.setFont((new Font("나눔고딕코딩", Font.BOLD, 25)));
		
		add(pPrice);
		
		//추천 여행 기간 라벨
		JLabel rPeriod=new JLabel(p.getrPeriod());
		
		rPeriod.setBounds(20, 513, 350, 21);
		rPeriod.setOpaque(true);
		rPeriod.setBackground(new Color(0xF6F6F6));
		rPeriod.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		
		add(rPeriod);
		
		TextArea infoAuckland=new TextArea("\n\n\n"+p.getpInfo()+"\n\n\n\n\n\n"+p.getrInfo(), 
				0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		infoAuckland.setSize(385, 280);
		infoAuckland.setLocation(15, 380);
		infoAuckland.setBackground(new Color(0xF6F6F6));
		infoAuckland.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
				
		add(infoAuckland);
		
		//월 선택
		PlaceDAO pDAO=new PlaceDAO();
		
		Choice tMonth=new Choice();
		
		for(int i=0; i<pDAO.monthSlot.length; i++) {
			tMonth.add(pDAO.monthSlot[i]);
		}
		
		tMonth.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tMonth.setSize(150, 40);
		tMonth.setLocation(420, 390);
		
		add(tMonth);
		
		//일 선택
		Choice tDate=new Choice();
				
		for(int i=0; i<pDAO.dateSlot.length; i++) {
			tDate.add(pDAO.dateSlot[i]);
		}
				
		tDate.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tDate.setSize(150, 40);
		tDate.setLocation(420, 440);
				
		add(tDate);
		
		//시간 선택
		Choice tTime=new Choice();
				
		for(int i=0; i<pDAO.timeSlot.length; i++) {
			tTime.add(pDAO.timeSlot[i]);
		}
				
		tTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tTime.setSize(150, 40);
		tTime.setLocation(420, 490);
				
		add(tTime);
		
		//인원 선택
		Choice tClient=new Choice();
				
		for(int i=0; i<pDAO.clientSlot.length; i++) {
			tClient.add(pDAO.clientSlot[i]);
		}
				
		tClient.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tClient.setSize(150, 50);
		tClient.setLocation(420, 540);
				
		add(tClient);
		
		//좌석 선택 Button
		JButton btnSeat=new JButton("좌석 선택");
				
		btnSeat.setBackground(new Color(0x15006F));
		btnSeat.setSize(150, 50);
		btnSeat.setLocation(420, 600);
		btnSeat.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		btnSeat.setForeground(new Color(0xFFFFFF));
			
		btnSeat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyPlace mp=new MyPlace();
				
				mp.setpName(p.getpName());
				mp.setMonth(tMonth.getSelectedItem());
				mp.setDate(tDate.getSelectedItem());
				mp.setTime(tTime.getSelectedItem());
				mp.setClient(tClient.getSelectedItem());
				
				if(tMonth.getSelectedItem().equals("월 선택")) {
					JOptionPane.showMessageDialog(null, "월을 선택해 주세요.");
				}else if(tDate.getSelectedItem().equals("일 선택")) {
					JOptionPane.showMessageDialog(null, "일을 선택해 주세요.");
				}else if(tTime.getSelectedItem().equals("시간 선택")) {
					JOptionPane.showMessageDialog(null, "시간을 선택해 주세요.");
				}else if(tClient.getSelectedItem().equals("인원 선택")) {
					JOptionPane.showMessageDialog(null, "인원을 선택해 주세요.");
				}else {
					//FrameBase.getInstance(new FrameGuamSeat());
				}
				
			}
			
		});
		
		add(btnSeat);
		
		//이전 페이지 Button
		JButton btnBack=new JButton("이전 페이지");
				
		btnBack.setBackground(new Color(0x15006F));
		btnBack.setSize(170, 70);
		btnBack.setLocation(15, 680);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		btnBack.setForeground(new Color(0xFFFFFF));
				
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBali());
			}
					
		});
				
		add(btnBack);
		
		//홈 Button

		JButton btnHome=new JButton("H O M E");
		
		btnHome.setBackground(new Color(0x15006F));		
		btnHome.setSize(170, 70);
		btnHome.setLocation(208, 680);
		btnHome.setFont(new Font("나눔고딕코딩", Font.PLAIN, 20));
		btnHome.setForeground(new Color(0xFFFFFF));
				
		btnHome.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//FrameBase.getInstance(new FrameBegin());
			}
					
		});
		
		add(btnHome);
		
		//다음 페이지 Button
		JButton btnNext=new JButton("다음 페이지");
				
		btnNext.setBackground(new Color(0x15006F));
		btnNext.setSize(170, 70);
		btnNext.setLocation(400, 680);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		btnNext.setForeground(new Color(0xFFFFFF));
				
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameZurich());
			}
					
		});
				
		add(btnNext);	
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(), this);
	}
}
