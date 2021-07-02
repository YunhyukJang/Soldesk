package collection;

import java.util.Comparator;

//Comparable:Override -> compareTo
//Comparator:Override -> compare *이미 정렬되있는 데이터 재정렬
public class Member implements Comparable<Member>, Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member() {
	}
	
	public Member(int memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberId+" 입니다.";
	}

	//물리적인 주소 
	//JDK에서 주는 주소를 사용하지 않음
	//개발자가 임의로 정하여 heap memory 주소를 지정
	@Override
	public int hashCode() {
		return memberId;
	}
	
	//논리적인 주소(엘리먼트)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}

	@Override
	public int compareTo(Member member) {
		return (this.memberId-member.memberId)*-1;
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId-member2.memberId)*-1;
	}
}
