package pk16;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person1=new Person("Harry Potter");
		
		System.out.println(person1.getName());
		System.out.println(person1.toString());
		
		Class pClass=Class.forName("pk16.Person");
		
		System.out.println(pClass);
	}
}
