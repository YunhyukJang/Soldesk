package pk5;

public class ForTest04 {

	public static void main(String[] args) {
		//0~100까지 수를 더해라
		int sum=0;
		
		for(int i=0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("0부터 100까지의 합="+sum);
	}
}
