package pk9;

public class Person2Main {

	public static void main(String[] args) {
		Person2 personKim1=new Person2();
		
		//김유신 185.0 85.5
		personKim1.name="김유신";
		personKim1.height=185.0f;
		personKim1.weight=85.5f;
		
		System.out.println(personKim1.name);
		System.out.println(personKim1.height);
		System.out.println(personKim1.weight);
		
		Person2 personKim2=new Person2("김유신", 185.0f, 85.5f);
		
		System.out.println(personKim2.name);
		System.out.println(personKim2.height);
		System.out.println(personKim2.weight);
	}
}
