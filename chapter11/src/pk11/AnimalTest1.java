package pk11;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아 다닙니다.");
	}
	
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		
		aTest.moveAnimal(new Human()); //Animal animal=new Human();
		aTest.moveAnimal(new Tiger()); //Animal animal=new Tiger();
		aTest.moveAnimal(new Eagle()); //Animal animal=new Eagle();
	}
	
	public void moveAnimal(Animal animal) { //매개 변수에 상위 클래스의 객체
		animal.move();
	}
}
