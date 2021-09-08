package kr.co.softsoldesk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before");
		
		switch(beanName) {
		case "t1":
			System.out.println("t1 before");
				
			break;
		case "t2":
			System.out.println("t2 before");
				
			break;
		}
		
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After");
		
		return bean;
	}
}
