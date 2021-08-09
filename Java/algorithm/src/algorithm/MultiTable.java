package algorithm;

public class MultiTable {

	public static void main(String[] args) {
		System.out.println("곱셈표");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				int num=i*j;
				
				System.out.printf("%3d", num);
			}
			
			System.out.println();
		}
	}
}
