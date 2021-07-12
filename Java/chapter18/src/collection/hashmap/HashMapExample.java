package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map Collection 생성
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//객체 저장
		map.put("Butter", 1);
		map.put("Dynamite", 2);
		map.put("Boy with luv", 3);
		map.put("Butter", 4);
		
		System.out.println("총 Entry="+map.size());
		
		//객체 찾기
		//System.out.println("Butter:"+map.get("Butter"));
		
		//객체를 하나씩 처리
		Set<String> keySet=map.keySet();
		
		Iterator<String> ks=keySet.iterator();
		
		while(ks.hasNext()) {
			String key=ks.next(); //이름 *ex)Boy with luv
			
			Integer value=map.get(key); //숫자 *ex)3
			
			System.out.println(key+":"+value);
		}
		
		System.out.println("--------------------");
		
		map.remove("Dynamite");
		
		System.out.println("총 Entry="+map.size());
		System.out.println("--------------------");
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> es=entrySet.iterator();
		
		while(es.hasNext()) {
			Map.Entry<String, Integer> entry=es.next();
			
			String key=entry.getKey();
			Integer value=entry.getValue();
			
			System.out.println(key+":"+value);
		}
		
		System.out.println("--------------------");
		
		//전체 삭제
		map.clear();
		System.out.println("총 Entry="+map.size());
	}
}
