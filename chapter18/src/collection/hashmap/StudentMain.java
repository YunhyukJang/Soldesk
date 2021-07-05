package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		//해당 학생의 점수를 보관
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		map.put(new Student(1, "해리"), 100);
		map.put(new Student(1, "해리"), 100);
		map.put(new Student(1, "해리"), 100);
		
		//저장된 entry 수
		System.out.println("entry 수="+map.size());
	}
}
