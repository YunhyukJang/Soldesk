package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap=new MemberHashMap();
		
		//Member 클래스의 객체
		Member user1=new Member(1, "짱구");
		Member user2=new Member(2, "철수");
		Member user3=new Member(3, "훈이");
		Member user4=new Member(4, "유리");
		Member user5=new Member(5, "맹구");
		
		memberHashMap.addMember(user1);
		memberHashMap.addMember(user2);
		memberHashMap.addMember(user3);
		memberHashMap.addMember(user4);
		memberHashMap.addMember(user5);
		
		memberHashMap.showAllMember();
		
		System.out.println("------------------------------");
		
		Member user6=new Member(5, "맹구");
		
		memberHashMap.addMember(user6);
		
		memberHashMap.showAllMember();
		
		System.out.println("------------------------------");
		
		memberHashMap.removeMember(1);
		
		memberHashMap.showAllMember();
	}
}
