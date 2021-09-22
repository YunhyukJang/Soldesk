package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="/Test1", method=RequestMethod.GET)
	public String test1GET() {
		return "Test1";
	}
	
	@RequestMapping(value="/Test2", method=RequestMethod.POST)
	public String test2POST() {
		return "Test2";
	}
	
	@RequestMapping(value="/Test3", method=RequestMethod.GET)
	public String test3GET() {
		return "Test3GET";
	}
	
	@RequestMapping(value="/Test3", method=RequestMethod.POST)
	public String test3POST() {
		return "Test3POST";
	}
	
	@GetMapping("/Test4")
	public String test4() {
		return "Test4";
	}
	
	@PostMapping("/Test5")
	public String test5() {
		return "Test5";
	}
	
	@GetMapping("/Test6")
	public String test6GET() {
		return "Test6GET";
	}
	
	@PostMapping("/Test6")
	public String test6POST() {
		return "Test6POST";
	}
	
	@RequestMapping(value="/Test7", method={RequestMethod.GET, RequestMethod.POST})
	public String test7() {
		return "Test7";
	}
}
