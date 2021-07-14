package pk_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest3 {

	public static void main(String[] args) {
		//awt.Toolkit *Singleton
		//Toolkit beep()=beep음 출력
		//중앙값=width/2, height/2
		
		Frame fr=new Frame("세 번째");
		
		fr.setSize(400, 400);
		
		//Toolkit을 통해 모니터 해상도 얻어오기
		Toolkit tk=Toolkit.getDefaultToolkit();
		
		//1초 간격으로 beep음 출력
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			tk.beep();
		}
		
		//화면의 중앙에 프레임을 위치 *화면 해상도에 따라 다를 수 있다.
		Dimension display=tk.getScreenSize(); //해상도 얻어오기
		
		int monitorW=display.width;
		int monitorH=display.height;
		
		//모니터 가로, 세로의 중앙에서 프레임의 가로, 세로의 중앙값 얻어오기
		int x=monitorW/2-fr.getWidth()/2;
		int y=monitorH/2-fr.getHeight()/2;
		
		fr.setLocation(x, y);
		fr.setVisible(true);
	}
}
