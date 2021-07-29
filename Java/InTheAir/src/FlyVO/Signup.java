package FlyVO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;

import Frame.FlyFrameBase;
import Frame.FlyFrameBegin2;
import Frame.FlyFrameBegin;
import Frame.FlyLogin2;
import Frame.FlyLogin;

import java.awt.*;

public class Signup extends JFrame {// 회원가입화면
	public Signup(){
		JPanel p = new JPanel();
	  	JLabel l1= new JLabel("이름");	
        JLabel l2= new JLabel("아이디");
        JLabel l3 = new JLabel("패스워드");
        JLabel l4 = new JLabel("주소");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        TextField t3 = new TextField();
        JTextField t4 = new JTextField();        
        add(t1);
        add(t2);
        add(t3);
        add(t4);        
        t3.setEchoChar('*');
        JButton j1 = new JButton("저장");
        JButton j2 = new JButton("취소");
        add(j1);
        add(j2);
        l1.setBounds(40, 50, 40, 40);
        l2.setBounds(40, 95, 40, 40);
        l3.setBounds(40, 135, 60, 40);
        l4.setBounds(40, 175, 40, 40);
       
        t1.setBounds(120, 50, 280, 30);
        t2.setBounds(120, 95, 280, 30);
        t3.setBounds(120, 135, 280, 30);
        t4.setBounds(120, 175, 280, 30);
        
        j1.setBounds(135, 330, 80, 30);
        j2.setBounds(250, 330, 80, 30); 
        
        Font font1= new Font("monospaced",Font.CENTER_BASELINE,16);
        j1.setFont(font1);
        j2.setFont(font1);
        
        setLayout(null);
	  	ImageIcon back=new ImageIcon("backg2.jpg");
		JLabel backimg=new JLabel(back);
		backimg.setSize(500,500);
		backimg.setLocation(0,0);
	        
	    add(p);
	    add(backimg);
		setSize(500,500);
		
		setTitle("회원가입");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        j1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComponent comp = (JComponent) e.getSource();
				// 스윙 최상위에서 끌고온다
				Window win = SwingUtilities.getWindowAncestor(comp);				
				Flydata data=new Flydata();
				FlyPlaneDAO dao=new FlyPlaneDAO();
				dao.addData(t1.getText(),t2.getText(),t3.getText(),t4.getText());
				//dao.add(data);				
				JOptionPane.showMessageDialog(null, t2.getText()+"님의 회원가입이 완료되었습니다!!");
				FlyFrameBase.getInstance(new FlyLogin(t2.getText())); //아이디값 가지고 넘어가				
				win.dispose();
			}
		});        
	
	
	j2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			FlyFrameBase.getInstance(new FlyLogin2());
			
		}
	});
	
       
	}
}
