package Frame;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.PlainDocument;
import Frame.FlyGuam;
import FlyVO.FlyPlace;
import FlyVO.FlyPlaceDAO;






public class FlypaymentZurich extends JPanel implements test1 {
	
	//FlyPlace pl=new FlyPlace();
	//FlyGuam Gu=new FlyGuam();
	
	//String sP=pl.getpPrice();
	//public int sPrice1=Integer.parseInt(sPrice);
	//public String sClient =mp.getClient();
	//public int sClient1=Integer.parseInt(sClient);

	
	//public int spr=gu.sprice2;
	//public int scl=gu.scli3;
	//public int sum=spr*scl;//sClient1*sPrice1;// 전페이지에서 넘어올 총결제금액 들어올자리에 예비셋팅
	public Integer te=0;
	private int count=3;
	private int sum=657400*count;
	private String sum1=Integer.toString(sum);
	private int cpay=0; //할인 쿠폰 리턴해줄 금액
	private String cpay1=Integer.toString(cpay); //할인 쿠폰 금액을 스트링으로 형변환해서 쓸 변수
	private int last=sum; //결제 총액
	private String last1=Integer.toString(last); // 결제 총액을 스트링으로 형변환해서 쓸 변수
	private Image back; //배경화면 이미지
	private int Certification4 = 0; //인증번호 랜덤값 넣을 변수
    private String to = Integer.toString(Certification4); 
    //텍스트필드에 입력된 문자열 인증번호랑 맞는지 확인하기위해 형변환 후 셋 비교
    
    public Integer lasttest() {
    	ArrayList<Integer> test=new ArrayList<Integer>();
    	test.add(0,0);
    	return test.get(0);
    }
    
