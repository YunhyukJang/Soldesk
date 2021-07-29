package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import FlyVO.FlyMyPlace;
import FlyVO.FlyPlace;
import FlyVO.FlyPlaceDAO;

public class FlyZurichSeat extends JPanel{

	private Image backImg;
	public FlyZurichSeat() {
		FlyMyPlace mp = new FlyMyPlace();
		backImg=Toolkit.getDefaultToolkit().getImage("비행2.jpg");
		// 이미지 설정해주기
		setLayout(null);
		setSize(600, 800);
		
		String str = "취리히 비행기 좌석 안내도";
		JLabel Zurich = new JLabel(str);
		Zurich.setBounds(98, 10, 600, 50);
		Zurich.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		Zurich.setForeground(new Color(0xFFFFFF));
		add(Zurich);
		
		JButton A1 = new JButton("A1");
		A1.setBackground(new Color(0xF6F6F6));
		A1.setBounds(10, 80, 50, 50);
	    A1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A1");
			}
	    });
		add(A1);
	    
		
	    JButton A2 = new JButton("A2");
		A2.setBackground(new Color(0xF6F6F6));
		A2.setBounds(70, 80, 50, 50);
		A2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A2");
			}
	    });
	    add(A2);
	    
	    JButton A3 = new JButton("A3");
	    A3.setBackground(new Color(0xF6F6F6));
	    A3.setBounds(130, 80, 50, 50);
	    A3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A3");
			}
	    });
	    add(A3);
	    
	    JButton A4 = new JButton("A4");
	    A4.setBackground(new Color(0xF6F6F6));
	    A4.setBounds(235, 80, 50, 50);
	    A4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A4");
			}
	    });
	    add(A4);
	    
	    JButton A5 = new JButton("A5");
	    A5.setBackground(new Color(0xF6F6F6));
	    A5.setBounds(295, 80, 50, 50);
	    A5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A5");
			}
	    });
	    add(A5);
	    
	    JButton A6 = new JButton("A6");
	    A6.setBackground(new Color(0xF6F6F6));
	    A6.setBounds(400, 80, 50, 50);
	    A6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A6");
			}
	    });
	    add(A6);
	    
	    JButton A7 = new JButton("A7");
	    A7.setBackground(new Color(0xF6F6F6));
	    A7.setBounds(460, 80, 50, 50);
	    A7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("A7");
			}
	    });
	    add(A7);
	    
	    JButton A8 = new JButton("A8");
	    A8.setBackground(new Color(0xF6F6F6));
	    A8.setBounds(520, 80, 50, 50);
	    A8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyMyPlace mp = new FlyMyPlace();
				mp.setSeat("A8");
			}
	    });
	    add(A8);
	    
	    JButton B1 = new JButton("B1");
	    B1.setBackground(new Color(0xF6F6F6));
	    B1.setBounds(10, 170, 50, 50);
	    B1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyMyPlace mp = new FlyMyPlace();
				mp.setSeat("B1");
			}
	    });
	    add(B1);
		
	    JButton B2 = new JButton("B2");
	    B2.setBackground(new Color(0xF6F6F6));
	    B2.setBounds(70, 170, 50, 50);
	    B2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B2");
			}
	    });
	    add(B2);
	    
	    JButton B3 = new JButton("B3");
	    B3.setBackground(new Color(0xF6F6F6));
	    B3.setBounds(130, 170, 50, 50);
	    B3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B3");
			}
	    });
	    add(B3);
	    
	    JButton B4 = new JButton("B4");
	    B4.setBackground(new Color(0xF6F6F6));
	    B4.setBounds(235, 170, 50, 50);
	    B4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B4");
			}
	    });
	    add(B4);
	    
	    JButton B5 = new JButton("B5");
	    B5.setBackground(new Color(0xF6F6F6));
	    B5.setBounds(295, 170, 50, 50);
	    B5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B5");
			}
	    });
	    add(B5);
	    
	    JButton B6 = new JButton("B6");
	    B6.setBackground(new Color(0xF6F6F6));
	    B6.setBounds(400, 170, 50, 50);
	    B6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B6");
			}
	    });
	    add(B6);
	    
	    JButton B7 = new JButton("B7");
	    B7.setBackground(new Color(0xF6F6F6));
	    B7.setBounds(460, 170, 50, 50);
	    B7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B7");
			}
	    });
	    add(B7);
	    
	    JButton B8 = new JButton("B8");
	    B8.setBackground(new Color(0xF6F6F6));
	    B8.setBounds(520, 170, 50, 50);
	    B8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("B8");
			}
	    });
	    add(B8);
	    
	    JButton C1 = new JButton("C1");
	    C1.setBackground(new Color(0xF6F6F6));
	    C1.setBounds(10, 260, 50, 50);
	    C1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.setSeat("C1");
			}
	    });
	    add(C1);
		
	    JButton C2= new JButton("C2");
	    C2.setBackground(new Color(0xF6F6F6));
	    C2.setBounds(70, 260, 50, 50);
	    C2.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C2");
	 			}
	 	    });
	    add(C2);
	    
	    JButton C3 = new JButton("C3");
	    C3.setBackground(new Color(0xF6F6F6));
	    C3.setBounds(130, 260, 50, 50);
	    C3.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C3");
	 			}
	 	    });
	    add(C3);
	    
	    JButton C4 = new JButton("C4");
	    C4.setBackground(new Color(0xF6F6F6));
	    C4.setBounds(235, 260, 50, 50);
	    C4.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C4");
	 			}
	 	    });
	    add(C4);
	    
	    JButton C5 = new JButton("C5");
	    C5.setBackground(new Color(0xF6F6F6));
	    C5.setBounds(295, 260, 50, 50);
	    C5.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C5");
	 			}
	 	    });
	    add(C5);
	    
	    JButton C6 = new JButton("C6");
	    C6.setBackground(new Color(0xF6F6F6));
	    C6.setBounds(400, 260, 50, 50);
	    C6.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C6");
	 			}
	 	    });
	    add(C6);
	    
	    JButton C7 = new JButton("C7");
	    C7.setBackground(new Color(0xF6F6F6));
	    C7.setBounds(460, 260, 50, 50);
	    C7.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C7");
	 			}
	 	    });
	    add(C7);
	    
	    JButton C8 = new JButton("C8");
	    C8.setBackground(new Color(0xF6F6F6));
	    C8.setBounds(520, 260, 50, 50);
	    C8.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("C8");
	 			}
	 	    });
	    add(C8);
	    
	    JButton D1 = new JButton("D1");
	    D1.setBackground(new Color(0xF6F6F6));
	    D1.setBounds(10, 350, 50, 50);
	    D1.addActionListener(new ActionListener() {
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				mp.setSeat("D1");
	 			}
	 	    });
	    add(D1);
		
	    JButton D2= new JButton("D2");
	    D2.setBackground(new Color(0xF6F6F6));
	    D2.setBounds(70, 350, 50, 50);
	    D2.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D2");
 			}
 	    });
	    add(D2);
	    
	    JButton D3 = new JButton("D3");
	    D3.setBackground(new Color(0xF6F6F6));
	    D3.setBounds(130, 350, 50, 50);
	    D3.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D3");
 			}
 	    });
	    add(D3);
	    
	    JButton D4 = new JButton("D4");
	    D4.setBackground(new Color(0xF6F6F6));
	    D4.setBounds(235, 350, 50, 50);
	    D4.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D4");
 			}
 	    });
	    add(D4);
	    
	    JButton D5 = new JButton("D5");
	    D5.setBackground(new Color(0xF6F6F6));
	    D5.setBounds(295, 350, 50, 50);
	    D5.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D5");
 			}
 	    });
	    add(D5);
	    
	    JButton D6 = new JButton("D6");
	    D6.setBackground(new Color(0xF6F6F6));
	    D6.setBounds(400, 350, 50, 50);
	    D6.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D6");
 			}
 	    });
	    add(D6);
	    
	    JButton D7 = new JButton("D7");
	    D7.setBackground(new Color(0xF6F6F6));
	    D7.setBounds(460, 350, 50, 50);
	    D7.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D7");
 			}
 	    });
	    add(D7);
	    
	    JButton D8 = new JButton("D8");
	    D8.setBackground(new Color(0xF6F6F6));
	    D8.setBounds(520, 350, 50, 50);
	    D8.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("D8");
 			}
 	    });
	    add(D8);
	    
	    JButton E1 = new JButton("E1");
	    E1.setBackground(new Color(0xF6F6F6));
	    E1.setBounds(10, 440, 50, 50);
	    E1.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E1");
 			}
 	    });
	    add(E1);
		
	    JButton E2= new JButton("E2");
	    E2.setBackground(new Color(0xF6F6F6));
	    E2.setBounds(70, 440, 50, 50);
	    E2.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E2");
 			}
 	    });
	    add(E2);
	    
	    JButton E3 = new JButton("E4");
	    E3.setBackground(new Color(0xF6F6F6));
	    E3.setBounds(130, 440, 50, 50);
	    E3.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E3");
 			}
 	    });
	    add(E3);
	    
	    JButton E4 = new JButton("E4");
	    E4.setBackground(new Color(0xF6F6F6));
	    E4.setBounds(235, 440, 50, 50);
	    E4.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E4");
 			}
 	    });
	    add(E4);
	    
	    JButton E5 = new JButton("E5");
	    E5.setBackground(new Color(0xF6F6F6));
	    E5.setBounds(295, 440, 50, 50);
	    E5.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E5");
 			}
 	    });
	    add(E5);
	    
	    JButton E6 = new JButton("E6");
	    E6.setBackground(new Color(0xF6F6F6));
	    E6.setBounds(400, 440, 50, 50);
	    E6.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E6");
 			}
 	    });
	    add(E6);
	    
	    JButton E7 = new JButton("E7");
	    E7.setBackground(new Color(0xF6F6F6));
	    E7.setBounds(460, 440, 50, 50);
	    E7.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E7");
 			}
 	    });
	    add(E7);
	    
	    JButton E8 = new JButton("E8");
	    E8.setBackground(new Color(0xF6F6F6));
	    E8.setBounds(520, 440, 50, 50);
	    E8.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("E8");
 			}
 	    });
	    add(E8);
	    
	    JButton F1 = new JButton("F1");
	    F1.setBackground(new Color(0xF6F6F6));
	    F1.setBounds(10, 530, 50, 50);
	    F1.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F1");
 			}
 	    });
	    add(F1);
		
	    JButton F2= new JButton("F2");
	    F2.setBackground(new Color(0xF6F6F6));
	    F2.setBounds(70, 530, 50, 50);
	    F2.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F2");
 			}
 	    });
	    add(F2);
	    
	    JButton F3 = new JButton("F3");
	    F3.setBackground(new Color(0xF6F6F6));
	    F3.setBounds(130, 530, 50, 50);
	    F3.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F3");
 			}
 	    });
	    add(F3);
	    
	    JButton F4 = new JButton("F4");
	    F4.setBackground(new Color(0xF6F6F6));
	    F4.setBounds(235, 530, 50, 50);
	    F4.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F4");
 			}
 	    });
	    add(F4);
	    
	    JButton F5 = new JButton("F5");
	    F5.setBackground(new Color(0xF6F6F6));
	    F5.setBounds(295, 530, 50, 50);
	    F5.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F5");
 			}
 	    });
	    add(F5);
	    
	    JButton F6 = new JButton("F6");
	    F6.setBackground(new Color(0xF6F6F6));
	    F6.setBounds(400, 530, 50, 50);
	    F6.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F6");
 			}
 	    });
	    add(F6);
	    
	    JButton F7 = new JButton("F7");
	    F7.setBackground(new Color(0xF6F6F6));
	    F7.setBounds(460, 530, 50, 50);
	    F7.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F7");
 			}
 	    });
	    add(F7);
	    
	    JButton F8 = new JButton("F8");
	    F8.setBackground(new Color(0xF6F6F6));
	    F8.setBounds(520, 530, 50, 50);
	    F8.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("F8");
 			}
 	    });
	    add(F8);
	    
	    JButton G1 = new JButton("G1");
	    G1.setBackground(new Color(0xF6F6F6));
	    G1.setBounds(10, 620, 50, 50);
	    G1.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G1");
 			}
 	    });
	    add(G1);
		
	    JButton G2= new JButton("G2");
	    G2.setBackground(new Color(0xF6F6F6));
	    G2.setBounds(70, 620, 50, 50);
	    G2.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G2");
 			}
 	    });
	    add(G2);
	    
	    JButton G3 = new JButton("G3");
	    G3.setBackground(new Color(0xF6F6F6));
	    G3.setBounds(130, 620, 50, 50);
	    G3.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G3");
 			}
 	    });
	    add(G3);
	    
	    JButton G4 = new JButton("G4");
	    G4.setBackground(new Color(0xF6F6F6));
	    G4.setBounds(235, 620, 50, 50);
	    G4.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G4");
 			}
 	    });
	    add(G4);
	    
	    JButton G5 = new JButton("G5");
	    G5.setBackground(new Color(0xF6F6F6));
	    G5.setBounds(295, 620, 50, 50);
	    G5.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G5");
 			}
 	    });
	    add(G5);
	    
	    JButton G6 = new JButton("G6");
	    G6.setBackground(new Color(0xF6F6F6));
	    G6.setBounds(400, 620, 50, 50);
	    G6.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G6");
 			}
 	    });
	    add(G6);
	    
	    JButton G7 = new JButton("G7");
	    G7.setBackground(new Color(0xF6F6F6));
	    G7.setBounds(460, 620, 50, 50);
	    G7.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G7");
 			}
 	    });
	    add(G7);
	    
	    JButton G8 = new JButton("G8");
	    G8.setBackground(new Color(0xF6F6F6));
	    G8.setBounds(520, 620, 50, 50);
	    G8.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				mp.setSeat("G8");
 			}
 	    });
	    add(G8);
	    
	    A1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A1.setBackground(Color.BLACK);
            	A1.setEnabled(false);
            }
        });
		
	    A2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A2.setBackground(Color.BLACK);
            	A2.setEnabled(false);
            }
        });
	    
	    A3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A3.setBackground(Color.BLACK);
            	A3.setEnabled(false);
            }
        });
	    
	    A4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A4.setBackground(Color.BLACK);
            	A4.setEnabled(false);
            }
        });

	    A5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A5.setBackground(Color.BLACK);
            	A5.setEnabled(false);
            }
        });

	    A6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A6.setBackground(Color.BLACK);
            	A6.setEnabled(false);
            }
        });

	    A7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A7.setBackground(Color.BLACK);
            	A7.setEnabled(false);
            }
        });

	    A8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	A8.setBackground(Color.BLACK);
            	A8.setEnabled(false);
            }
        });
	    
	    B1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B1.setBackground(Color.BLACK);
            	B1.setEnabled(false);
            }
        });
		
	    B2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B2.setBackground(Color.BLACK);
            	B2.setEnabled(false);
            }
        });
	    
	    B3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B3.setBackground(Color.BLACK);
            	B3.setEnabled(false);
            }
        });
	    
	    B4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B4.setBackground(Color.BLACK);
            	B4.setEnabled(false);
            }
        });

	    B5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B5.setBackground(Color.BLACK);
            	B5.setEnabled(false);
            }
        });

	    B6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B6.setBackground(Color.BLACK);
            	B6.setEnabled(false);
            }
        });

	    B7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B7.setBackground(Color.BLACK);
            	B7.setEnabled(false);
            }
        });

	    B8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	B8.setBackground(Color.BLACK);
            	B8.setEnabled(false);
            }
        });

	    C1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C1.setBackground(Color.BLACK);
            	C1.setEnabled(false);
            }
        });
		
	    C2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C2.setBackground(Color.BLACK);
            	C2.setEnabled(false);
            }
        });
	    
	    C3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C3.setBackground(Color.BLACK);
            	C3.setEnabled(false);
            }
        });
	    
	    C4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C4.setBackground(Color.BLACK);
            	C4.setEnabled(false);
            }
        });

	    C5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C5.setBackground(Color.BLACK);
            	C5.setEnabled(false);
            }
        });

	    C6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C6.setBackground(Color.BLACK);
            	C6.setEnabled(false);
            }
        });

	    C7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C7.setBackground(Color.BLACK);
            	C7.setEnabled(false);
            }
        });

	    C8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	C8.setBackground(Color.BLACK);
            	C8.setEnabled(false);
            }
        });

	    D1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D1.setBackground(Color.BLACK);
            	D1.setEnabled(false);
            }
        });
		
	    D2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D2.setBackground(Color.BLACK);
            	D2.setEnabled(false);
            }
        });
	    
	    D3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D3.setBackground(Color.BLACK);
            	D3.setEnabled(false);
            }
        });
	    
	    D4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D4.setBackground(Color.BLACK);
            	D4.setEnabled(false);
            }
        });

	    D5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D5.setBackground(Color.BLACK);
            	D5.setEnabled(false);
            }
        });

	    D6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D6.setBackground(Color.BLACK);
            	D6.setEnabled(false);
            }
        });

	    D7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D7.setBackground(Color.BLACK);
            }
        });

	    D8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	D8.setBackground(Color.BLACK);
            	D8.setEnabled(false);
            }
        });

	    E1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E1.setBackground(Color.BLACK);
            	E1.setEnabled(false);
            }
        });
		
	    E2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E2.setBackground(Color.BLACK);
            	E2.setEnabled(false);
            }
        });
	    
	    E3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E3.setBackground(Color.BLACK);
            	E3.setEnabled(false);
            }
        });
	    
	    E4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E4.setBackground(Color.BLACK);
            	E4.setEnabled(false);
            }
        });

	    E5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E5.setBackground(Color.BLACK);
            	E5.setEnabled(false);
            }
        });

	    E6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E6.setBackground(Color.BLACK);
            	E6.setEnabled(false);
            }
        });

	    E7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E7.setBackground(Color.BLACK);
            	E7.setEnabled(false);
            }
        });

	    E8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	E8.setBackground(Color.BLACK);
            	E8.setEnabled(false);
            }
        });

	    F1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F1.setBackground(Color.BLACK);
            	F1.setEnabled(false);
            }
        });
		
	    F2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F2.setBackground(Color.BLACK);
            	F2.setEnabled(false);
            }
        });
	    
	    F3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F3.setBackground(Color.BLACK);
            	F3.setEnabled(false);
            }
        });
	    
	    F4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F4.setBackground(Color.BLACK);
            	F4.setEnabled(false);
            }
        });

	    F5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F5.setBackground(Color.BLACK);
            	F5.setEnabled(false);
            }
        });

	    F6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F6.setBackground(Color.BLACK);
            	F6.setEnabled(false);
            }
        });

	    F7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F7.setBackground(Color.BLACK);
            	F7.setEnabled(false);
            }
        });

	    F8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	F8.setBackground(Color.BLACK);
            	F8.setEnabled(false);
            }
        });

	    G1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G1.setBackground(Color.BLACK);
            	G1.setEnabled(false);
            }
        });
		
	    G2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G2.setBackground(Color.BLACK);
            	G2.setEnabled(false);
            }
        });
	    
	    G3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G3.setBackground(Color.BLACK);
            	G3.setEnabled(false);
            }
        });
	    
	    G4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G4.setBackground(Color.BLACK);
            	G4.setEnabled(false);
            }
        });

	    G5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G5.setBackground(Color.BLACK);
            	G5.setEnabled(false);
            }
        });

	    G6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G6.setBackground(Color.BLACK);
            	G6.setEnabled(false);
            }
        });

	    G7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G7.setBackground(Color.BLACK);
            	G7.setEnabled(false);
            }
        });

	    G8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
            @Override
            public void mouseClicked(MouseEvent e) {
            	G8.setBackground(Color.BLACK);
            	G8.setEnabled(false);
            }
            
        });
	
		//이전 페이지 Button
		JButton btnBack=new JButton("이전 페이지");
						
		btnBack.setBackground(new Color(0x5F00FF));
		btnBack.setSize(180, 70);
		btnBack.setLocation(1, 680);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 23));
		btnBack.setForeground(new Color(0xFFFFFF));
						
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyPlace sf=new FlyPlaceDAO().searchPlace("취리히");
				
				FlyFrameBase.getInstance(new FlyZurich(sf));
			}
							
		});
						
		add(btnBack);
		
		//결제하기 Button
		JButton btnPay=new JButton("결제 하기");
						
		btnPay.setBackground(new Color(0x5F00FF));
		btnPay.setSize(180, 70);
		btnPay.setLocation(403, 680);
		btnPay.setFont(new Font("나눔고딕코딩", Font.BOLD, 23));
		btnPay.setForeground(new Color(0xFFFFFF));
						
		btnPay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FlyFrameBase.getInstance(new FlypaymentZurich());
			}
							
		});
						
		add(btnPay);	
		
	}

	public void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(), this);
	}
}
