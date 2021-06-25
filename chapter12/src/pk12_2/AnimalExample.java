package pk12_2;

public class AnimalExample {
	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		//각각의 객체를 만들어 Cat과 Dog sound 메서드 호출
		System.out.println("-----각각의 객체 생성-----");
		
		Cat cat1=new Cat();
		
		cat1.sound();
		
		Dog dog1=new Dog();
		
		dog1.sound();
		
		//자동 형 변환
		System.out.println("-----자동 형 변환(Upcasting)-----");
		
		Animal animal=null; //초기화가 안되있는 상태 선언
		animal=new Cat();
		
		animal.sound();
		
		Animal dog2=null; //초기화가 안되있는 상태 선언
		dog2=new Dog();
		
		dog2.sound();
		
		//메서드 사용
		System.out.println("-----메서드(매개 변수) 사용-----");
		
		animalSound(new Cat());
		animalSound(new Dog());
	}
}
