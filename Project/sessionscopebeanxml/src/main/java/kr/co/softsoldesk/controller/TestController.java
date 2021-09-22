package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

@Controller
public class TestController {
	@Autowired
	@Lazy
	DataBean1 sessionBean1;
	
	@Resource(name="sessionBean2")
	@Lazy
	DataBean2 sessionBean2;
	
	@Autowired
	@Lazy
	DataBean3 sessionBean3;
	
	@Resource(name="sessionBean4")
	@Lazy
	DataBean4 sessionBean4;
	
	@GetMapping("/Test1")
	public String test1() {
		sessionBean1.setData1("Permission to dance");
		sessionBean1.setData2("Butter");
		
		sessionBean2.setData3("Dynamite");
		sessionBean2.setData4("Savage love");
		
		sessionBean3.setData5("Boy with luv");
		sessionBean3.setData6("IDOL");
		
		sessionBean4.setData7("Fake love");
		sessionBean4.setData8("I need U");
		
		return "Test1";
	}
	
	@GetMapping("/Result1")
	public String result1(Model model) {
		System.out.printf("sessionBean1.getData1 -> %s\n", sessionBean1.getData1());
		System.out.printf("sessionBean1.getData2 -> %s\n", sessionBean1.getData2());
		
		System.out.printf("sessionBean2.getData3 -> %s\n", sessionBean2.getData3());
		System.out.printf("sessionBean2.getData4 -> %s\n", sessionBean2.getData4());
		
		System.out.printf("sessionBean3.getData5 -> %s\n", sessionBean3.getData5());
		System.out.printf("sessionBean3.getData6 -> %s\n", sessionBean3.getData6());
		
		System.out.printf("sessionBean4.getData7 -> %s\n", sessionBean4.getData7());
		System.out.printf("sessionBean4.getData8 -> %s\n", sessionBean4.getData8());
		
		model.addAttribute("sessionBean1", sessionBean1);
		
		model.addAttribute("sessionBean2", sessionBean2);
		
		model.addAttribute("sessionBean3", sessionBean3);
		
		model.addAttribute("sessionBean4", sessionBean4);
		
		return "Result1";
	}
}
