package pk9;

public class OverloadMain {

	public static void main(String[] args) {
		Overload obj1=new Overload(5, 120);
		
		obj1.Disp();
		
		Overload obj2=new Overload(5, 120, "신짱구");
		
		obj2.Disp();
	}
}
