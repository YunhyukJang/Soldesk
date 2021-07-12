package pk6;

public class ArraySum03 {

	public static void main(String[] args) {
		int[] score;
		//score= {83, 90, 87};
		
		/*
		 * int sum=0;
		 * 
		 * for(int i=0; i<score.length; i++) { sum += score[i]; }
		 * 
		 * System.out.println("총합="+sum);
		 */
		
		int sum=add(new int[] {83, 90, 87});
		
		System.out.println("총합="+sum);
	}
	
	//매개 변수=메서드 컴파일 시 사용되는 변수
	public static int add(int[] score) {
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		return sum;
	}
}
