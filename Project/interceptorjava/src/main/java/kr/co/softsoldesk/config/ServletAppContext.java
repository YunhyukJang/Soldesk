package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softsoldesk.interceptor.TestInterceptor1;
import kr.co.softsoldesk.interceptor.TestInterceptor2;
import kr.co.softsoldesk.interceptor.TestInterceptor3;
import kr.co.softsoldesk.interceptor.TestInterceptor4;
import kr.co.softsoldesk.interceptor.TestInterceptor5;
import kr.co.softsoldesk.interceptor.TestInterceptor6;
import kr.co.softsoldesk.interceptor.TestInterceptor7;
import kr.co.softsoldesk.interceptor.TestInterceptor8;

//Project의 전반적인 설정
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer {
	//Controller의 메서드가 반환하는 결과 값을 view로 보낼 때 지정되어지는 경로 구현
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
	//정적 파일의 경로 지정
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/**").addResourceLocations("/resource/");
	}
	
	//Interceptor 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		
		TestInterceptor1 inter1=new TestInterceptor1();
		
		InterceptorRegistration reg1=registry.addInterceptor(inter1);
		
		TestInterceptor2 inter2=new TestInterceptor2();
		
		InterceptorRegistration reg2=registry.addInterceptor(inter2);
		
		TestInterceptor3 inter3=new TestInterceptor3();
		
		InterceptorRegistration reg3=registry.addInterceptor(inter3);
		
		TestInterceptor4 inter4=new TestInterceptor4();
		
		InterceptorRegistration reg4=registry.addInterceptor(inter4);
		
		TestInterceptor5 inter5=new TestInterceptor5();
		
		InterceptorRegistration reg5=registry.addInterceptor(inter5);
		
		TestInterceptor6 inter6=new TestInterceptor6();
		
		InterceptorRegistration reg6=registry.addInterceptor(inter6);
		
		TestInterceptor7 inter7=new TestInterceptor7();
		
		InterceptorRegistration reg7=registry.addInterceptor(inter7);
		
		TestInterceptor8 inter8=new TestInterceptor8();
		
		InterceptorRegistration reg8=registry.addInterceptor(inter8);
		
		reg1.addPathPatterns("/Test1");
		
		reg2.addPathPatterns("/Test1");
		
		reg3.addPathPatterns("/Test2");
		
		//reg4.addPathPatterns("/Test1");
		//reg4.addPathPatterns("/Test2");
		reg4.addPathPatterns("/Test1", "/Test2");
		
		reg5.addPathPatterns("/sub1/Test3", "/sub1/Test4");
		
		reg6.addPathPatterns("/*");
		
		reg7.addPathPatterns("/sub1/*");
		
		reg8.addPathPatterns("/**");
		
		//모든 주소 요청에서 제외되는 요청 주소 등록
		reg8.excludePathPatterns("/*");
	}
}
