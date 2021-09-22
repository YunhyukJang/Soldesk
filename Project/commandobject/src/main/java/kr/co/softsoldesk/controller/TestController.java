package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	@PostMapping("/Test1")
	//@ModelAttribute 생략 가능
	public String test1(DataBean bean) {
		System.out.printf("bean.getData1 -> %s\n", bean.getData1());
		System.out.printf("bean.getData2 -> %s\n", bean.getData2());
		
		return "Test1";
	}
	
	@PostMapping("/Test2")
	public String test2(@ModelAttribute("testData") DataBean bean) {
		return "Test2";
	}
}
