package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; //선언
	
	//생성자
	public MemberHashMap() {
		hashMap=new HashMap<Integer, Member>(); //메모리 확보
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) { //memberId를 매개 변수로 받음
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			
			return true;
		}
		
		System.out.println(memberId+"는 가입하지 않은 아이디입니다.");
		
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it=hashMap.keySet().iterator();
		
		while(it.hasNext()) {
			int key=it.next(); //key 저장
			
			Member member=hashMap.get(key); //value가 저장
			
			System.out.println(member);
		}
		
		System.out.println("entry 수="+hashMap.size());
	}
}
