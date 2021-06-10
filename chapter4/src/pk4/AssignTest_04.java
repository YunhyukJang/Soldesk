package pk4;

public class AssignTest_04 {

	public static void main(String[] args) {
		//전위 연산
		int gameScore=150;
		int lastScore1= ++gameScore; //1을 더하고 읽기
		int lastScore2= --gameScore; //1을 빼고 읽기
		
		System.out.println(lastScore1); //151
		System.out.println(lastScore2); //150
		
		//후위 연산
		int lastScore3=gameScore++; //읽고 1을 더하기
		
		System.out.println(lastScore3); //150
		System.out.println(gameScore); //151
		
		int lastScore4=gameScore--; //읽고 1을 빼기
		
		System.out.println(lastScore4); //151
		System.out.println(gameScore); //150
	}
}
