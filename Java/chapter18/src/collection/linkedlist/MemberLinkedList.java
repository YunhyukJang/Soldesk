package collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {
	private LinkedList<Member> linkedList; //선언
	
	//생성자
	public MemberLinkedList() {
		linkedList=new LinkedList<Member>(); //메모리 확보
	}
	
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	public boolean removeMember(int memberId) { //memberId를 매개 변수로 받음
		/*
		 * for(int i=0; i<linkedList.size(); i++) { 
		 * Member member=linkedList.get(i); 
		 * int tempId=member.getMemberId();
		 * 
		 * if(tempId == memberId) { linkedList.remove(i);
		 * 
		 * return true; } }
		 */
		
		Iterator<Member> it=linkedList.iterator();
		
		while(it.hasNext()) {
			Member m=it.next();
			
			int tempId=m.getMemberId();
			
			if(tempId == memberId) {
				linkedList.remove(m);
				
				return true;
			}
			
		}
		
		return false;
	}
	
	public void showAllMember() {
		for(Member member:linkedList) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}
