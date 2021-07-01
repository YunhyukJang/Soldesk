package collection.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		ArrayList<UserInfo> array=new ArrayList<UserInfo>();
		
		outer:while(true) {
			Scanner sc=new Scanner(System.in);
			
			//아이디를 입력할 때마다 새로운 UserInfo 객체 생성 -> setId 메서드 이용
			UserInfo user=new UserInfo();
			
			System.out.print("아이디 생성:");
			String createId=sc.next();
			user.setId(createId);
			
			//중복 검사
			for(int i=0; i<array.size(); i++) {
				if(user.getId().equals(array.get(i).getId())) {
					System.out.println("중복된 아이디 입니다.");
					
					continue outer;
				}
				
			}
			
			System.out.print("비밀번호 입력:");
			int createPw=sc.nextInt();
			user.setPw(createPw);
			
			//ArrayList<UserInfo> array에 추가
			array.add(user);
			
			for(int i=0; i<array.size(); i++) {
				System.out.println("아이디="+array.get(i).getId());
				System.out.println("비밀번호="+array.get(i).getPw());
				System.out.println("--------------------");
			}
			
		}
	}
}
