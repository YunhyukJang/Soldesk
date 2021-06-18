package pk9;

public class ThisTest {
	private int speed;
	private int age;
	private String robotName;
	private String robotNum;
	
	//기본 생성자
	public ThisTest() {
		this(10, 3, "Bee", "20210608");
	}
	
	public ThisTest(int speed, int age, String robotName, String robotNum) {
		this.speed=speed;
		this.age=age;
		this.robotName=robotName;
		this.robotNum=robotNum;
	}
	
	public void Move() {
		speed += 20;
		
		System.out.println("robot speed="+speed);
	}
	
	public void Stop() {
		speed=0;
		
		System.out.println("robot speed="+speed);
	}
	
	public void RAge() {
		age += 1;
		
		System.out.println("robot age="+age);
	}
	
	public void RName() {
		System.out.println("robot name="+robotName);
	}
	
	public void RNum() {
		System.out.println("robot number="+robotNum);
	}
}
