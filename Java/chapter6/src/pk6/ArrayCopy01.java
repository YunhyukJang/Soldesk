package pk6;

public class ArrayCopy01 {

	public static void main(String[] args) {
		int[] array1= {10, 20, 30, 40, 50};
		int[] array2= {1, 2, 3, 4, 5};
		
		//배열 복사
		//System.arraycopy(배열 이름, 첨자, 배열 이름, 붙여넣기 시작, 붙여넣기 끝);
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}
}
