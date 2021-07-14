package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vo.Place;

public class FramePlaceInfo extends JPanel {
	public FramePlaceInfo(Place p) {
		setBackground(new Color(0xB2EBF4));
		setLayout(null);
		setSize(600, 800);
		
		final int placeNum=8;
		int placeFlag=0;
		String[] placeUrl={"괌.jpg", "도쿄.jpg", "로스앤젤레스.jpg", "발리.jpg", 
				"오클랜드.jpg", "취리히.jpg", "파리.jpg", "하와이.jpg"};
		
		ImageIcon[] placeImg=new ImageIcon[placeNum];
		
		for(int i=0; i<placeNum; i++) {
			placeImg[i]=new ImageIcon(placeUrl[i]);
			
			if(p.getpName().equals("괌")) {
				placeFlag=0;
			}else if(p.getpName().equals("도쿄")) {
				placeFlag=1;
			}else if(p.getpName().equals("로스앤젤레스")) {
				placeFlag=2;
			}else if(p.getpName().equals("발리")) {
				placeFlag=3;
			}else if(p.getpName().equals("오클랜드")) {
				placeFlag=4;
			}else if(p.getpName().equals("취리히")) {
				placeFlag=5;
			}else if(p.getpName().equals("파리")) {
				placeFlag=6;
			}else if(p.getpName().equals("하와이")) {
				placeFlag=7;
			}
			
		}
		
		JLabel img=new JLabel(placeImg[placeFlag]);
		
		img.setBounds(30, 30, 530, 350);
		
		add(img);
		
		//여행지 정보 TextArea
		TextArea info=new TextArea("\n"+p.getpName()+"\n\n"+p.getpInfo()+p.getpPrice()
		+"\n추천 여행 기간\n"+p.getPeriod(), 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		info.setSize(400, 280);
		info.setLocation(0, 450);
		info.setBackground(new Color(0xD4F4FA));
		info.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		
		add(info);
		
		//날짜 선택
		Choice tDate=new Choice();
		String dateSlot[]={"날짜 선택", 
				"1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", 
				"11일", "12일", "13일", "14일", "15일", "16일", "17일", "18일", "19일", 
				"20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", 
				"29일", "30일", "31일"};
		
		for(int i=0; i<dateSlot.length; i++) {
			tDate.add(dateSlot[i]);
		}
		
		tDate.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
		tDate.setSize(150, 50);
		tDate.setLocation(440, 450);
		
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
		
		tTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
		tTime.setSize(150, 50);
		tTime.setLocation(440, 510);
		
		add(tTime);
		
		//인원 선택
		Choice tClient=new Choice();
		String clientSlot[]={"인원 선택", "1명", "2명", "3명", "4명", "5명"};
		
		for(int i=0; i<clientSlot.length; i++) {
			tClient.add(clientSlot[i]);
		}
		
		tClient.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
		tClient.setSize(150, 50);
		tClient.setLocation(440, 570);
		
		add(tClient);
		
		//좌석 선택 Button
		JButton btnSeat=new JButton("좌석 선택");
		
		btnSeat.setBackground(new Color(0xDAD9FF));
		btnSeat.setSize(150, 50);
		btnSeat.setLocation(440, 630);
		btnSeat.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		
		btnSeat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//좌석 선택 기능 구현 예정
				//new FrameTourSeat(p);
			}
			
		});
		
		add(btnSeat);
		
		//이전 페이지 Button
		JButton btnBack=new JButton("이전 페이지");
		
		btnBack.setBackground(new Color(0xCEFBC9));
		btnBack.setSize(180, 100);
		btnBack.setLocation(15, 750);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 23));
		
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//이전 페이지 기능 구현 예정
			}
			
		});
		
		add(btnBack);
		
		//홈 Button
		ImageIcon iconHome=new ImageIcon("홈.png");
		JButton btnHome=new JButton(iconHome);
		
		btnHome.setSize(180, 100);
		btnHome.setLocation(195, 750);
		
		btnHome.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//홈 기능 구현 예정
			}
			
		});
		
		add(btnHome);
		
		//다음 페이지 Button
		JButton btnNext=new JButton("다음 페이지");
		
		btnNext.setBackground(new Color(0xCEFBC9));
		btnNext.setSize(180, 100);
		btnNext.setLocation(405, 750);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 23));
		
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//다음 페이지 기능 구현 예정
			}
			
		});
		
		add(btnNext);
	}
}
