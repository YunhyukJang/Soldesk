package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; //선언
	
	//생성자
	public MemberHashSet() {
		hashSet=new HashSet<Member>(); //메모리 확보
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //memberId를 매개 변수로 받음
		Iterator<Member> it=hashSet.iterator();
		
		while(it.hasNext()) {
			Member m=it.next();
			
			int tempId=m.getMemberId();
			
			if(tempId == memberId) {
				hashSet.remove(m);
				
				return true;
			}
			
		}
		
		return false;
	}
	
	public void showAllMember() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}
