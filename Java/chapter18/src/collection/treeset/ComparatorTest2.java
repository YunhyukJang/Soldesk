package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Comparator -> 정렬을 재정의할 경우
class MyCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2))*-1; //*-1 -> 내림차순
	}
}

public class ComparatorTest2 {

	public static void main(String[] args) {
		//String 클래스에서 기본적으로 default 정렬이 되어있음
		Set<String> set=new TreeSet<String>(new MyCompare());
				
		set.add("ㅈㅈㅈ");
		set.add("ㅇㅇㅇ");
		set.add("ㅎㅎㅎ");
				
		System.out.println(set);
	}
}
