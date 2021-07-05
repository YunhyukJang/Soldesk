package pk19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		
		//stream 생성
		IntStream stream=Arrays.stream(arr);
		
		//stream을 sum()에 사용
		int sum=stream.sum();
		
		System.out.println(sum);
		
		//stream을 count에 사용
		//이미 위에서 사용했으므로 소멸된 stream
		//int count=(int)stream.count();
		int count=(int)Arrays.stream(arr).count();
		
		System.out.println(count);
		
		//stream 생성
		System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a+b));
	}
}
