package pk19;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		ArrayList<String> sList=new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//lambda
		//sList의 요소들이 stream class로 입력
		Stream<String> stream=sList.stream();
		
		stream.forEach(s -> System.out.print(s+" "));
		
		System.out.println();
		
		//확장 for
		for(String s:sList) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		//ArrayList의 요소들을 stream으로 정렬하여 출력
		sList.stream().sorted().forEach(s -> System.out.print(s+" "));
		
		System.out.println();
		
		//method mapping
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		
		//filter() -> 글자수 5이상의 요소만 출력
		sList.stream().filter(s -> s.length() >= 5).forEach(n -> System.out.print(n+" "));
	}
}
