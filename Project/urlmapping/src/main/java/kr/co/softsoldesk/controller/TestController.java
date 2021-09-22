package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="/Test1", method=RequestMethod.GET)
	public String test1() {
		return "Test1";
	}
	
	@RequestMapping(value="/Test2", method=RequestMethod.GET)
	public String test2() {
		return "Test2";
	}
}
