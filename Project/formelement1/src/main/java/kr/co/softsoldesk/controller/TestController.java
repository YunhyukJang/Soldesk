package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1(DataBean bean) {
		bean.setA1("체육");
		bean.setA2("김연아");
		bean.setA3("1004");
		bean.setA4("서울시 강남구");
		
		return "Test1";
	}
}
