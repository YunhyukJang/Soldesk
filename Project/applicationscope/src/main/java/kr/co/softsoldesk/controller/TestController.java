package kr.co.softsoldesk.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	//Application type을 주입시킬 수 있다.
	@Autowired
	ServletContext application;
	
	/*
	//방법 1. @Autowired 주입 전
	@GetMapping("/Test1")
	public String test1(HttpServletRequest request) {
		//ServletContext=모든 browser에서 같은 memory 공간을 사용
		ServletContext application=request.getServletContext();
		
		application.setAttribute("data1", "점심 시간");
		
		return "Test1";
	}
	
	@GetMapping("/Result1")
	public String result1(HttpServletRequest request) {
		ServletContext application=request.getServletContext();
		
		String data1=(String)application.getAttribute("data1");
		
		System.out.println("data1 -> "+data1);
		
		return "Result1";
	}
	*/
	
	/*
	//방법 2. @Autowired 주입 후
	@GetMapping("/Test1")
	public String test1() {
		application.setAttribute("data1", "점심 시간");
		
		return "Test1";
	}
	
	@GetMapping("/Result1")
	public String result1() {
		String data1=(String)application.getAttribute("data1");
		
		System.out.println("data1 -> "+data1);
		
		return "Result1";
	}
	*/
	
	//bean 활용
	@GetMapping("/Test1")
	public String test1(DataBean bean) {
		bean.setData1("Coffee");
		bean.setData2("Latte");
		
		application.setAttribute("bean", bean);
		
		return "Test1";
	}
	
	@GetMapping("/Result1")
	public String result1() {
		DataBean bean=(DataBean)application.getAttribute("bean");
		
		System.out.printf("bean.getData1 -> %s\n", bean.getData1());
		System.out.printf("bean.getData2 -> %s\n", bean.getData2());
		
		return "Result1";
	}
}