    public String[] arr() {
	String infotitle[] = {"구간","출발시간","출발일","직항 여부","비행 시간","좌석","편명"};
	
	
	return infotitle;
    }
    public String[][] arr1() {
    	String infodata[][] = {{"구간1","ICN 인천 T1 14:00 ","2021-08-15(일)","직항","11h40m","A1","D281"},
				{"구간1","ICN 인천 T1 14:00 ","2021-08-15(일)","직항","11h40m","A2","D281"},
				{"구간1","ICN 인천 T1 14:00 ","2021-08-15(일)","직항","11h40m","A3","D281"}
		};
		
    	return infodata;
    }
	
	
	public FlypaymentZurich() {
		
		//JPanel 기본 구조
		back=Toolkit.getDefaultToolkit().getImage("backg2.jpg");
		setLayout(null);
		setSize(600,800);
			
		// 상단 항공권 예매 라벨 기본 셋팅
		
		JLabel at=new JLabel("항공권 예매");
		at.setForeground(Color.white);
		
		at.setFont(new Font("DX영화자막", Font.BOLD, 25));
		at.setBounds(225, -25, 150, 150);
		
		
		add(at);
		

		
		//구간 , 항공기명 등이 들어갈 테이블 생성 
		FlyPlaceDAO p = new FlyPlaceDAO();
		String infotitle[] = {"구간","출발시간","출발일","직항 여부","비행 시간","좌석","편명"};
		
		String infodata[][] = {{"구간1","ICN 인천 T1 14:00 ","2021-08-15(일)","직항","11h40m","A1","D281"},
				{"구간1","ICN 인천 T1 14:00 ","2021-08-15(일)","직항","11h40m","A2","D281"},
				{"구간1","ICN 인천 T1 14:00 ","2021-08-15(일)","직항","11h40m","A3","D281"}
		};
		
		
		
		/* 테이블에 들어갈 내용 for문으로 받아올자리
		int i;
		for(i=0; i<infodata.length; i++) {
			for(int j=0; j<infodata[i].length; j++) {
			// 각 배열방에 셋에 저장된 내용을 가져와야 함으로
			// 셋 세팅에 따라 다르겠지만 따로 저장된 셋을 불러올 경우에는 if문으로
			// 각 방 ex)  j=0인경우에 infodata[i][j] = 겟해올 정보 j++ 해서
			// 각 배열방에 필요한 정보 저장
			infodata[i][j] = 
				
			}
			
		}	
		----------------------------------
		*/
		//예매내역 라벨 및 판넬 생성 및 설정
		JLabel tt=new JLabel("예매내역");
		tt.setForeground(Color.white);
		tt.setFont(new Font("DX영화자막", Font.BOLD, 18));
		tt.setBounds(50, 75, 100, 30);
		add(tt);
		
		JPanel CenterSet = new JPanel();
        CenterSet.setBounds(25, 105, 527, 100);
       
    
        
		//테이블에 배열 추가
		DefaultTableModel model = new DefaultTableModel(infodata,infotitle);
		JTable table = new JTable(model);
		
		// JTable 스크롤 
        JScrollPane sp = new JScrollPane(table);
        
        //테이블 크기 설정
        sp.setPreferredSize(new Dimension(528,100));
        
        CenterSet.add(sp); //패널에 테이블 추가
        add(CenterSet);  
        
        
        //쿠폰 발급 라벨
        JLabel cp=new JLabel("발급가능쿠폰");
        cp.setForeground(Color.white);
		cp.setFont(new Font("DX영화자막", Font.BOLD, 17));
		//라벨 백그라운드 컬러 설정하려면 먼저 이걸 셋팅해야함 setOpaque(true)
		cp.setBounds(50, 220, 150, 30);
		
		//쿠폰 발급 버튼
		JButton btnIs = new JButton("↓발급받기");
		btnIs.setSize(90, 30);
		btnIs.setLocation(160, 220);
		btnIs.setBackground(Color.white);
		
		btnIs.setFont(new Font("DX영화자막", Font.BOLD, 11));
		
	
		//쿠폰 패널에 들어갈 내용 설정 및 텍스트에리어 테두리 설정
		
		JLabel Cparea1=new JLabel("프로모션 기념 10,000원 할인쿠폰");
		Cparea1.setBounds(100, 260, 250, 50);
		Cparea1.setFont(new Font("DX영화자막", Font.BOLD, 15));
		
		JLabel Cparea2=new JLabel(" (쿠폰은 첫 회원가입시에만 발급됩니다.)");
		Cparea2.setBounds(90, 285, 300, 50);
		Cparea2.setFont(new Font("DX영화자막", Font.BOLD, 14));
		Cparea2.setForeground(Color.red);
		
		//쿠폰 패널
		JPanel Cparea=new JPanel();
		Cparea.setBorder(new TitledBorder(new LineBorder(Color.black,1)));
		
		Cparea.setBounds(25, 255, 405, 80);
			
		//쿠폰 이미지
		ImageIcon coupon = new ImageIcon("할인쿠폰.jpg");
		JLabel cp2 = new JLabel(coupon);
		cp2.setBounds(416, 220, 150, 150);
		
		add(btnIs);
		add(Cparea1);
		add(Cparea2);
		add(Cparea);
		add(cp2);
        add(cp);
       
        
        //add(CenterSet,BorderLayout.CENTER); // 프레임에 추가 후 위치설정
		
        JLabel tpL=new JLabel("결제 총액"); //할인 쿠폰 적용전 금액 표시할 라벨
        tpL.setForeground(Color.white);
        tpL.setFont(new Font("DX영화자막", Font.BOLD, 17));
        tpL.setBounds(50, 345, 100, 30);
        
       
        
        JLabel tpL1=new JLabel("쿠폰 할인 금액"); //할인 쿠폰 금액
        tpL1.setForeground(Color.white);
        tpL1.setBackground(Color.black);
        tpL1.setFont(new Font("DX영화자막", Font.BOLD, 17));
        tpL1.setBounds(220, 345, 150, 30);
        
        JLabel tpL2=new JLabel("최종 결제 금액"); //할인쿠폰 적용 후 금액
        tpL2.setForeground(Color.white);
        tpL2.setBackground(Color.black);
        tpL2.setFont(new Font("DX영화자막", Font.BOLD, 17));
        tpL2.setBounds(420, 345, 150, 30);
        
        JLabel tpL3=new JLabel("KRW"); //결제 총액 단위 KRW 라벨
        tpL3.setForeground(Color.red);
        tpL3.setFont(new Font("DX영화자막", Font.BOLD, 15));
        tpL3.setBounds(45, 395, 70, 30);
        
        JLabel tpL4=new JLabel("KRW"); //쿠폰 할인 단위 KRW 라벨
        tpL4.setForeground(Color.red);
        tpL4.setFont(new Font("DX영화자막", Font.BOLD, 15));
        tpL4.setBounds(230, 395, 70, 30);
        
        JLabel tpL5=new JLabel("KRW"); //최종 결제 금액 단위 KRW 라벨
        tpL5.setForeground(Color.red);
        tpL5.setFont(new Font("DX영화자막", Font.BOLD, 15));
        tpL5.setBounds(415, 395, 70, 30);
        
        if(sum>=1000000 & sum<10000000) {
    		sum1=sum1.substring(0,1)+","+sum1.substring(1,4)+","+sum1.substring(4,7);
			}else if(sum<1000000) {
			sum1=sum1.substring(0, 3)+","+sum1.substring(3, 6);
			}
        
        
        JLabel tpL6=new JLabel(""+sum1);
        //결제 총액 get해올 int형 총액 String으로 형변환
        tpL6.setForeground(Color.red); //String.valueOf(numInt); or Integer.parseInt(str);
        tpL6.setFont(new Font("DX영화자막", Font.BOLD, 16));
        tpL6.setBounds(85, 394, 80, 30);
        
        JLabel tpL7=new JLabel(cpay1); //쿠폰 할인 금액
        tpL7.setForeground(Color.red);
        tpL7.setFont(new Font("DX영화자막", Font.BOLD, 16));
        tpL7.setBounds(270, 394, 70, 30);
       
    	if(last>=1000000 & last<10000000) {
    		last1=last1.substring(0,1)+","+last1.substring(1,4)+","+last1.substring(4,7);
			}else if(last<1000000) {
			last1=last1.substring(0, 3)+","+last1.substring(3, 6);
			}
        	
		JLabel tpL8=new JLabel(last1); //최종 결제
		tpL8.setForeground(Color.red);
		tpL8.setFont(new Font("DX영화자막", Font.BOLD, 16));
		tpL8.setBounds(455, 394, 80, 30);
			
        btnIs.addActionListener(new ActionListener() {
        	
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			JOptionPane.showMessageDialog(null, "쿠폰발급완료!\n쿠폰은 즉시 적용됩니다.","쿠폰발급",JOptionPane.INFORMATION_MESSAGE);
    			
    			cpay+=10000;
    			cpay1=Integer.toString(cpay);
    			last=last-cpay;
    			last1=Integer.toString(last);
    			tpL7.setText(cpay1.substring(0, 2)+","+cpay1.substring(2, 5));
    			if(last>=1000000 & last<10000000) {
    			tpL8.setText(last1.substring(0,1)+","+last1.substring(1,4)+","+last1.substring(4,7));
    			last1=last1.substring(0,1)+","+last1.substring(1,4)+","+last1.substring(4,7);
    			}else if(last<1000000) {
    			tpL8.setText(last1.substring(0, 3)+","+last1.substring(3, 6));
    			last1=last1.substring(0, 3)+","+last1.substring(3, 6);
    			}
    			btnIs.setEnabled(false);
    		}
    	});
        
        
        JLabel tpL10=new JLabel("결제 수단"); //최종 결제
        tpL10.setFont(new Font("DX영화자막", Font.BOLD, 17));
        tpL10.setForeground(Color.white);
        tpL10.setBounds(50, 460, 100, 30);
        
       
        
