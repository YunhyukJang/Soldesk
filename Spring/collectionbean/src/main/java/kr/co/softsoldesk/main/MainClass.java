package kr.co.softsoldesk.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.CollectionBean;
import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#1
		TestBean t1=ctx.getBean("t1", TestBean.class);
		
		List<String> list1=t1.getList1();
		
		for(String str:list1) {
			System.out.printf("list1 -> %s\n", str);
		}
		
		//#2
		TestBean t2=ctx.getBean("t1", TestBean.class);
		
		List<Integer> list2=t2.getList2();
		
		for(int value:list2) {
			System.out.printf("list2 -> %d\n", value);
		}
		
		//#3
		TestBean t3=ctx.getBean("t1", TestBean.class);
		
		List<DataBean> list3=t3.getList3();
		
		for(DataBean obj:list3) {
			System.out.printf("list3 -> %s\n", obj);
		}
		
		//#4
		TestBean t4=ctx.getBean("t1", TestBean.class);
		
		Set<String> set1=t4.getSet1();
		
		for(String str:set1) {
			System.out.printf("set1 -> %s\n", str);
		}
		
		//#5
		TestBean t5=ctx.getBean("t1", TestBean.class);
		
		Set<Integer> set2=t5.getSet2();
		
		for(int value:set2) {
			System.out.printf("set2 -> %d\n", value);
		}
		
		//#6
		TestBean t6=ctx.getBean("t1", TestBean.class);
		
		Set<DataBean> set3=t6.getSet3();
		
		for(DataBean obj:set3) {
			System.out.printf("set3 -> %s\n", obj);
		}
		
		//#7
		TestBean t7=ctx.getBean("t1", TestBean.class);
		
		Map<String, Object> map1=t7.getMap1();
		
		String a1=(String)map1.get("a1");
		int a2=(Integer)map1.get("a2");
		DataBean a3=(DataBean)map1.get("a3");
		DataBean a4=(DataBean)map1.get("a4");
		List<String> a5=(List<String>)map1.get("a5");
		
		System.out.printf("a1 -> %s\n", a1);
		System.out.printf("a2 -> %d\n", a2);
		System.out.printf("a3 -> %s\n", a3);
		System.out.printf("a4 -> %s\n", a4);
		
		for(String str:a5) {
			System.out.printf("a5 -> %s\n", str);	
		}
		
		//#8
		TestBean t8=ctx.getBean("t1", TestBean.class);
		
		Properties prop1=t8.getProp1();
		
		String p1=prop1.getProperty("p1");
		String p2=prop1.getProperty("p2");
		String p3=prop1.getProperty("p3");
		
		System.out.printf("p1 -> %s\n", p1);
		System.out.printf("p2 -> %s\n", p2);
		System.out.printf("p3 -> %s\n", p3);
		
		//활용
		CollectionBean c=ctx.getBean("addr", CollectionBean.class);
		
		List<String> addrList=c.getAddressList();
		
		for(String str:addrList) {
			System.out.printf("addrList -> %s\n", str);
		}
		
		ctx.close();
	}
}
