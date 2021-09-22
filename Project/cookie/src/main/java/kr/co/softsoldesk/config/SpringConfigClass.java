package kr.co.softsoldesk.config;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//요청 처리의 기본적인 초기 설정 *ex)Filtering, Encoding, Listener...
public class SpringConfigClass implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//System.out.println("onStartup");
		
		AnnotationConfigWebApplicationContext servletAddContext=new AnnotationConfigWebApplicationContext();
		
		servletAddContext.register(ServletAppContext.class); //web.xml의 환경 설정
		
		//요청 발생 시 요청을 처리하고 servlet에서 DispatcherServlet을 실행할 때의 경로
		DispatcherServlet dispatcherServlet=new DispatcherServlet(servletAddContext);
		
		ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher", dispatcherServlet);
		
		//부가 설정
		servlet.setLoadOnStartup(1); //가장 먼저 받아들이겠다는 code
		servlet.addMapping("/");
		
		//Bean(VO)을 정의하는 class를 지정
		AnnotationConfigWebApplicationContext rootAppContext=new AnnotationConfigWebApplicationContext();
		
		rootAppContext.register(RootAppContext.class);
		
		//Listener 설정
		ContextLoaderListener listener=new ContextLoaderListener(rootAppContext);
		
		servletContext.addListener(listener);
		
		//Parameter encoding 설정
		FilterRegistration.Dynamic filter=servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		
		filter.setInitParameter("encoding", "UTF-8");
		
		//추가 encoding -> dispatcher에 의해서 추가된 servlet에도 적용
		filter.addMappingForServletNames(null, false, "dispatcher");
	}
}

/*
public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer {
	//DispatcherServlet에 mapping
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	//Spring MVC project 설정
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletAppContext.class};
	}
	
	//Project에서 사용할 bean들을 정의
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootAppContext.class};
	}
	
	//Parameter encoding filter
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter=new CharacterEncodingFilter();
		
		encodingFilter.setEncoding("UTF-8");
		
		return new Filter[] {encodingFilter};
	}
}
*/
