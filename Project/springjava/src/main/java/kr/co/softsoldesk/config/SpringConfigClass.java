package kr.co.softsoldesk.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;

//요청 처리의 기본적인 초기 설정 *ex)필터링, 인코딩, 리스너...
public class SpringConfigClass implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//System.out.println("onStartup");
		
		AnnotationConfigApplicationContext servletAppContext=new AnnotationConfigApplicationContext();
		
		servletAppContext.register(ServletAppContext.class);
	}
}
