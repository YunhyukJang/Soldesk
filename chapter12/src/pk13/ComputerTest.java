package pk13;

public class ComputerTest {

	public static void main(String[] args) {
		//추상 클래스는 인스턴스(객체 생성)할 수 없다.
		//Computer c1=new Computer();
		Computer c2=new Desktop();
		//추상 클래스는 인스턴스(객체 생성)할 수 없다.
		//Computer c3=new Notebook();
		Computer c4=new MyNotebook();
		
		c2.typing();
		c4.typing();
	}
}
