package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#1
		TestBean1 xml1=ctx1.getBean("xml1", TestBean1.class);
		
		System.out.printf("xml1.getData1 -> %d\n", xml1.getData1());
		//#2
		System.out.printf("xml1.getData2 -> %s\n", xml1.getData2());
		//#3
		System.out.printf("xml1.getData3 -> %s\n", xml1.getData3());
		//#4
		System.out.printf("xml1.getData4 -> %s\n", xml1.getData4());
		System.out.printf("xml1.getData5 -> %s\n", xml1.getData5());
		//#5
		System.out.printf("xml1.getData6 -> %s\n", xml1.getData6());
		System.out.println();
		
		//TestBean2
		TestBean2 xml2=ctx1.getBean("xml2", TestBean2.class);
		
		System.out.printf("xml2.getData1 -> %d\n", xml2.getData1());
		System.out.printf("xml2.getData2 -> %s\n", xml2.getData2());
		System.out.printf("xml2.getData3 -> %s\n", xml2.getData3());
		System.out.printf("xml2.getData4 -> %s\n", xml2.getData4());
		
		ctx1.close();

		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//#1
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		
		System.out.printf("java1.getData1 -> %d\n", java1.getData1());
		//#2
		System.out.printf("java1.getData2 -> %s\n", java1.getData2());
		//#3
		System.out.printf("java1.getData3 -> %s\n", java1.getData3());
		//#4
		System.out.printf("java1.getData4 -> %s\n", java1.getData4());
		System.out.printf("java1.getData5 -> %s\n", java1.getData5());
		//#5
		System.out.printf("java1.getData6 -> %s\n", java1.getData6());
		System.out.println();
		
		//TestBean2
		TestBean2 java2=ctx2.getBean("java2", TestBean2.class);
		
		System.out.printf("java2.getData1 -> %d\n", java2.getData1());
		System.out.printf("java2.getData2 -> %s\n", java2.getData2());
		System.out.printf("java2.getData3 -> %s\n", java2.getData3());
		System.out.printf("java2.getData4 -> %s\n", java2.getData4());
		
		ctx2.close();
	}
}
