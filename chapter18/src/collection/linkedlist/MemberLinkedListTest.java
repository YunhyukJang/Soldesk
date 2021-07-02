package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
		//Member 클래스의 객체
		Member user1=new Member(1, "짱구");
		Member user2=new Member(2, "철수");
		Member user3=new Member(3, "훈이");
		Member user4=new Member(4, "유리");
		Member user5=new Member(5, "맹구");
		
		memberLinkedList.addMember(user1);
		memberLinkedList.addMember(user2);
		memberLinkedList.addMember(user3);
		memberLinkedList.addMember(user4);
		memberLinkedList.addMember(user5);
		
		memberLinkedList.showAllMember();
		
		System.out.println("--------------------");
		
		Member user6=new Member(1, "짱구");
		
		memberLinkedList.addMember(user6);
		
		memberLinkedList.showAllMember();
	}
}
