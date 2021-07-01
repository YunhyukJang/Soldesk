package collection.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		int[] arr=new int[10];
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("list.size="+list.size());
		
		list.add(100);
		list.add(20);
		
		System.out.println("list.size="+list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//리스트의 자원을 반복자로 변환
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) { //iterator안에 커서의 유무 판단
			int v=it.next(); //현재의 커서 위치에서 요소를 읽음 *Unboxing
			
			System.out.println(v);
		}
	}
}
