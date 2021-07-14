package pk_frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f=new Frame("설문조사");
		
		f.setBounds(500, 100, 800, 250);
		f.setLayout(new FlowLayout());
		
		Label q1=new Label("1. 관심 분야");
		
		Checkbox news=new Checkbox("news", true);
		Checkbox sports=new Checkbox("sports");
		Checkbox movie=new Checkbox("movie");
		Checkbox music=new Checkbox("music");
		
		//Checkbox 선택 여부 판단
		news.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str=e.getStateChange() == 1? "뉴스 선택":"뉴스 미선택";
				
				System.out.println(str);
			}
			
		});
		
		sports.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str=e.getStateChange() == 1? "스포츠 선택":"스포츠 미선택";
				
				System.out.println(str);
			}
			
		});
		
		movie.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str=e.getStateChange() == 1? "영화 선택":"영화 미선택";
				
				System.out.println(str);
			}
			
		});
		
		music.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str=e.getStateChange() == 1? "음악 선택":"음악 미선택";
				
				System.out.println(str);
			}
			
		});
		
		Font font=new Font("맑은고딕", Font.BOLD, 30);
		
		q1.setFont(font);
		
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		//배타적 선택:여러 개중 하나만 선택 가능
		Label q2=new Label("2. 한 달 시청 빈도");
		
		CheckboxGroup group=new CheckboxGroup();
		
		Checkbox one=new Checkbox("한 번", group, true);
		Checkbox two=new Checkbox("두 번", group, false);
		Checkbox three=new Checkbox("세 번", group, false);
		
		one.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("한 번");
			}
			
		});
		
		two.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("두 번");
			}
			
		});
		
		three.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("세 번");
			}
			
		});
		
		q2.setFont(font);
		
		f.add(q2);
		f.add(one);
		f.add(two);
		f.add(three);
		
		f.setVisible(true);
	}
}
