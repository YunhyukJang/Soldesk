package pk12_2;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("-----메뉴얼 주행 자동차-----");
		
		Car car1=new ManualCar();
		
		car1.run();
		
		System.out.println("-----자율 주행 자동차-----");
		
		Car car2=new AICar();
		
		car2.run();
	}
}
