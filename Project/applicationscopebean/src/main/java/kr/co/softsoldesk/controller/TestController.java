package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
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
	DataBean1 applicationBean1;
	
	@Resource(name="applicationBean2")
	DataBean2 applicationBean2;
	
	@Autowired
	DataBean3 applicationBean3;
	
	@Resource(name="applicationBean4")
	DataBean4 applicationBean4;
	
	@GetMapping("/Test1")
	public String test1() {
		applicationBean1.setData1("Permission to dance");
		applicationBean1.setData2("Butter");
		
		applicationBean2.setData3("Dynamite");
		applicationBean2.setData4("Savage love");
		
		applicationBean3.setData5("Boy with luv");
		applicationBean3.setData6("IDOL");
		
		applicationBean4.setData7("Fake love");
		applicationBean4.setData8("I need U");
		
		return "Test1";
	}
	
	@GetMapping("/Result1")
	public String result1(Model model) {
		System.out.printf("applicationBean1.getData1 -> %s\n", applicationBean1.getData1());
		System.out.printf("applicationBean1.getData2 -> %s\n", applicationBean1.getData2());
		
		System.out.printf("applicationBean2.getData3 -> %s\n", applicationBean2.getData3());
		System.out.printf("applicationBean2.getData4 -> %s\n", applicationBean2.getData4());
		
		System.out.printf("applicationBean3.getData5 -> %s\n", applicationBean3.getData5());
		System.out.printf("applicationBean3.getData6 -> %s\n", applicationBean3.getData6());
		
		System.out.printf("applicationBean4.getData7 -> %s\n", applicationBean4.getData7());
		System.out.printf("applicationBean4.getData8 -> %s\n", applicationBean4.getData8());
		
		model.addAttribute("applicationBean1", applicationBean1);
		
		model.addAttribute("applicationBean2", applicationBean2);
		
		model.addAttribute("applicationBean3", applicationBean3);
		
		model.addAttribute("applicationBean4", applicationBean4);
		
		return "Result1";
	}
}
