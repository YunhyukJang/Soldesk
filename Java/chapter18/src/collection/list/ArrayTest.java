package collection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		int[] iArray= {50, 40, 30, 20, 10};
		String[] sArray=new String[5];
		
		System.out.println(Arrays.toString(iArray));
		
		//Arrays.sort()=오름차순 정렬
		Arrays.sort(iArray);
		
		System.out.println(Arrays.toString(iArray));
		
		//Arrays.fill()=배열 요소에 삽입
		Arrays.fill(sArray, "Butter");
		
		System.out.println(Arrays.toString(sArray));
		
		//Arrays.asList()=배열 초기화
		List<String> city=Arrays.asList("Butter", "Savage love", "Dynamite", "Boy with luv", "DNA");
		
		for(int i=0; i<city.size(); i++) {
			System.out.println(city.get(i).toString());
		}
	}
}
