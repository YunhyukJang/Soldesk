package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#1. Setter 주입을 이용한 객체 생성
		TestBean1 obj1=ctx.getBean("obj1", TestBean1.class);
		
		System.out.printf("obj1.getData1 -> %s\n", obj1.getData1());
		System.out.printf("obj1.getData2 -> %s\n", obj1.getData2());
		
		//#2. byName 주입을 이용한 객체 생성
		TestBean1 obj2=ctx.getBean("obj2", TestBean1.class);
		
		System.out.printf("obj2.getData1 -> %s\n", obj2.getData1());
		System.out.printf("obj2.getData2 -> %s\n", obj2.getData2());
		
		//#3. byType 주입을 이용한 객체 생성
		TestBean2 obj3=ctx.getBean("obj3", TestBean2.class);
		
		System.out.printf("obj3.getData1 -> %s\n", obj3.getData1());
		System.out.printf("obj3.getData2 -> %s\n", obj3.getData2());
		
		//#4. 생성자 주입을 이용한 객체 생성
		TestBean3 obj4=ctx.getBean("obj4", TestBean3.class);
		
		System.out.printf("obj4.getData3 -> %s\n", obj4.getData3());
		System.out.printf("obj4.getData4 -> %s\n", obj4.getData4());
		
		//#5. autowire_생성자 주입을 이용한 객체 생성
		TestBean3 obj5=ctx.getBean("obj5", TestBean3.class);
		
		System.out.printf("obj5.getData3 -> %s\n", obj5.getData3());
		System.out.printf("obj5.getData4 -> %s\n", obj5.getData4());
		
		//#6. 4개짜리 생성자 주입을 이용한 객체 생성
		TestBean3 obj6=ctx.getBean("obj6", TestBean3.class);
		
		System.out.printf("obj6.getData1 -> %d\n", obj6.getData1());
		System.out.printf("obj6.getData2 -> %s\n", obj6.getData2());
		System.out.printf("obj6.getData3 -> %s\n", obj6.getData3());
		System.out.printf("obj6.getData4 -> %s\n", obj6.getData4());
		
		//#7. autowire_4개짜리 생성자 주입을 이용한 객체 생성
		TestBean3 obj7=ctx.getBean("obj7", TestBean3.class);
		
		System.out.printf("obj7.getData1 -> %d\n", obj7.getData1());
		System.out.printf("obj7.getData2 -> %s\n", obj7.getData2());
		System.out.printf("obj7.getData3 -> %s\n", obj7.getData3());
		System.out.printf("obj7.getData4 -> %s\n", obj7.getData4());
		
		//#8. default-autowire(byName) 주입을 이용한 객체 생성
		TestBean1 obj8=ctx.getBean("obj8", TestBean1.class);
		
		System.out.printf("obj8.getData1 -> %s\n", obj8.getData1());
		System.out.printf("obj8.getData2 -> %s\n", obj8.getData2());
		
		//#8. default-autowire(byName) 주입을 거부
		TestBean1 obj9=ctx.getBean("obj9", TestBean1.class);
		
		System.out.printf("obj9.getData1 -> %s\n", obj9.getData1());
		System.out.printf("obj9.getData2 -> %s\n", obj9.getData2());
		
		ctx.close();
	}
}
