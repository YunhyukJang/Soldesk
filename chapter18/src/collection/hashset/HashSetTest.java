package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add(new String("짱구"));
		hashSet.add(new String("철수"));
		hashSet.add(new String("훈이"));
		hashSet.add(new String("유리"));
		hashSet.add(new String("맹구"));
		
		//boolean b1=hashSet.add(new String("유리"));
		
		//System.out.println(b1);
		System.out.println(hashSet);
		
		hashSet.add(new String("유리"));
		
		//같은 엘리먼트(data)의 중복을 허용하지 않는다.
		boolean b1=hashSet.add(new String("유리"));
		
		System.out.println(b1);
		System.out.println(hashSet);
	}
}
