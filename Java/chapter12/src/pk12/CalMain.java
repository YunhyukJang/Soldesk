package pk12;

public class CalMain {

	public static void main(String[] args) {
		CalPlus calP=new CalPlus();
		
		System.out.println("CalPlus:"+calP.getResult(15, 15));
		
		CalMinus calM=new CalMinus();
		
		System.out.println("CalMinus:"+calM.getResult(30, 15));
	}
}