        //총액 할인금액 등이 들어갈 판넬 셋팅
        JPanel tpL9=new JPanel();
        tpL9.setBounds(25,375,530,70);
        tpL9.setBorder(new TitledBorder(new LineBorder(Color.black,1)));
        tpL9.setLayout(new GridLayout(10,10,300,300));
        
        
        //탭 ONE 패널에 들어갈 이미지
        
        ImageIcon visa = new ImageIcon("VISA.jpg");
		JLabel visa1 = new JLabel(visa);
		visa1.setBounds(-10, -30, 150, 150);
		
		
		ImageIcon maseter = new ImageIcon("MASTER.jpg");
		JLabel master1 = new JLabel(maseter);
		master1.setBounds(75, -30, 150, 150);
		
		
		//visa , master 카드 체크 해줄 버튼 생성
		
		JRadioButton ch1, ch2;
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(ch1 = new JRadioButton(""));
		ch1.setBounds(58, 70, 15, 15);
		radioGroup.add(ch2 = new JRadioButton(""));
		ch2.setBounds(142, 70, 15, 15);
		
		//카드사 선택 콤보 박스 및 라벨 생성
		String cardcom[] = {"선택","KB국민카드","신한카드","하나카드","롯데카드","BC카드","NH농협카드","삼성카드","현대카드"};
		
