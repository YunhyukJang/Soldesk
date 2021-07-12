package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; //선언
	
	//생성자
	public MemberTreeSet() {
		treeSet=new TreeSet<Member>(new Member()); //메모리 확보
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //memberId를 매개 변수로 받음
		Iterator<Member> it=treeSet.iterator();
		
		while(it.hasNext()) {
			Member m=it.next();
			
			int tempId=m.getMemberId();
			
			if(tempId == memberId) {
				treeSet.remove(m);
				
				return true;
			}
			
		}
		
		return false;
	}
	
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}
