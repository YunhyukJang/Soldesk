package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		//#1
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 t1=ctx.getBean("t1", TestBean1.class);
		
		System.out.printf("t1 -> %s\n", t1);
		
		//#2
		TestBean2 t2=ctx.getBean("t2", TestBean2.class);
		
		System.out.printf("t2 -> %s\n", t2);
		
		ctx.close();
	}
}
