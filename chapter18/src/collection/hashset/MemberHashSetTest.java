package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet();
		
		//Member 클래스의 객체
		Member user1=new Member(1, "짱구");
		Member user2=new Member(2, "철수");
		Member user3=new Member(3, "훈이");
		Member user4=new Member(4, "유리");
		Member user5=new Member(5, "맹구");
		
		memberHashSet.addMember(user1);
		memberHashSet.addMember(user2);
		memberHashSet.addMember(user3);
		memberHashSet.addMember(user4);
		memberHashSet.addMember(user5);
		
		memberHashSet.showAllMember();
		
		System.out.println("--------------------");
		
		Member user6=new Member(1, "짱구");
		
		memberHashSet.addMember(user6);
		
		memberHashSet.showAllMember();
	}
}
