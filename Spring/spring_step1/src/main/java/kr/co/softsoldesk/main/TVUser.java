package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TVUser {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TV tv1=(TV)ctx.getBean("tv1");
		
		tv1.powerOn();
		tv1.volumeUp();
		
		TV tv2=ctx.getBean("tv2", TV.class);
		
		tv2.volumeDown();
		tv2.powerOff();
		
		ctx.close();
	}
}
