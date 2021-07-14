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

public class FrameTokyo extends JPanel {
	public FrameTokyo() {
		setBackground(new Color(0xB2EBF4));
		setLayout(null);
		setSize(600, 800);
		
		ImageIcon iconTokyo=new ImageIcon("도쿄.jpg");
		JLabel imgTokyo=new JLabel(iconTokyo);
		
		imgTokyo.setBounds(17, 12, 550, 355);
		
		add(imgTokyo);
		
		//여행지 정보 TextArea
		TextArea infoTokyo=new TextArea("도쿄"+"\n\n신구의 조화가 절묘한 도시\n"+"\n680,000 원\n"+"\n추천 여행 기간:10월~11월\n\n"
				+"낮에는 따뜻하고 밤에는 선선해 걸어 다니기 좋다. 이 즈음 청명한 날씨가 이어진다. 평균 기온이 16C 정도로 "
				+"여름이지만 많이 덥지 않고, 한낮에도 습도가 낮아 여행하기 좋다.", 
						0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
			
		infoTokyo.setSize(400, 280);
		infoTokyo.setLocation(0, 380);
		infoTokyo.setBackground(new Color(0xD4F4FA));
		infoTokyo.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
				
		add(infoTokyo);
		
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
				
		btnSeat.setBackground(new Color(0xD4F4FA));
		btnSeat.setSize(150, 50);
		btnSeat.setLocation(420, 600);
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
				
		btnBack.setBackground(new Color(0x80F5FF));
		btnBack.setSize(180, 70);
		btnBack.setLocation(1, 680);
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
				
		btnHome.setSize(180, 70);
		btnHome.setLocation(204, 680);
				
		btnHome.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//홈 기능 구현 예정
			}
					
		});
		
		add(btnHome);
		
		//다음 페이지 Button
		JButton btnNext=new JButton("다음 페이지");
				
		btnNext.setBackground(new Color(0x80F5FF));
		btnNext.setSize(180, 70);
		btnNext.setLocation(403, 680);
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
