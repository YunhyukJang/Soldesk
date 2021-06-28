package pk14;

public class IntegerTest {

	public static void main(String[] args) {
		//Integer i=new Integer(100); *권장하지 않음
		
		Integer num=100;
		
		int iNum=num.intValue(); //Integer 클래스에서 값만 받음
		int jNum=200;
		int sum=iNum+jNum;
		
		System.out.println(sum);
		
		//Unboxing
		int total=num+jNum; //num.intValue()으로 변환
		
		System.out.println(total);
		
		//Boxing=Auto boxing
		Integer i=jNum;
		
		System.out.println(i); //Integer.valueOf()으로 변환
	}
}
