package pk9;

public class Overload {
	private int age;
	private float height;
	private String name;
	
	public Overload() {
		age=0;
		height=0.0f;
		name="익명";
	}
	
	public Overload(int age, float height) {
		this.age=age;
		this.height=height;
	}
	
	public Overload(int age, float height, String name) {
		this.age=age;
		this.height=height;
		this.name=name;
	}
	
	public void Disp() {
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("키="+height);
	}
}
