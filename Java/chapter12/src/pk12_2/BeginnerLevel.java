package pk12_2;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 걷습니다.");
	}

	@Override
	public void jump() {
		System.out.println("초보자는 점프 할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("초보자는 턴 할 수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********초보자**********");
	}
}
