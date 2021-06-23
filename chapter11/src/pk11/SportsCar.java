package pk11;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		
		System.out.println("speed="+speed);
	}
	
	/*
	 * final 메서드는 Override 불가능
	 * @Override 
	 * public void stop() 
	 * { System.out.println("스포츠카가 멈춥니다.");
	 * 
	 * speed=0; }
	 */

	public static void main(String[] args) {
		SportsCar sCar=new SportsCar();
		
		sCar.speedUp();
		sCar.stop();
	}
}
