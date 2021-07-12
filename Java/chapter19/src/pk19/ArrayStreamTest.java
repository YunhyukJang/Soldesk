package pk19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreamTest {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		IntStream stream=Arrays.stream(arr);
		
		stream.forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("--------------------");
		
		Arrays.stream(arr).forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("--------------------");
		
		int sum1=Arrays.stream(arr).sum();
		
		System.out.println(sum1);
		
		System.out.println("--------------------");
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		/* collection에서 합을 구하는 법은 reduce와 stream에서의 sum() 두가지가 존재한다.
		 * 단, stream에서의 sum()은 IntStream, DoubleStream, LongStream와 같은 
		 * 기본형(primitive) 특화 스트림
		 * 보통의 방법은 mapToInt, mapToDouble, mapToLong의 메서드로 사용*/
		//intValue()=Integer에서 int로 Unboxing
		int sum2=list.stream().mapToInt(n -> n.intValue()).sum();
		
		System.out.println(sum2);
		
		System.out.println("--------------------");
	}
}
