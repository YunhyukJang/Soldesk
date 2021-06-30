package pk16;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person=new Person();
		
		//방법 1. getClass()=Object에서 제공하는 메서드로 클래스의 정보를 가져온다.
		Class pClass1=person.getClass();
		
		System.out.println(pClass1.getName()); //정보 중에서 이름을 get
		
		//방법 2. 직접 클래스명으로 클래스의 정보를 가져온다.
		Class pClass2=Person.class;
		
		System.out.println(pClass2.getName()); //정보 중에서 이름을 get
		
		//방법 3. 클래스명을 알고있을 경우
		//찾는 클래스가 없을 경우 ClassNotFoundException이 발생하도록 유도한다.
		Class pClass3=Class.forName("pk16.Person");
		
		System.out.println(pClass3.getName());
	}
}
