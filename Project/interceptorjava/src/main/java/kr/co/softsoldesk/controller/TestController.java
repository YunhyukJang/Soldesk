package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1() {
		System.out.println("Test1");
		
		return "Test1";
	}
	
	@GetMapping("/Test2")
	public String test2() {
		System.out.println("Test2");
		
		return "Test2";
	}
	
	@GetMapping("/sub1/Test3")
	public String test3() {
		System.out.println("sub1/Test3");
		
		return "sub1/Test3";
	}
	
	@GetMapping("/sub1/Test4")
	public String test4() {
		System.out.println("sub1/Test4");
		
		return "sub1/Test4";
	}
}
