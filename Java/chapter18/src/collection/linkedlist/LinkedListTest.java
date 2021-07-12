package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/* LinkedList
		 * 특정 인덱스에서 객체를 제거하거나 추가하게되면 바로 앞뒤에 변경이 발생하므로 
		 * 빈번한 객체의 삽입, 삭제가 일어나는 data구조에서는 ArrayList보다 좋은 성능을 갖고 있다.*/
		LinkedList<String> myList=new LinkedList<String>();
		
		myList.add("Butter");
		myList.add("Dynamite");
		myList.add("Idol");
		
		System.out.println(myList);
		
		myList.add(1, "Savage love");
		
		System.out.println(myList);
		
		myList.addFirst("BTS");
		
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}
}
