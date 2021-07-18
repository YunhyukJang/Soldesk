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

public class FrameZurich extends JPanel {
	private Image backImg;
	
	public FrameZurich() {
		backImg=Toolkit.getDefaultToolkit().getImage("비행.jpg");
		
		setLayout(null);
		setSize(600, 800);
		
		ImageIcon iconZurich=new ImageIcon("취리히.jpg");
		JLabel imgZurich=new JLabel(iconZurich);
		
		imgZurich.setBounds(17, 12, 550, 355);
		
		add(imgZurich);
		
		//여행지 정보 TextArea
		TextArea infoZurich=new TextArea("취리히"+"\n\n취리히는 스위스 최대의 도시이자 풍요롭고 활기찬 도시, 경제 문화의 중심이다.\n"
		+"\n657,400 원\n"+"\n추천 여행 기간 : 연중 내내\n\n여름은 더워도 습하지 않고 겨울에도 지나치게 춥지 않다. 기본적으로 여름에는 덥고 건조, "
				+"겨울에는 춥고 눈이 많이 오는 기후지만, 수시로 날씨가 바뀌기 때문에 그에 대비한 준비를 철저히 해야 한다.", 
				0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
			
		infoZurich.setSize(400, 280);
		infoZurich.setLocation(0, 380);
		infoZurich.setBackground(new Color(0xF6F6F6));
		infoZurich.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
				
		add(infoZurich);
		
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
				FrameBase.getInstance(new FrameAuckland());
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
				FrameBase.getInstance(new FrameParis());
			}
					
		});
				
		add(btnNext);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(), this);
	}
}
