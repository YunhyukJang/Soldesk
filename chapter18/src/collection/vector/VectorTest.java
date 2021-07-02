package collection.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Object obj;
		
		//크기를 1로 선언
		Vector<Object> vec=new Vector<Object>(1);
		
		obj=20210702;
		
		vec.addElement(obj); //엘리먼트 추가
		
		//vector의 용량
		System.out.println("용량 #1="+vec.capacity());
		//엘리먼트 수
		System.out.println("크기 #1="+vec.size());
		
		System.out.println("--------------------");
		
		obj="BTS";
		
		vec.addElement(obj); //엘리먼트 추가
		
		//vector의 용량
		System.out.println("용량 #2="+vec.capacity());
		//엘리먼트 수
		System.out.println("크기 #2="+vec.size());
		
		System.out.println("--------------------");
		
		obj="Butter";
		
		vec.addElement(obj); //엘리먼트 추가
		
		//vector의 용량
		System.out.println("용량 #3="+vec.capacity());
		//엘리먼트 수
		System.out.println("크기 #3="+vec.size());
		
		System.out.println("--------------------");
		
		obj="Dynamite";
		
		vec.addElement(obj); //엘리먼트 추가
		
		//vector의 용량
		System.out.println("용량 #4="+vec.capacity());
		//엘리먼트 수
		System.out.println("크기 #4="+vec.size());
		
		System.out.println("--------------------");
		
		obj="Idol";
		
		vec.addElement(obj); //엘리먼트 추가
		
		//vector의 용량
		System.out.println("용량 #5="+vec.capacity());
		//엘리먼트 수
		System.out.println("크기 #5="+vec.size());
		
		System.out.println("--------------------");
		
		obj="Fake love";
		
		vec.addElement(obj); //엘리먼트 추가
		
		//vector의 용량
		System.out.println("용량 #6="+vec.capacity());
		//엘리먼트 수
		System.out.println("크기 #6="+vec.size());
		
		System.out.println(vec);
	}
}
