package collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {

	public static void main(String[] args) {
		//String 클래스에서 기본적으로 default 정렬이 되어있음
		Set<String> set=new TreeSet<String>();
		
		set.add("ㅈㅈㅈ");
		set.add("ㅇㅇㅇ");
		set.add("ㅎㅎㅎ");
		
		System.out.println(set);
	}
}
