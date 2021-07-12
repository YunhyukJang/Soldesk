package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<String>();
		
		treeSet.add("해리");
		treeSet.add("론");
		treeSet.add("헤르미온느");
		
		for(String str:treeSet) {
			System.out.println(str);
		}
	}
}
