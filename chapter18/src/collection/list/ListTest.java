package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		
		//리스트에 데이터 추가
		ls.add("Butter");
		ls.add("Dynamite");
		ls.add("Savage love");
		
		for(int i=0; i<ls.size(); i++)
			System.out.println(i+":"+ls.get(i).toString());
			System.out.println("---데이터 추가 후---");
			
		ls.add(3, "Boy with luv");
		
		for(int i=0; i<ls.size(); i++)
			System.out.println(i+":"+ls.get(i).toString());
			System.out.println("---데이터 삭제 후---");
		
		ls.remove(0);
		
		for(int i=0; i<ls.size(); i++)
			System.out.println(i+":"+ls.get(i).toString());
	}
}
