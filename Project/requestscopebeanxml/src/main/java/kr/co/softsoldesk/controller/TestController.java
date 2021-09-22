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
	//Java 방식하고는 다르게 새로운 요청 없이도 작동되어 오류가 발생하므로 @Lazy 사용
	@Autowired
	@Lazy
	DataBean1 requestBean1;
	
	@Resource(name="requestBean2")
	@Lazy
	DataBean2 requestBean2;
	
	@Autowired
	@Lazy
	DataBean3 requestBean3;
	
	@Resource(name="requestBean4")
	@Lazy
	DataBean4 requestBean4;
	
	@GetMapping("/Test1")
	public String test1() {
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		requestBean2.setData3("문자열3"); 
		requestBean2.setData4("문자열4");
		
		requestBean3.setData5("문자열5");
		requestBean3.setData6("문자열6");
		
		requestBean4.setData7("문자열7"); 
		requestBean4.setData8("문자열8");
		
		return "forward:/Result1"; //새로운 요청이 발생되지 않았으므로 주입 되지 않는다.
	}
	
	@GetMapping("/Result1")
	public String result1(Model model) { //JSP까지 값을 전달하려면 새로운 요청이 발생해야 한다.
		System.out.printf("requestBean1.getData1 -> %s\n", requestBean1.getData1());
		System.out.printf("requestBean1.getData2 -> %s\n", requestBean1.getData2());
		
		System.out.printf("requestBean2.getData3 -> %s\n", requestBean2.getData3());
		System.out.printf("requestBean2.getData4 -> %s\n", requestBean2.getData4());
		
		System.out.printf("requestBean3.getData5 -> %s\n", requestBean3.getData5());
		System.out.printf("requestBean3.getData6 -> %s\n", requestBean3.getData6());
		
		System.out.printf("requestBean4.getData7 -> %s\n", requestBean4.getData7());
		System.out.printf("requestBean4.getData8 -> %s\n", requestBean4.getData8());
		
		model.addAttribute("requestBean1", requestBean1); //새로운 요청 발생
		
		//이름으로 주입되었으니 생략 가능
		//model.addAttribute("requestBean2", requestBean2); //새로운 요청 발생
		
		model.addAttribute("requestBean3", requestBean3); //새로운 요청 발생
		
		model.addAttribute("requestBean4", requestBean4); //새로운 요청 발생
		
		return "Result1";
	}
}