		JComboBox<String> Bank = new JComboBox<String>(cardcom);
		Bank.setFont(new Font("고딕",Font.BOLD,10));
		Bank.setMaximumRowCount(9);
		JScrollPane Banksc=new JScrollPane(Bank);
		Banksc.setBounds(300, 8, 100, 30);
        
		//카드사 라벨
		JLabel card = new JLabel("카드사 :");
		card.setFont(new Font("DX영화자막",Font.BOLD,13));
		card.setBounds(230, 10, 50, 30);
		
        
        //카드 번호
        JLabel cardnum = new JLabel("카드번호 :");
        cardnum.setFont(new Font("DX영화자막",Font.BOLD,13));
        cardnum.setBounds(230, 50, 70, 30);
        
        //유효 기간
        JLabel cardValidity = new JLabel("유효기간 :");
        cardValidity.setFont(new Font("DX영화자막",Font.BOLD,13));
        cardValidity.setBounds(230, 90, 70, 30);
        
        //유효 기간 받아올 텍스트 필드
        JTextField cardValidity1 =new JTextField();
        //위치
        cardValidity1.setBounds(300,95,50,20);
        
        //CVC 라벨
        JLabel cvc = new JLabel("CVC :");
        cvc.setFont(new Font("DX영화자막",Font.BOLD,14));
        cvc.setBounds(365, 90, 70, 30);
        
        JTextField cvc1 =new JTextField();
        cvc1.setBounds(410,95,50,20);
        
        
        
        
        //비밀번호
        JLabel cardPass = new JLabel("비밀번호 :");
        cardPass.setFont(new Font("DX영화자막",Font.BOLD,13));
        cardPass.setBounds(230, 130, 70, 30);
        
        //비밀번호 받아올필드
        JPasswordField cardPass1=new JPasswordField();
        //위치지정
        cardPass1.setBounds(300,134,50,20);
        //비밀번호 4자리 제한
        cardPass1.setDocument(new JTextFieldLimit(4));
        
        
        //카드번호 받아올 필드
        JTextField cardEnter1=new JTextField();
		JTextField cardEnter2=new JTextField();
		JTextField cardEnter3=new JTextField();
		JPasswordField cardEnter4=new JPasswordField();
		
		//카드번호 위치지정
		
		cardEnter1.setBounds(300,55,50,20);
		cardEnter2.setBounds(355,55,50,20);
		cardEnter3.setBounds(410,55,50,20);
		cardEnter4.setBounds(465,55,50,20);
		
		//인트형 네자리로 제한
		cardEnter1.setDocument(new JTextFieldLimit(4));
		cardEnter2.setDocument(new JTextFieldLimit(4));
		cardEnter3.setDocument(new JTextFieldLimit(4));
		cardEnter4.setDocument(new JTextFieldLimit(4));
		
