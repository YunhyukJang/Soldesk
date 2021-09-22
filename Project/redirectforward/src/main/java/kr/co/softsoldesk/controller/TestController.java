package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1() {
		return "redirect:/Sub1";
	}
	
	@GetMapping("/Sub1")
	public String sub1() {
		return "Sub1";
	}
	
	@GetMapping("/Test2")
	public String test2() {
		return "forward:/Sub2";
	}
	
	@GetMapping("/Sub2")
	public String sub2() {
		return "Sub2";
	}
}
