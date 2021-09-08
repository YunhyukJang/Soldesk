package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		//Xml
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1=ctx1.getBean("xml1", TestBean1.class);
		
		System.out.printf("xml1 -> %s\n", xml1);
		
		//Singleton이므로 같은 주소값을 반환한다.
		TestBean1 xml11=ctx1.getBean("xml1", TestBean1.class);
		
		System.out.printf("xml11 -> %s\n", xml11);
		
		//Lazy-true 방식으로 주소값 가져오기
		TestBean2 xml2=ctx1.getBean("xml2", TestBean2.class);
		
		System.out.printf("xml2 -> %s\n", xml2);
		
		TestBean2 xml22=ctx1.getBean("xml2", TestBean2.class);
		
		System.out.printf("xml22 -> %s\n", xml22);
		
		//Prototype을 이용해서 서로 다른 주소 반환
		TestBean3 xml3=ctx1.getBean("xml3", TestBean3.class);
		
		System.out.printf("xml3 -> %s\n", xml3);
		
		TestBean3 xml33=ctx1.getBean("xml3", TestBean3.class);
		
		System.out.printf("xml33 -> %s\n", xml33);
		
		//Primary-true class 중복 시 정상적인 주소값 가져오기
		TestBean4 xml4=ctx1.getBean(TestBean4.class);
		
		System.out.printf("xml4 -> %s\n", xml4);
		
		ctx1.close();
		
		System.out.println();
		
		//Annotation
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//메서드명으로 주소값을 가져온다.
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		
		System.out.printf("java1 -> %s\n", java1);
		
		//Singleton이므로 같은 주소값을 반환한다.
		TestBean1 java11=ctx2.getBean("java1", TestBean1.class);
		
		System.out.printf("java11 -> %s\n", java11);
		
		//Lazy-true 방식으로 주소값 가져오기
		TestBean2 java2=ctx2.getBean("java2", TestBean2.class);
		
		System.out.printf("java2 -> %s\n", java2);
		
		TestBean2 java22=ctx2.getBean("java2", TestBean2.class);
		
		System.out.printf("java22 -> %s\n", java22);
		
		System.out.println();
		//메서드명으로 주소값 가져오기
		/*
		 * TestBean1 java500=ctx2.getBean("java500", TestBean1.class);
		 * 
		 * System.out.printf("java500 -> %s\n", java500);
		 */
		
		//Annotation에 지정된 이름으로 주소값 가져오기
		TestBean1 java600=ctx2.getBean("java600", TestBean1.class);
		
		System.out.printf("java600 -> %s\n", java600);
		
		//Prototype을 이용해서 서로 다른 주소 반환
		TestBean3 java3=ctx2.getBean("java3", TestBean3.class);
		
		System.out.printf("java3 -> %s\n", java3);
		
		TestBean3 java33=ctx2.getBean("java3", TestBean3.class);
		
		System.out.printf("java33 -> %s\n", java33);
		
		//Primary-true class 중복 시 정상적인 주소값 가져오기
		TestBean4 java4=ctx2.getBean(TestBean4.class);
		
		System.out.printf("java4 -> %s\n", java4);
		
		ctx2.close();
	}
}
