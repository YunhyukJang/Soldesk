package pk5;

public class SwitchCase01 {

	public static void main(String[] args) {
		/*
		int ranking=3;
		char medalColor;
		
		switch(ranking) {
			case 1:medalColor='G';
			break;
		
			case 2:medalColor='S';
			break;
		
			case 3:medalColor='B';
			break;
		
			default:medalColor='A';
		}
		
		System.out.println(ranking+"등 메달은 "+medalColor+"입니다.");
		*/
		
		//default 값을 초기 값으로 대체하여 구현
		int ranking=5;
		char medalColor='A'; //default
		
		switch(ranking) {
			case 1:medalColor='G';
			break;
		
			case 2:medalColor='S';
			break;
		
			case 3:medalColor='B';
			break;
		}
		
		System.out.println(ranking+"등 메달은 "+medalColor+"입니다.");
	}
}
