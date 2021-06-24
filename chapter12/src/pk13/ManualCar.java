package pk13;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("메뉴얼 주행 모드를 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("메뉴얼 주행 모드를 종료합니다.");
	}
}
