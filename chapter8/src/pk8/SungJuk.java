package pk8;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//멤버 변수=필드
	private String Std_num;
	private String Std_name;
	private int Java, Python, BigData;
	
	//생성자
	
	//메서드
	public void Sum() {
		System.out.println("합계="+(Java+Python+BigData));
	}
	
	public void Avg() {
		System.out.println("평균="+(Java+Python+BigData)/3);
	}

	public static void main(String[] args) {
		SungJuk rec=new SungJuk();
		
		rec.Std_num=JOptionPane.showInputDialog("학번:");
		rec.Std_name=JOptionPane.showInputDialog("성명:");
		rec.Java=Integer.parseInt(JOptionPane.showInputDialog("Java:"));
		rec.Python=Integer.parseInt(JOptionPane.showInputDialog("Python:"));
		rec.BigData=Integer.parseInt(JOptionPane.showInputDialog("BigData:"));
		
		System.out.println(rec.Std_num+", "+rec.Std_name+"의 성적입니다.");
		
		rec.Sum();
		rec.Avg();
	}
}
