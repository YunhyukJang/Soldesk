package FlyVO;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.TextArea;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	import Frame.FlyAirGuideSelect;
	import Frame.FlyFrameBase;
	import Frame.FlyLogin;
	import Frame.FlyFrameBegin;


	public class FlyFrameAirGuideInfo extends JPanel{
		
		public FlyFrameAirGuideInfo(FlyChoiceAirGuide c) {
			//setBackground(new Color(250, 244, 192));
			setLayout(null);
			setSize(600, 800);

			final int cityNum = 4;
			int cityflag = 0;
			String[] cityeurl = {"공항정보2.png", "체크인정보2.png", "라운지정보2.jpg", 
								"환승절차2.png"};

			ImageIcon[] cityImg = new ImageIcon[cityNum];

			for (int i = 0; i < cityNum; i++) {
		
				cityImg[i] = new ImageIcon( cityeurl[i] );
				if (c.gettName().equals("<공항정보>")) {
					cityflag = 0;
				} else if (c.gettName().equals("<체크인정보>")) {
					cityflag = 1;
				} else if (c.gettName().equals("<라운지>")) {
					cityflag = 2;
				} else if (c.gettName().equals("<환승절차>")) {
					cityflag = 3;
				
				}
			}
			//이미지를 JLabel에 붙여서 출력
			JLabel img = new JLabel( cityImg[cityflag] );
			img.setBounds(140, 13, 285, 350);//이미지 위치
			add(img);
		
			TextArea story = new TextArea(
						"\n◎공항안내" + "\n"+"\n" + c.gettName() + 
						"\n"+String.format("\n" + c.getStory()),
						0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
			story.setSize(580, 280);
			story.setLocation(0, 375);
			story.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			//story.setBackground(new Color(0x99ccff));//텍스트 쪽 바탕색
			add(story);

			
			//하단의 버튼
			JPanel bottomSet = new JPanel();
			/*
			bottomSet.setBounds(190, 660, 183, 87);
			bottomSet.setLayout(null);
			*/
			JButton btnBack = new JButton("뒤로가기");
			
			btnBack.setBackground(new Color(0xF6F6F6));
			btnBack.setSize(170, 70);
			btnBack.setLocation(15, 680);
			btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
			add(btnBack);
			int buttonNum = cityflag;//니가 플래그를 버튼방에 넣었어
			btnBack.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					FlyFrameBase.getInstance(new FlyAirGuideSelect());
				
				
				}
			});
			
			add(bottomSet, BorderLayout.SOUTH);	
			
			//창화면 그림 넣기
			setLayout(null);
		  	ImageIcon back=new ImageIcon("Backg.jpg");
			JLabel backimg=new JLabel(back);
			backimg.setSize(600,800);
			backimg.setLocation(0,0);
			add(backimg);
			
		}

	}





