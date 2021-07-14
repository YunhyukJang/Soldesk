package pk4;

public class Example03 {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자를 이용하여 score가 90보다 크면 'A' 
		 * 80보다 크면 'B'
		 */
		int score=85;
		
		char result1=(score>90) ? 'A' : 'B';
		
		System.out.println(result1);
		
		/*
		 * 삼항 연산자를 이용하여 score가 90보다 크면 'A' 
		 * score가 80보다 크면 'B' 
		 * 그 이하는 모두 'C'
		 */
		char result2=(score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		
		System.out.println(result2);
	}
}
