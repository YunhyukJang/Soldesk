package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		outer:while(true) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1. 정보 추가");
			System.out.println("2. 정보 삭제");
			System.out.println("3. 전체 정보");
			System.out.println("4. 종료");
			System.out.println("메뉴 선택 -> ");
			select=sc.nextInt();
			
			switch(select) {
				case 1:
					p=new Person();
					
					System.out.println("-----정보 추가-----");
					System.out.print("이름 입력:");
					String aName=sc.next();
					p.setName(aName);
					
					System.out.print("나이 입력:");
					int aAge=sc.nextInt();
					p.setAge(aAge);
					
					System.out.print("전화번호 입력:");
					String aTel=sc.next();
					p.setTel(aTel);
					
					personArr.add(p);
					
					System.out.println("정보가 저장되었습니다.");
					System.out.println("------------------------------");
					
					break;
				case 2:
					System.out.println("-----정보 삭제-----");
					System.out.print("삭제할 이름 입력:");
					String dName=sc.next();
					
					//검사
					for(int i=0; i<personArr.size(); i++) {
						if(personArr.get(i).getName().equals(dName)) {
							personArr.remove(i);
							
							System.out.println("정보가 삭제되었습니다.");
						}else if(i+1 == personArr.size()) {
							System.out.println("찾는 정보가 존재하지 않습니다.");
						}
						
					}
					
					break;
				case 3:
					System.out.println("-----전체 정보-----");
					System.out.println("현재 등록된 인원:"+personArr.size()+"명");
					
					/*
					 * for(int i=0; i<personArr.size(); i++) {
					 * System.out.println("이름:"+personArr.get(i).getName());
					 * System.out.println("나이:"+personArr.get(i).getAge());
					 * System.out.println("전화번호:"+personArr.get(i).getTel());
					 * System.out.println("------------------------------"); }
					 */
					
					Iterator<Person> it=personArr.iterator();
					
					while(it.hasNext()) { //커서 생성=it에 data가 있음
						p=it.next(); //한 줄씩 읽기 시작
						
						System.out.println("이름:"+p.getName());
						System.out.println("나이:"+p.getAge());
						System.out.println("전화번호:"+p.getTel());
						System.out.println("------------------------------");
					}
					
					break;
				default:
					System.out.println("-----종료-----");
					System.exit(0);
			}
			
		}
	}
}
