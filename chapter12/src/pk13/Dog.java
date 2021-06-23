package pk13;

public class Dog extends Animal {
	public Dog() {
		this.kind="포유류";
		
		System.out.println(kind);
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
