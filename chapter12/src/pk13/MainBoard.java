package pk13;

public class MainBoard {

	public static void main(String[] args) {
		//level 1
		Player player=new Player();
		
		player.play(1);
		
		//level 2
		System.out.println("----------중급자로 레벨 업!!----------");
		
		AdvancedLevel aLevel=new AdvancedLevel();
		
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//level 3
		System.out.println("----------마스터로 레벨 업!!----------");
		
		SuperLevel sLevel=new SuperLevel();
		
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