		//핸드폰 결제 통신사선택
		String agency[] = {"선택","SKT","KT","LG","알뜰폰"};
		
		JComboBox<String> agency1 = new JComboBox<String>(agency);
		agency1.setFont(new Font("고딕",Font.BOLD,10));
		agency1.setMaximumRowCount(9);
		JScrollPane agency2=new JScrollPane(agency1);
		agency2.setBounds(120, 8, 100, 30);
        
		//통신사 라벨
		JLabel phoncom = new JLabel("통신사 :");
		phoncom.setFont(new Font("DX영화자막",Font.BOLD,13));
		phoncom.setBounds(50, 10, 50, 30);
		
        
        //이름
        JLabel name = new JLabel("이름 :");
        name.setFont(new Font("DX영화자막",Font.BOLD,13));
        name.setBounds(65, 50, 70, 30);
        //이름 텍스트 필드
        JTextField name1=new JTextField();
        name1.setBounds(120,55,80,20);
	
        
        //생년월일
        JLabel date = new JLabel("생년월일 :");
        date.setFont(new Font("DX영화자막",Font.BOLD,13));
        date.setBounds(37, 90, 70, 30);
        //생년월일 텍스트필드
        JTextField date1=new JTextField();
        date1.setBounds(120,95,80,20);
        
        //성별 
        JLabel gender = new JLabel("성별 :");
        gender.setFont(new Font("DX영화자막",Font.BOLD,13));
        gender.setBounds(64, 130, 70, 30);
        
        JLabel man = new JLabel("남");
        man.setFont(new Font("DX영화자막",Font.BOLD,13));
        man.setBounds(119, 130, 60, 30);
        
        JLabel woman = new JLabel("여");
        woman.setFont(new Font("DX영화자막",Font.BOLD,13));
        woman.setBounds(164, 130, 60, 30);
        
        //성별 체크 버튼
        JRadioButton man1, woman1;
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(man1 = new JRadioButton());
		man1.setBounds(135, 138, 15, 15);
		genderGroup.add(woman1 = new JRadioButton());
		woman1.setBounds(180, 138, 15, 15);
	
        
        //핸드폰 번호
        JLabel phonenum = new JLabel("핸드폰번호 :");
        phonenum.setFont(new Font("DX영화자막",Font.BOLD,13));
        phonenum.setBounds(280, 10, 90, 30);
        
       
        //핸드폰 번호 텍스트 필드
        JTextField phonenum1=new JTextField();
        JTextField phonenum2=new JTextField();
        JTextField phonenum3=new JTextField();
        //위치
        phonenum1.setBounds(370,15,40,20);
        phonenum2.setBounds(420,15,40,20);
        phonenum3.setBounds(470,15,40,20);
        
        phonenum1.setDocument(new JTextFieldLimit(3));
        phonenum2.setDocument(new JTextFieldLimit(4));
        phonenum3.setDocument(new JTextFieldLimit(4));
        
        
        
        JLabel hy = new JLabel("-");
        hy.setFont(new Font("DX영화자막",Font.BOLD,8));
        hy.setBounds(411, 15, 12, 20);
        
        JLabel hy1 = new JLabel("-");
        hy1.setFont(new Font("DX영화자막",Font.BOLD,8));
        hy1.setBounds(461, 15, 12, 20);
        
        
        //핸드폰 인증번호
        JLabel Certification = new JLabel("인증번호 :");
        Certification.setFont(new Font("DX영화자막",Font.BOLD,13));
        Certification.setBounds(280, 50, 70, 30);
        //인증번호 입력 텍스트 필드
        JTextField Certification1=new JTextField();
        Certification1.setBounds(370,55,70,20);
        
        
        
      
   
     
        /*int Certification4 = (int) (Math.random()*999999+100000);
        String to = Integer.toString(Certification4);
        */
        //인증번호 요청 버튼
        JButton Certification2 = new JButton("요청");
        Certification2.setBackground(Color.CYAN);
        Certification2.setBounds(450, 50, 59, 30);
        
