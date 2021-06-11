package pk5;

public class SwitchCase05 {

	public static void main(String[] args) {
		char grade='B';
		
		switch(grade) {
			case 'A': case 'a':
				System.out.println("우수 회원입니다.");
				break;
				
			case 'B': case 'b':
				System.out.println("일반 회원입니다.");
				break;
				
			default:System.out.println("회원이 아닙니다.");
		}
	}
}
