package pk_frame;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {

	public static void main(String[] args) {
		Frame f=new Frame("메뉴");
		
		f.setSize(300, 200);
		
		MenuBar mb=new MenuBar(); //Menu 공간 확보
		Menu mFile=new Menu("File"); //Menu 구성
		
		//Menu 기능 구현
		MenuItem miNew=new MenuItem("New");
		MenuItem miOpen=new MenuItem("Open File...");
		MenuItem miSave=new MenuItem("Save");
		MenuItem miClose=new MenuItem("Close");
		
		//하위 Menu 구성
		Menu print=new Menu("Print");
		
		MenuItem printSetup=new MenuItem("Print SetUp");
		MenuItem printPre=new MenuItem("Print Preview");
		
		print.add(printSetup);
		print.add(printPre);
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		mb.add(mFile); //MenuBar에 Menu 붙히기
		
		f.setMenuBar(mb); //Frame에 MenuBar 붙히기
		f.setVisible(true);
		
		printSetup.addActionListener(new MyMenu());
		miClose.addActionListener(new MyMenu());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
