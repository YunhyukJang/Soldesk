package pk14;

public class ExExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			if(i == 5) {
				System.exit(i);
			}
			
		}
		
		System.out.println("END"); //System.exit(i); 사용시에는 컴파일되지 않음
	}
}
