package pk17_2;

public class Gen<T> {
	public void printArr(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
	}
}
