package jspbook.ch07;

import java.util.ArrayList;

public class AddrManager {
	//AddrBean 타입의 ArrayList 객체 생성(addrList)
	ArrayList<AddrBean> addrList=new ArrayList<AddrBean>();
	
	//ArrayList(addrList)에 AddrBean의 객체 추가
	public void add(AddrBean ab) {
		addrList.add(ab);
	}
	
	//고객 정보 목록(addrList) 전달 메서드
	public ArrayList<AddrBean> getAddrList(){
		return addrList;
	}
	
	//특정 사용자의 정보를 검색하는 메서드
	public AddrBean getAddr(String name) {
		for(AddrBean ab:addrList) {
			if(ab.getName().equals(name)) {
				return ab;
			}
			
		}
		
		return null;
	}
}
