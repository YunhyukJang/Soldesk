package pk12_2;

public class Player {
	private PlayerLevel level; //PlayerLevel level=new PlayerLevel();
	
	public Player() {
		//PlayerLevel level=new BeginnerLevel();
		level=new BeginnerLevel(); //초보자로 메모리 할당
		
		level.showLevelMessage(); //초보자 메시지
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		
		level.showLevelMessage(); //각 레벨의 메시지
	}
	
	public void play(int count) {
		level.go(count);
	}
}
