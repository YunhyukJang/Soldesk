package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //선언
	
	//생성자
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); //메모리 확보
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { //memberId를 매개 변수로 받음
		/*
		 * for(int i=0; i<arrayList.size(); i++) { 
		 * Member member=arrayList.get(i); 
		 * int tempId=member.getMemberId();
		 * 
		 * if(tempId == memberId) { arrayList.remove(i);
		 * 
		 * return true; } }
		 */
		
		Iterator<Member> it=arrayList.iterator();
		
		while(it.hasNext()) {
			Member m=it.next();
			
			int tempId=m.getMemberId();
			
			if(tempId == memberId) {
				arrayList.remove(m);
				
				return true;
			}
			
		}
		
		return false;
	}
	
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}
