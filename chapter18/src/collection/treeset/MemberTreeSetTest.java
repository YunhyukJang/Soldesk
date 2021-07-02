package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		//Member 클래스의 객체
		Member user1=new Member(1, "짱구");
		Member user2=new Member(2, "철수");
		Member user3=new Member(3, "훈이");
		Member user4=new Member(4, "유리");
		Member user5=new Member(5, "맹구");
		
		memberTreeSet.addMember(user1);
		memberTreeSet.addMember(user2);
		memberTreeSet.addMember(user3);
		memberTreeSet.addMember(user4);
		memberTreeSet.addMember(user5);
		
		memberTreeSet.showAllMember();
		
		System.out.println("--------------------");
		
		Member user6=new Member(1, "짱구");
		
		memberTreeSet.addMember(user6);
		
		memberTreeSet.showAllMember();
	}
}
