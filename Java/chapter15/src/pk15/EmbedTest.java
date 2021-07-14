package pk15;

import javax.swing.JOptionPane;

//out class
class Out{
	static int a=1; //객체 생성과 상관없이 사용 가능 *독립적
	int b; //객체를 통해서만 사용 가능
	
	public static class In{
		String InFunc() {
			return a+"번째 static 내부 클래스입니다.";
		}
		
	}
}

public class EmbedTest {

	public static void main(String[] args) {
		String str="";
		
		//main 클래스 객체 생성 생략 *static은 객체 없이 클래스명으로 접근
		Out.In obj=new Out.In();
		
		str=obj.InFunc();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
	}
}
