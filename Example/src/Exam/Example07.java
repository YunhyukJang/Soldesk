package Exam;

public class Example07 {

	public static void main(String[] args) {
		int max=0;
		
		int[] array= {1, 2, 3, 4, 5};
		
		//최대 값 알고리즘
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println(max);
	}
}
