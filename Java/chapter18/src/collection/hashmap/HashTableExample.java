package collection.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//HashTable=동기화 제공
public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map=new Hashtable<String, String>();
		
		map.put("Spring", "1");
		map.put("Summer", "12");
		map.put("Fall", "123");
		map.put("Winter", "1234");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 입력:");
			String id=sc.nextLine();
			
			System.out.print("비밀번호 입력:");
			String pw=sc.nextLine();
						
			if(map.containsKey(id)) { //HashMap에 containsKey()는 해당 키의 존재 여부를 반환
				if(map.get(id).equals(pw)) {
					System.out.println(map.get(id)+" 님 환영합니다.");
					
					break;
				}else {
					System.out.println("잘못된 비밀번호입니다.");
				}
				
			}else {
				System.out.println("가입하지 않은 아이디입니다.");
			}
			
		}
	}
}
