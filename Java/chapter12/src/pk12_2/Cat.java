package pk12_2;

public class Cat extends Animal {
	public Cat() {
		this.kind="포유류";
		
		System.out.println(kind);
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
