package collection.arraylist_stack_queue;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		//5명 추가
		list.add("짱구");
		list.add("철수");
		list.add("훈이");
		list.add("유리");
		list.add("맹구");
		
		//0번째, 2번째 출력
		System.out.println(list.get(0));
		System.out.println(list.get(2));
	}
}
