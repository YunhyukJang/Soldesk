package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
		
		//xml1.method1();
		//System.out.println();
		
		//xml1.method1(100);
		//System.out.println();
		
		//xml1.method1("Butter");
		//System.out.println();
		
		//xml1.method1(100, 200);
		//System.out.println();
		
		//xml1.method1(100, "Butter");
		//System.out.println();
		
		//xml1.method1();
		//System.out.println();
		
		TestBean2 xml2=ctx.getBean("xml2", TestBean2.class);
		
		xml2.method1();
		System.out.println();
		
		kr.co.softsoldesk.beans2.TestBean1 xml3=ctx.getBean("xml3", kr.co.softsoldesk.beans2.TestBean1.class);
		
		xml3.method1();
		System.out.println();
		
		//반환 type
		int a1=xml1.method4();
		
		System.out.printf("a1 -> %d\n", a1);
		
		ctx.close();
	}
}
