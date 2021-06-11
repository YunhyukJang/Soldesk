package pk5;

public class SwitchCase07 {

	public static void main(String[] args) {
		int time=(int)(Math.random()*4)+9;
		
		System.out.println("[현재 시각:"+time+"시]");
		
		switch(time) {
			case 9:System.out.println("출근");
			break;
			
			case 10:System.out.println("Coffee Time");
			break;
			
			case 11:System.out.println("점심 시간");
			break;
			
			default:System.out.println("탈력");
		}
	}
}
