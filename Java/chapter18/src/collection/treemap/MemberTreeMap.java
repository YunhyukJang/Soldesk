package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap; //선언
	
	//생성자
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer, Member>(); //메모리 확보
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) { //memberId를 매개 변수로 받음
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			
			return true;
		}
		
		System.out.println(memberId+"는 가입하지 않은 아이디입니다.");
		
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it=treeMap.keySet().iterator();
		
		while(it.hasNext()) {
			int key=it.next(); //key 저장
			
			Member member=treeMap.get(key); //value가 저장
			
			System.out.println(member);
		}
		
		System.out.println("entry 수="+treeMap.size());
	}
}
