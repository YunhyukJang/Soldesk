package pk_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTest1_Panel {

	public static void main(String[] args) {
		Frame frame=new Frame("문장 입력기");
		
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		
		//폰트
		Font font=new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		//NORTH
		//Panel의 기본은 FlowLayout
		Panel pNorth=new Panel();
		
		pNorth.setBackground(Color.GREEN);
		
		TextField tf=new TextField(10); //텍스트 상자의 길이
		Button btn=new Button("입력");
		
		btn.setEnabled(false); //기본 비활성화
		
		pNorth.setFont(font);
		pNorth.add(tf);
		pNorth.add(btn);
		
		//CENTER
		TextArea ta=new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//SOUTH
		Panel pSouth=new Panel();
		
		pSouth.setBackground(Color.BLUE);
		pSouth.setFont(font);
		
		Button btnSave=new Button("저장");
		Button btnClose=new Button("닫기");
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		//컴포넌트 배치
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setResizable(false); //창 크기 조절
		
		//기능 구현
		
		//TextField에 값이 들어간 경우만 입력 버튼 활성화
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")){
					btn.setEnabled(false);
				}else{
					btn.setEnabled(true);
				}
				
			}
			
		});
		
		//Enter
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//TextField에 Enter값이 감지되면 아래 TextArea에 내용 추가
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					ta.append(tf.getText()+"\n");
					
					//TextField를 비우고 Focus 이동
					tf.setText("");
					tf.requestFocus();	
				}
				
			}
			
		});
		
		//입력 버튼
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(tf.getText());
				ta.append(tf.getText()+"\n");
				
				//TextField를 비우고 Focus 이동
				tf.setText("");
				tf.requestFocus();	
			}
			
		});
		
		//저장 버튼
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message=ta.getText();
				
				try {
					//FileDialog=경로 잡기 *save, load할 때 사용하는 대화 상자
					FileDialog fd=new FileDialog(frame, "저장", FileDialog.SAVE);
					
					fd.setVisible(true);
					
					//확인
					System.out.println(fd.getDirectory()+fd.getFile());
					
					String path=fd.getDirectory()+fd.getFile();
					
					if(!message.equals("")) {
						//stream으로 path경로에 한 번에 저장
						FileWriter fw=new FileWriter(path); //한 번에 문자 단위 쓰기
						BufferedWriter bw=new BufferedWriter(fw); //속도 향상
						
						bw.write(message);

						//FileDialog의 취소 버튼을 누르지않고 정상적으로 저장한 경우
						if(fd.getFile() != null){
							JOptionPane.showMessageDialog(frame, path+"\n경로에 저장했습니다.");
						}
						
						bw.close();
					}else{
						//TextArea에 기록할 내용이 없을 경우
						JOptionPane.showMessageDialog(frame, "저장할 내용이 없습니다.");
					}
					
				}catch(IOException ioe) {
					System.out.println(ioe);
				}
				
			}
			
		});
		
		//닫기 버튼
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		//윈도우 자체 X 버튼
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				
				System.exit(0);
			}
			
		});
	}
}
