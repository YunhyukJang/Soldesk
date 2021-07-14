package pk_frame;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f=new Frame("설문조사");
		
		f.setSize(500, 250);
		f.setLocation(400, 100);
		f.setLayout(null); //자동 배치 끄기
		
		Choice day=new Choice();
		
		day.add("요일 선택");
		day.add("Sunday");
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		
		//자동 배치를 껐으므로 현재 크기가 반영되고, 높이는 요소 사이즈에 따라 결정되므로 의미가 없다.
		day.setSize(150, 0);
		day.setLocation(50, 100);
		
		//방법 1.
		//day.addItemListener(new ChoiceHandler());
		
		//방법 2.
		day.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(day.getSelectedItem());
			}
			
		});
		
		f.add(day);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
