package business;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {
	Scanner sc=new Scanner(System.in);
	
	ArrayList<CompanyBasics> arrCom=new ArrayList<CompanyBasics>();
	
	public void insertMember() {
		String name;
		String part;
		String addr;
		String birthday;
		
		CompanyBasics cBasics=new CompanyBasics();
		
		System.out.print("이름:");
		name=sc.next();
		
		System.out.print("부서:");
		part=sc.next();
		
		System.out.print("주소:");
		addr=sc.next();
		
		System.out.print("생년월일:");
		birthday=sc.next();
		sc.next();
		
		cBasics.setName(name);
		cBasics.setPart(part);
		cBasics.setAddr(addr);
		cBasics.setBirthday(birthday);
		
		arrCom.add(cBasics);
		
		System.out.println("사원정보가 입력되었다.");
	}
	
	public void searchMember() {
		String searchName;
		
		System.out.println("검색하고자 하는 사원의 이름은?");
		searchName=sc.next();
		
		for(int i=0; i<arrCom.size(); i++) {
			if(arrCom.get(i).getName().equals(searchName)) {
				System.out.println("이름:"+arrCom.get(i).getName());
				System.out.println("부서:"+arrCom.get(i).getPart());
				System.out.println("주소:"+arrCom.get(i).getAddr());
				System.out.println("생년월일:"+arrCom.get(i).getBirthday());
				
				break;
			}
			
		}
		
	}
}
