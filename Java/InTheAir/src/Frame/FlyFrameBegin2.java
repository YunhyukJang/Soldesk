package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import FlyVO.Signup;

public class FlyFrameBegin2 extends JPanel{//로그인 성공시 메인메뉴
	public FlyFrameBegin2(){
		setLayout(null);
		TextField b1 = new TextField();//아이디 입력창
		add(b1);
		TextField b2 = new TextField();//비번 입력창
		add(b2);
		b2.setEchoChar('*');//암호화
		
		JButton b3 = new JButton("로그인");//버튼
		add(b3);
		JButton b4 = new JButton("회원가입");//버튼
		add(b4);
		JLabel t1 = new JLabel("여행의 즐거움과 설레임이 가득한");
		add(t1);
		JLabel t2 = new JLabel(" In The Airplane ");
		add(t2);
		
		JPanel p = new JPanel();
		p.setLayout(null);//직접 버튼의 크기와 위치를 입력할께
        JLabel label = new JLabel(new ImageIcon("login.jpg"));
		add(label);
		label.setBounds(0, 0, 600, 800);//이미지 위치 크기 조절
		
		
		b1.setBounds(250, 590, 200, 30);// 로그인 적는창
		b2.setBounds(250, 630, 200, 30);//패스워드 적는창
		b3.setBounds(465, 590, 100, 30);//로그인 버튼
		b4.setBounds(465, 630, 100, 30);//회원가입 버튼
		t1.setBounds(40, 50, 500, 30);
		t2.setBounds(25, 95, 500, 45);
		
		Font font= new Font("monospaced",Font.ITALIC,30);//여행의 즐거움과 설레임이 가득한
		Font font2= new Font("monospaced",Font.ITALIC,40);//In The Airplane
		Font font3= new Font("monospaced",Font.ITALIC,16);
		
		t1.setFont(font);
		t1.setForeground(Color.white);
		t2.setFont(font2);
		t2.setForeground(Color.white);
		
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b4.setFont(font3);
		
		add(p);
		
		setSize(600, 800);//전체 창 조절
		
		setVisible(true);
		
		//요건 이벤트로 사용자가 버튼을 클릭했을때 이벤트 발생
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				JComponent comp = (JComponent) e.getSource();
				// 스윙 최상위에서 끌고온다
				Window win = SwingUtilities.getWindowAncestor(comp);
				Signup f2= new Signup();//여기로 이동해
				win.dispose();
			}
		});;
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {//로그인 할때 
				outer:try{
					String s;
					String[] array= {""};
					BufferedReader bos = new BufferedReader(new FileReader("회원명단.txt"));
					while((s=bos.readLine())!=null){
						array=s.split("/");
					 if(b1.getText().equals(array[1])&&b2.getText().equals(array[2]))
						{
						JOptionPane.showMessageDialog(null, b1.getText()+"님 로그인이 되었습니다!!");
						System.out.println(b1.getText());
						JComponent comp = (JComponent) e2.getSource();
						Window win = SwingUtilities.getWindowAncestor(comp);
		
						FlyFrameBase.getInstance(new FlyFrameBegin(b1.getText()));
					
						;
						win.dispose();
						}
						else 
						{
						JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
						break outer;
						}
					}
					bos.close();
					
				}catch (IOException E10){
					E10.printStackTrace();
				}
			}
		});
	}

}

	