       Certification2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
				Certification4 = (int) (Math.random()*999999+100000);
		        to = Integer.toString(Certification4);
		  
			JOptionPane.showMessageDialog(null, "인증번호 : "+Certification4);
			
		}
	});
        
       
       Certification1.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {		
		}
		@Override
		public void keyReleased(KeyEvent e) {			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			int key =e.getKeyCode();
			if(key==KeyEvent.VK_ENTER) {
				if(Certification1.getText().equals(to)) {
					JOptionPane.showMessageDialog(null, "인증번호가 일치합니다.","인증번호 알림",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "인증번호가 일치하지않습니다.","인증번호 알림",JOptionPane.ERROR_MESSAGE);
				}
					
				}
			}
		});
       
       
          //입금자명
     	JLabel depositname = new JLabel("입금자명 :");
     	depositname.setFont(new Font("DX영화자막",Font.BOLD,13));
     	depositname.setBounds(50, 10, 100, 30);
     	
     	 JTextField depositname1=new JTextField();
     	 depositname1.setBounds(125,15,80,20);
     	
     		
             
         //입금은행
         JLabel depositbank = new JLabel("입금은행 :");
         depositbank.setFont(new Font("DX영화자막",Font.BOLD,13));
         depositbank.setBounds(50, 50, 70, 30);
         
         Choice bankchoice=new Choice();
         bankchoice.addItem("신한은행 110-123456-789 In The Air");
         bankchoice.addItem("국민은행 843210-10-156714 In The Air");
         bankchoice.addItem("하나은행 456-844710-37104 In The Air");
         bankchoice.setBounds(125, 55, 350, 40);
         
             
         //현금영수증
         JLabel receipt = new JLabel("현금영수증 :");
         receipt.setFont(new Font("DX영화자막",Font.BOLD,13));
         receipt.setBounds(38, 90, 100, 30);
         
         JLabel apply = new JLabel("신청");
         apply.setFont(new Font("DX영화자막",Font.BOLD,13));
         apply.setBounds(130, 90, 60, 30);
         
         JLabel notapply = new JLabel("안함");
         notapply.setFont(new Font("DX영화자막",Font.BOLD,13));
         notapply.setBounds(185, 91, 60, 30);
         
         //신청 , 안함 버튼
        JRadioButton apply1, notapply1;
 		ButtonGroup applyGroup = new ButtonGroup();
 		genderGroup.add(apply1 = new JRadioButton());
 		apply1.setBounds(161, 98, 15, 15);
 		genderGroup.add(notapply1 = new JRadioButton());
 		notapply1.setBounds(215, 98, 15, 15);
         
 		
         //이메일
         JLabel receiptemail = new JLabel("이메일 :");
         receiptemail.setFont(new Font("DX영화자막",Font.BOLD,13));
         receiptemail.setBounds(65, 130, 100, 30);
         
         JTextField receiptemail1=new JTextField();
         receiptemail1.setBounds(125,135,130,20);
         

        // 텝 생성과 위치 선정
        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
        tab.setBounds(25, 490, 530, 200);
        
        
        //신용 카드 결제 패널 셋팅
        JPanel one=new JPanel();
        one.setLayout(null);
        one.add(visa1); 
        one.add(master1);
        one.add(ch1); //visa1 체크버튼 -> 결제완료창 띄울때 가져올 예정
        one.add(ch2);
        one.add(Banksc);
        one.add(card);
        one.add(cardnum);
        one.add(cardValidity);
        one.add(cardPass);
        one.add(cardEnter1);
        one.add(cardEnter2);
        one.add(cardEnter3);
        one.add(cardEnter4);
        one.add(cardPass1);
        one.add(cardValidity1);
        one.add(cvc);
        one.add(cvc1);
          //one set 끝
        
        JPanel two=new JPanel();
        two.setLayout(null);
        two.add(phoncom);
        two.add(name);
        two.add(date);
        two.add(gender);
        two.add(agency2);
        two.add(name1);
        two.add(date1);
        two.add(phonenum);
        two.add(phonenum1);
        two.add(phonenum2);
        two.add(phonenum3);
        two.add(hy);
        two.add(hy1);
        two.add(Certification);
        two.add(Certification1);
        two.add(Certification2);
        two.add(man);
        two.add(woman);
        two.add(man1);
        two.add(woman1);
        //-----------two 끝-------------
  
       JPanel three=new JPanel();
        three.setLayout(null);
        
        three.add(depositname);
        three.add(depositbank);
        three.add(receipt);
        three.add(receiptemail);
        three.add(depositname1);
        three.add(receiptemail1);
        three.add(apply);
        three.add(notapply);
        three.add(apply1);
        three.add(notapply1);
        three.add(bankchoice);
           
        
        // 탭 명칭과 컴포넌트 추가
        //tab.addTab("신용카드", one);
        tab.addTab("신용카드", one);
        tab.addTab("핸드폰결제", two);
        tab.addTab("계좌이체", three);

        add(tab,BorderLayout.SOUTH);
   
        add(tpL);
        add(tpL1);
        add(tpL2);
        add(tpL3);
        add(tpL4);
        add(tpL5);
        add(tpL6);
        add(tpL7);
        add(tpL8);
        add(tpL10);
        add(tpL9);
 	
		//하단 뒤로가기 및 결제 버튼 생성
	
		JButton btnBack = new JButton("뒤로가기");
		
		btnBack.setBackground(Color.white);
		btnBack.setSize(150, 50);
		btnBack.setLocation(25, 700);
		btnBack.setFont(new Font("DX영화자막", Font.BOLD, 20));
	
		//뒤로가기 버튼 액션 추가할자리
		btnBack.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				FlyFrameBase.getInstance(new FlyZurichSeat());
			}
		});
	
		
		JButton btnPayment = new JButton("결제하기");
		
		btnPayment.setBackground(Color.white);
		btnPayment.setSize(150, 50);
		btnPayment.setLocation(405, 700);
		btnPayment.setFont(new Font("DX영화자막", Font.BOLD, 20));
	

		btnPayment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//넘어가기전에 여기에 메세지로 결제내역 보여주기
				
				Object a=JOptionPane.showConfirmDialog(null,"               ◇결제내역◇"
						+"\n결제금액 : "+last1+"원"+"\n위 내용을 확인하였으며 결제에 동의합니다" ,"결제", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE );
				if(a.equals(JOptionPane.YES_OPTION)) {
					JOptionPane.showMessageDialog(null, "결제금액 "+last1+"원 결제 완료되었습니다.\n즐겁고 편안한 여행 되시길 바랍니다.\n확인 버튼을 누르시면 Home으로 돌아갑니다.","결제확인",JOptionPane.INFORMATION_MESSAGE);
					FlyFrameBase.getInstance(new FlyFrameBegin("soldesk"));
					test1.test.add(0, 1);
					test1.test.add(1, 1);
					test1.test.add(2, 1);
					test1.test.add(3, 1);
					test1.test.add(4, 1);
					test1.test.add(5, 1);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "결제를 취소하셨습니다.","결제취소",JOptionPane.ERROR_MESSAGE);
				}
			
			
			}
		});
	
			
		add(btnBack, BorderLayout.SOUTH);
		add(btnPayment, BorderLayout.SOUTH);

	}
	
	//배경 이미지 관련
	 public void paintComponent(Graphics g)
	    {
	        g.drawImage(back,0,0,getWidth(),getHeight(),this);
	    }
	 
	 //카드번호 4자리로 제한할 클래스 선언 후  리턴받아옴 비밀번호도 사용함
	 public class JTextFieldLimit extends PlainDocument{
			private int lim;     //제한길이
			public JTextFieldLimit(int lim)    //lim이 parameter
			{
				super();
				this.lim=lim;
			}
	 
	 }
	
}
