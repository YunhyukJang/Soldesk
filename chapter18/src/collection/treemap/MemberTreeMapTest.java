package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap=new MemberTreeMap();
		
		//Member 클래스의 객체
		Member user1=new Member(1, "짱구");
		Member user4=new Member(4, "유리");
		Member user2=new Member(2, "철수");
		Member user5=new Member(5, "맹구");
		Member user3=new Member(3, "훈이");
		
		memberTreeMap.addMember(user1);
		memberTreeMap.addMember(user2);
		memberTreeMap.addMember(user3);
		memberTreeMap.addMember(user4);
		memberTreeMap.addMember(user5);
		
		memberTreeMap.showAllMember();
		
		System.out.println("------------------------------");
		
		memberTreeMap.removeMember(3);
		
		memberTreeMap.showAllMember();
	}
}
