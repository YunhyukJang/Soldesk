package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		//Member 클래스의 객체
		Member user1=new Member(1, "짱구");
		Member user2=new Member(2, "철수");
		Member user3=new Member(3, "훈이");
		Member user4=new Member(4, "유리");
		Member user5=new Member(5, "맹구");
		
		memberArrayList.addMember(user1);
		memberArrayList.addMember(user2);
		memberArrayList.addMember(user3);
		memberArrayList.addMember(user4);
		memberArrayList.addMember(user5);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(user5.getMemberId());
		
		memberArrayList.showAllMember();
	}
}
