package pk14;

public class ExtendsExampleMain {

	public static void main(String[] args) {
		//String
		ExtendsExample v1=new ExtendsExample();
		
		v1.setValue("Butter");
		
		System.out.println(v1.getValue());
		
		//Integer
		ExtendsExample v2=new ExtendsExample();
		
		v2.setValue(29); //Auto boxing(자동 형 변환 -> 객체)
		
		//Unboxing(ver5 이하)
		//int obj=(Integer)v2.getValue(); *Integer -> int
		
		//Unboxing(ver5 이상)
		int obj=(int)v2.getValue(); //Object
		
		System.out.println(obj);
	}
}
