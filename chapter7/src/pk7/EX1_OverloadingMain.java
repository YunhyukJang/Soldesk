package pk7;

public class EX1_OverloadingMain {

	public static void main(String[] args) {
		//EX1_Overloading의 객체=ex
		EX1_Overloading ex=new EX1_Overloading();
		
		ex.getResult('A');
		ex.getResult(1);
		ex.getResult("Java");
		ex.getResult(1, "Java");
	}
}
