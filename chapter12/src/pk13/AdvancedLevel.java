package pk13;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빠르게 걷습니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("중급자는 턴 할 수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********중급자**********");
	}
}
