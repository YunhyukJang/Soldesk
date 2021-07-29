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

import vo.FlyMyPlace;
import vo.FlyPlace;
import vo.FlyPlaceDAO;

public class FlyTokyo extends JPanel {
	private Image backImg;
	
	public FlyTokyo(FlyPlace p) {
		backImg=Toolkit.getDefaultToolkit().getImage("비행2.jpg");
		
		setLayout(null);
		setSize(600, 800);
		
		//여행지 이미지
		ImageIcon iconTokyo1=new ImageIcon("도쿄1.jpg");
		ImageIcon iconTokyo2=new ImageIcon("도쿄2.jpg");
		JButton btnTokyo1=new JButton(iconTokyo1);
		JButton btnTokyo2=new JButton(iconTokyo2);
		
		btnTokyo1.setSize(550, 315);
		btnTokyo1.setLocation(17, 12);
		btnTokyo1.setRolloverSelectedIcon(iconTokyo1);
		btnTokyo1.setBorderPainted(false);
		
		btnTokyo2.setSize(550, 315);
		btnTokyo2.setLocation(17, 12);
		btnTokyo2.setRolloverSelectedIcon(iconTokyo2);
		btnTokyo2.setBorderPainted(false);
		btnTokyo2.setVisible(false);
		
		add(btnTokyo1);
		add(btnTokyo2);
		
		//여행지 이미지 리스트
		JButton btnList1=new JButton("1");
		JButton btnList2=new JButton("2");
				
		btnList1.setSize(40, 40);
		btnList1.setLocation(250, 333);
		btnList1.setBorderPainted(false);
		btnList1.setBackground(new Color(0x5F00FF));
		btnList1.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));
		btnList1.setForeground(new Color(0xFFFFFF));
		
		btnList2.setSize(40, 40);
		btnList2.setLocation(310, 333);
		btnList2.setBorderPainted(false);
		btnList2.setBackground(new Color(0x5F00FF));
		btnList2.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));
		btnList2.setForeground(new Color(0xFFFFFF));
				
		btnList1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnTokyo1.setVisible(true);
				btnTokyo2.setVisible(false);
			}
					
		});
				
		btnList2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				btnTokyo1.setVisible(false);
				btnTokyo2.setVisible(true);
			}
					
		});
				
		add(btnList1);
		add(btnList2);
		
		//여행지 정보 TextArea
		//여행지 이름 라벨
		JLabel pName=new JLabel(p.getpName());
		
		pName.setBounds(20, 388, 350, 31);
		pName.setOpaque(true);
		pName.setBackground(new Color(0xF6F6F6));
		pName.setFont(new Font("나눔고딕코딩", Font.BOLD, 30));
		
		add(pName);
		
		TextArea infoTokyo=new TextArea("\n\n\n"+p.getpInfo()+"\n\n"+p.getpPrice()
		+"\n\n"+p.getrPeriod()+"\n\n"+p.getrInfo(), 
		0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		infoTokyo.setSize(385, 280);
		infoTokyo.setLocation(15, 380);
		infoTokyo.setBackground(new Color(0xF6F6F6));
		infoTokyo.setFont(new Font("나눔고딕코딩", Font.PLAIN, 16));
				
		add(infoTokyo);
		
		//월 선택
		FlyPlaceDAO pDAO=new FlyPlaceDAO();
		
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
				
		btnSeat.setBackground(new Color(0x5F00FF));
		btnSeat.setSize(150, 50);
		btnSeat.setLocation(420, 600);
		btnSeat.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		btnSeat.setForeground(new Color(0xFFFFFF));
			
		btnSeat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyMyPlace mp=new FlyMyPlace();
				
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
					FlyFrameBase.getInstance(new FlyTokyoSeat());
				}
				
			}
			
		});
		
		add(btnSeat);
		
		//이전 페이지 Button
		JButton btnBack=new JButton("이전 페이지");
				
		btnBack.setBackground(new Color(0x5F00FF));
		btnBack.setSize(170, 70);
		btnBack.setLocation(15, 680);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		btnBack.setForeground(new Color(0xFFFFFF));
				
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyPlace sf=new FlyPlaceDAO().searchPlace("괌");
				
				FlyFrameBase.getInstance(new FlyGuam(sf));
			}
					
		});
				
		add(btnBack);
		
		//홈 Button

		JButton btnHome=new JButton("H O M E");
		
		btnHome.setBackground(new Color(0x5F00FF));		
		btnHome.setSize(170, 70);
		btnHome.setLocation(208, 680);
		btnHome.setFont(new Font("나눔고딕코딩", Font.PLAIN, 20));
		btnHome.setForeground(new Color(0xFFFFFF));
				
		btnHome.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//FlyFrameBase.getInstance(new FlyFrameBegin());
			}
					
		});
		
		add(btnHome);
		
		//다음 페이지 Button
		JButton btnNext=new JButton("다음 페이지");
				
		btnNext.setBackground(new Color(0x5F00FF));
		btnNext.setSize(170, 70);
		btnNext.setLocation(400, 680);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		btnNext.setForeground(new Color(0xFFFFFF));
				
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyPlace sf=new FlyPlaceDAO().searchPlace("로스앤젤레스");
				
				FlyFrameBase.getInstance(new FlyLA(sf));
			}
					
		});
				
		add(btnNext);	
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(), this);
	}
}
