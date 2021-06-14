package pk6;

public class TwoDimension01 {

	public static void main(String[] args) {
		int[][] arr= {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println(arr.length); //전체 행
		System.out.println(arr[0].length); //0행의 열
		System.out.println(arr[1].length); //1행의 열
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
