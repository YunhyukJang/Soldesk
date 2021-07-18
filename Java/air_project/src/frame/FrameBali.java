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
import javax.swing.JPanel;

public class FrameBali extends JPanel {
	private Image backImg;
	
	public FrameBali() {
		backImg=Toolkit.getDefaultToolkit().getImage("비행.jpg");
		
		setLayout(null);
		setSize(600, 800);
		
		ImageIcon iconBali=new ImageIcon("발리.jpg");
		JLabel imgBali=new JLabel(iconBali);
		
		imgBali.setBounds(17, 12, 550, 355);
		
		add(imgBali);
		
		//여행지 정보 TextArea
		TextArea infoBali=new TextArea("발리"+"\n\n세계 최고의 휴양지, 세계 1위의 허니문 여행지 신들의 섬 발리\n"+"\n700,000 원\n"
		+"\n추천 여행 기간 : 5월~9월\n\n세계 1등 휴양지인 발리는 7월 8월이 최성수기이고 4월부터 10월까지 건기인 시기에 찾는 것이 여행하기 좋다. "
		+ "발리는 지역마다 고도가 달라 평균날씨도 다르지만 평균 32.4℃이며 3월에 가장 높고 평균온도가 29.6℃로 8월에 가장 낮다. 4월부터 10월까지 "
		+ "건기이며 11월부터 3월까지 우기이다. 1월과 2월에 비가 가장 많이 오며, 동남아시아의 전형적인 스콜성 비입니다.", 
		0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
			
		infoBali.setSize(400, 280);
		infoBali.setLocation(0, 380);
		infoBali.setBackground(new Color(0xF6F6F6));
		infoBali.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
				
		add(infoBali);
		
		//월 선택
		Choice tMonth=new Choice();
		String monthSlot[]={"월 선택", 
				"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", 
				"10월", "11월", "12월"};
		
		for(int i=0; i<monthSlot.length; i++) {
			tMonth.add(monthSlot[i]);
		}
		
		tMonth.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tMonth.setSize(150, 40);
		tMonth.setLocation(420, 390);
		
		add(tMonth);
		
		//일 선택
		Choice tDate=new Choice();
		String dateSlot[]={"일 선택", 
				"1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", 
				"11일", "12일", "13일", "14일", "15일", "16일", "17일", "18일", "19일", 
				"20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", 
				"29일", "30일", "31일"};
				
		for(int i=0; i<dateSlot.length; i++) {
			tDate.add(dateSlot[i]);
		}
				
		tDate.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tDate.setSize(150, 40);
		tDate.setLocation(420, 440);
				
		add(tDate);
		
		//시간 선택
		Choice tTime=new Choice();
		String timeSlot[]={"시간대 선택", 
				"00:00", "02:30", 
				"05:00", "07:30", 
				"09:00", "11:30", 
				"14:00", "16:30", 
				"19:00", "21:30"};
				
		for(int i=0; i<timeSlot.length; i++) {
			tTime.add(timeSlot[i]);
		}
				
		tTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tTime.setSize(150, 40);
		tTime.setLocation(420, 490);
				
		add(tTime);
		
		//인원 선택
		Choice tClient=new Choice();
		String clientSlot[]={"인원 선택", "1명", "2명", "3명", "4명", "5명"};
				
		for(int i=0; i<clientSlot.length; i++) {
			tClient.add(clientSlot[i]);
		}
				
		tClient.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
		tClient.setSize(150, 50);
		tClient.setLocation(420, 540);
				
		add(tClient);
		
		//좌석 선택 Button
		JButton btnSeat=new JButton("좌석 선택");
				
		btnSeat.setBackground(new Color(0xF6F6F6));
		btnSeat.setSize(150, 50);
		btnSeat.setLocation(420, 600);
		btnSeat.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
			
		btnSeat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//좌석 선택 기능 구현 예정
			}
			
		});
		
		add(btnSeat);
		
		//이전 페이지 Button
		JButton btnBack=new JButton("이전 페이지");
				
		btnBack.setBackground(new Color(0xF6F6F6));
		btnBack.setSize(170, 70);
		btnBack.setLocation(15, 680);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
				
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameLA());
			}
					
		});
				
		add(btnBack);
		
		//홈 Button
		JButton btnHome=new JButton("H O M E");
		
		btnHome.setBackground(new Color(0xF6F6F6));
		btnHome.setSize(170, 70);
		btnHome.setLocation(208, 680);
		btnHome.setFont(new Font("나눔고딕코딩", Font.PLAIN, 20));
				
		btnHome.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//FrameBase.getInstance(new FrameBegin());
			}
					
		});
		
		add(btnHome);
		
		//다음 페이지 Button
		JButton btnNext=new JButton("다음 페이지");
				
		btnNext.setBackground(new Color(0xF6F6F6));
		btnNext.setSize(170, 70);
		btnNext.setLocation(400, 680);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
				
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameAuckland());
			}
					
		});
				
		add(btnNext);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(), this);
	}
}
