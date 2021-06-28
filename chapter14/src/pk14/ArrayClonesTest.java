package pk14;

public class ArrayClonesTest {

	public static void main(String[] args) {
		int[] arr1= {1, 2, 3, 4, 5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("복사된 배열 arr2 출력");
		
		for(int arr:arr2) {
			System.out.print(arr+" ");
		}
		
		System.out.println();
		
		arr2[3]=0;
		
		System.out.println("변경 후 배열 arr1 출력");
		
		for(int arr:arr1) {
			System.out.print(arr+" ");
		}
		
		System.out.println();
		
		System.out.println("변경 후 배열 arr2 출력");
		
		for(int arr:arr2) {
			System.out.print(arr+" ");
		}
	}
}
