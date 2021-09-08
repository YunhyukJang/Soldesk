package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1=ctx.getBean(TestBean1.class);
		
		System.out.printf("t1.getData1 -> %s\n", t1.getData1());
		System.out.printf("t1.getData2 -> %s\n", t1.getData2());
		System.out.printf("t1.getData3 -> %s\n", t1.getData3());
		System.out.printf("t1.getData4 -> %s\n", t1.getData4());
		System.out.printf("t1.getData5 -> %s\n", t1.getData5());
		System.out.println();
		
		TestBean2 t2=ctx.getBean(TestBean2.class);
		
		System.out.printf("t2.getData1 -> %s\n", t2.getData1());
		System.out.printf("t2.getData2 -> %s\n", t2.getData2());
		System.out.printf("t2.getData3 -> %s\n", t2.getData3());
		System.out.printf("t2.getData4 -> %s\n", t2.getData4());
		System.out.println();
		
		//메서드명으로 주입
		TestBean3 t3=ctx.getBean("java3", TestBean3.class);
		
		System.out.printf("t3.getData1 -> %s\n", t3.getData1());
		System.out.printf("t3.getData2 -> %s\n", t3.getData2());
		System.out.printf("t3.getData3 -> %s\n", t3.getData3());
		System.out.printf("t3.getData4 -> %s\n", t3.getData4());
		
		ctx.close();
	}
}
