package Frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import FlyVO.FlyPlaneDAO;
import FlyVO.Flydata;
import Frame.FlyLogin2;

public class FlyplaneMypage extends JPanel {
	
	public FlyplaneMypage(Flydata data) {

		setBackground(new Color(153, 204, 255));
		setLayout(null);
		setSize(600, 800);

		ImageIcon back = new ImageIcon("backg2.jpg");
		JLabel backimg = new JLabel(back);
		backimg.setSize(600, 800);
		backimg.setLocation(0, -20);

		JLabel lbl = new JLabel(data.getId() + "님의 마이페이지");
		lbl.setFont(new Font("DX영화자막", Font.BOLD, 16));
		lbl.setSize(200, 30);
		lbl.setLocation(204, 60);

		JLabel lname = new JLabel("이름");
		lname.setFont(new Font("DX영화자막", Font.BOLD, 15));
		lname.setSize(200, 30);
		lname.setLocation(185, 140);

		JLabel lmile = new JLabel("마일리지");
		lmile.setFont(new Font("DX영화자막", Font.BOLD, 15));
		lmile.setSize(200, 30);
		lmile.setLocation(155, 180);

		JLabel ladd = new JLabel("주소");
		ladd.setFont(new Font("DX영화자막", Font.BOLD, 15));
		ladd.setSize(200, 30);
		ladd.setLocation(185, 220);	

		JLabel lpass = new JLabel("비밀번호");
		lpass.setSize(150, 30);
		lpass.setLocation(155, 260);
		lpass.setFont(new Font("DX영화자막", Font.BOLD, 15));

		JLabel lpass2 = new JLabel("비밀번호 확인");
		lpass2.setSize(150, 30);
		lpass2.setLocation(120, 300);
		lpass2.setFont(new Font("DX영화자막", Font.BOLD, 15));

		JTextField name = new JTextField(data.getName());
		name.setFont(new Font("DX영화자막", Font.BOLD, 15));
		name.setSize(150, 30);
		name.setLocation(220, 140);
		name.setEditable(false);

		// 결제금액의 n%
		TextField Mileage = new TextField(/*data.getPoint()*/"2800");
		Mileage.setFont(new Font("DX영화자막", Font.BOLD, 14));
		Mileage.setSize(150, 30);
		Mileage.setLocation(220, 180);
		Mileage.setEditable(false);

		TextField address = new TextField(data.getAddress());
		address.setFont(new Font("DX영화자막", Font.BOLD, 14));
		address.setSize(150, 30);
		address.setLocation(220, 220);
		address.setEditable(false);		
		
		TextField pass = new TextField(data.getPw());
		pass.setEchoChar('●');
		pass.setSize(150, 30);
		data.setPw(pass.getText());
		pass.setLocation(220, 260);
		pass.setEditable(false);

		TextField pass2 = new TextField();
		pass2.setEchoChar('●');
		pass2.setSize(150, 30);
		data.setPw(pass2.getText());
		pass2.setLocation(220, 300);
		pass2.setEditable(false);

		JButton backbtn = new JButton("뒤로가기");
		backbtn.setSize(170, 70);
		backbtn.setLocation(15, 680);
		backbtn.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		backbtn.setBackground(new Color(0xF6F6F6));
		

		JButton change = new JButton("정보수정");
		change.setSize(170, 70);
		change.setLocation(208, 680);
		change.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		change.setBackground(new Color(0xF6F6F6));
		
		JButton ok = new JButton("확인");
		
		
		ok.setFont(new Font("DX영화자막", Font.BOLD, 14));
		ok.setSize(170, 70);
		ok.setLocation(400, 680);
		ok.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		ok.setBackground(new Color(0xF6F6F6));

		JLabel reserveView = new JLabel(data.getId() + "님의 예약 조회");
		reserveView.setSize(200, 100);
		reserveView.setLocation(250, 15);
		reserveView.setFont(new Font("DX영화자막", Font.BOLD, 14));
		
		
		

		/*String infotitle[] = { "구간", "출발시간", "도착시간", "출발일", "직항 여부", "비행 시간", "편명" };

		//String infodata[][] = {
				{ "구간1", "ICN 서울 T1 08:00 ", "GUM 괌 T1 12:25", "2021-10-12(화)", "직항", "04h20m", "D281" },
				{ "구간2", "GUM 괌 T1 16:00 ", "ICN 서울 T1 18:25", "2021-10-14(목)", "직항", "04h20m", "D284" } };
*/
		
		JPanel CenterSet = new JPanel();
		CenterSet.setBounds(25, 380, 527, 100);
	
		FlypaymentGuam Guam=null;
		FlypaymentTokyo Tokyo=null;
		FlypaymentAuckland Aucland=null;
		FlypaymentBali Bali=null;
		FlypaymentHawaii Hawaii=null;
		FlypaymentParis Paris=null;
		FlypaymentZurich Zurich=null;
		FlypaymentLA LA=null;
		
		
	
		
		
		
		
		
	
		
		if(Guam==null) {
			Guam=new FlypaymentGuam();
			Integer a=Guam.test.size();
			System.out.println(a);
		if(a==1) {
		
			String[] test1=Guam.arr();
			String[][] test2=Guam.arr1();
			
			
			DefaultTableModel model = new DefaultTableModel(test2,test1);
			JTable table = new JTable(model);

			// JTable 스크롤
			JScrollPane sp = new JScrollPane(table);

			// 테이블 크기 설정
			sp.setPreferredSize(new Dimension(528, 100));

			CenterSet.add(sp); // 패널에 테이블 추가
			CenterSet.setVisible(false);
			add(CenterSet);
			}
		}
			
			
			if(Tokyo==null) {
				Tokyo=new FlypaymentTokyo();
				Integer b=Tokyo.test.size();
				System.out.println(b);
				if(b==2) {
				
					String[] test1=Tokyo.arr();
					String[][] test2=Tokyo.arr1();
					
					
					DefaultTableModel model = new DefaultTableModel(test2,test1);
					JTable table = new JTable(model);

					// JTable 스크롤
					JScrollPane sp = new JScrollPane(table);

					// 테이블 크기 설정
					sp.setPreferredSize(new Dimension(528, 100));

					CenterSet.add(sp); // 패널에 테이블 추가
					CenterSet.setVisible(false);
					add(CenterSet);
					
				}
			}
				
				if(LA==null) {
					LA=new FlypaymentLA();
					Integer c=LA.test.size();
					if(c==3) {
						String[] test1=LA.arr();
						String[][] test2=LA.arr1();
						
						
						DefaultTableModel model = new DefaultTableModel(test2,test1);
						JTable table = new JTable(model);

						// JTable 스크롤
						JScrollPane sp = new JScrollPane(table);

						// 테이블 크기 설정
						sp.setPreferredSize(new Dimension(528, 100));

						CenterSet.add(sp); // 패널에 테이블 추가
						CenterSet.setVisible(false);
						add(CenterSet);
						
					}
				}
							
					
					 if(Bali==null) {
							Bali=new FlypaymentBali();
							Integer d=Bali.test.size();
							if(d==4) {
								String[] test1=Bali.arr();
								String[][] test2=Bali.arr1();
								
								
								DefaultTableModel model = new DefaultTableModel(test2,test1);
								JTable table = new JTable(model);

								// JTable 스크롤
								JScrollPane sp = new JScrollPane(table);

								// 테이블 크기 설정
								sp.setPreferredSize(new Dimension(528, 100));

								CenterSet.add(sp); // 패널에 테이블 추가
								CenterSet.setVisible(false);
								add(CenterSet);
								
							}
						}
					
					if(Aucland==null) {
						Aucland=new FlypaymentAuckland();
						Integer e=Aucland.test.size();
						if(e==5) {
							String[] test1=Aucland.arr();
							String[][] test2=Aucland.arr1();
							
							
							DefaultTableModel model = new DefaultTableModel(test2,test1);
							JTable table = new JTable(model);

							// JTable 스크롤
							JScrollPane sp = new JScrollPane(table);

							// 테이블 크기 설정
							sp.setPreferredSize(new Dimension(528, 100));

							CenterSet.add(sp); // 패널에 테이블 추가
							CenterSet.setVisible(false);
							add(CenterSet);
							
						}
					}
							
							//--------------------------------------
							
							if(Zurich==null) {
								Zurich=new FlypaymentZurich();
								Integer f=Zurich.test.size();
								if(f==6) {
									String[] test1=Zurich.arr();
									String[][] test2=Zurich.arr1();
									
									
									DefaultTableModel model = new DefaultTableModel(test2,test1);
									JTable table = new JTable(model);

									// JTable 스크롤
									JScrollPane sp = new JScrollPane(table);

									// 테이블 크기 설정
									sp.setPreferredSize(new Dimension(528, 100));

									CenterSet.add(sp); // 패널에 테이블 추가
									CenterSet.setVisible(false);
									add(CenterSet);
									
								}
							}
								
								//----------------------------------------------
								if(Paris==null) {
									Paris=new FlypaymentParis();
									Integer g=Paris.test.size();
									if(g==7) {
										String[] test1=Paris.arr();
										String[][] test2=Paris.arr1();
										
										
										DefaultTableModel model = new DefaultTableModel(test2,test1);
										JTable table = new JTable(model);

										// JTable 스크롤
										JScrollPane sp = new JScrollPane(table);

										// 테이블 크기 설정
										sp.setPreferredSize(new Dimension(528, 100));

										CenterSet.add(sp); // 패널에 테이블 추가
										CenterSet.setVisible(false);
										add(CenterSet);
										
									}
			
								}
								
								
								
								
								
								
								//--------------------오지마-----------------------------
								if(Hawaii==null) {
									Hawaii=new FlypaymentHawaii();
									Integer h=Hawaii.test.size();
									if(h==8) {
										String[] test1=Hawaii.arr();
										String[][] test2=Hawaii.arr1();
										
										
										DefaultTableModel model = new DefaultTableModel(test2,test1);
										JTable table = new JTable(model);

										// JTable 스크롤
										JScrollPane sp = new JScrollPane(table);

										// 테이블 크기 설정
										sp.setPreferredSize(new Dimension(528, 100));

										CenterSet.add(sp); // 패널에 테이블 추가
										CenterSet.setVisible(false);
										add(CenterSet);
										
									}				
			
								}				
		
					
	
		
		
	/*
		DefaultTableModel model = new DefaultTableModel(infodata, infotitle);
		JTable table = new JTable(model);

		// JTable 스크롤
		JScrollPane sp = new JScrollPane(table);

		// 테이블 크기 설정
		sp.setPreferredSize(new Dimension(528, 100));

		CenterSet.add(sp); // 패널에 테이블 추가
		CenterSet.setVisible(true);
		add(CenterSet);
*/
		
		  JButton reserve = new JButton("예약조회"); 
		  reserve.setSize(170, 70);
		  reserve.setLocation(400, 590);
		  reserve.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		  reserve.setBackground(new Color(0xF6F6F6));
		  
		  JButton cancel = new JButton("조회끄기");
		  cancel.setSize(170, 70);
		  cancel.setLocation(400, 590);
		  cancel.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		  cancel.setBackground(new Color(0xF6F6F6));
		  
		// 텍스트필드
		add(name);
		add(address);
		add(Mileage);
		add(pass);
		add(pass2);

		// 라벨
		add(lbl);
		add(lname);
		add(ladd);
		add(lmile);
		add(lpass);
		add(lpass2);

		// 버튼
		add(backbtn);
		add(change);
		add(reserve);
		add(cancel);
		add(ok);

		// 배경
		add(backimg);
		
		// 뒤로가기
		backbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				FlyFrameBase.getInstance(new FlyFrameBegin(data.getId()));
				win.dispose();
			}
		});

		/*
		 * // 정보수정 이벤트 change.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { JComponent comp =
		 * (JComponent) e.getSource(); // 스윙 최상위에서 끌고온다 Window win =
		 * SwingUtilities.getWindowAncestor(comp); Base.getInstance(new reLogin(data));
		 * win.dispose(); // 이 부분은 질문을 선생님께 질문 할 곳 } });
		 */

		change.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				name.setEditable(true);
				address.setEditable(true);
				pass.setEditable(true);
				pass2.setEditable(true);
				ok.setEnabled(true);
			}
		});

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "확인되었습니다.");
				name.setEditable(false);
				address.setEditable(false);
				pass.setEditable(false);
				pass2.setEditable(false);
				ok.setEnabled(false);
				Flydata data = new Flydata();
				data.setName(name.getText());
				data.setAddress(address.getText());
				data.setPw(pass.getText());
			}
		});

		// 예약조회 이벤트

		
		reserve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CenterSet.setVisible(true);
				reserve.setVisible(false);
				cancel.setVisible(true);
			}
		});
	
		 cancel.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					CenterSet.setVisible(false);
					reserve.setVisible(true);
					cancel.setVisible(false);
				}
			});
	

	}

}
