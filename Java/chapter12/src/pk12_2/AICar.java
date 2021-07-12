package pk12_2;

public class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("자율 주행 모드를 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율 주행 모드를 종료합니다.");
	}
}
