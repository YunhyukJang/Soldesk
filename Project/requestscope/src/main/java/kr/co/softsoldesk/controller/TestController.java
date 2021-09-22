package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("data1", "Tuesday");
		
		//return "redirect:/Result1"; *새로운 요청 정보에 의해 request가 소멸되므로 null 값 반환
		return "forward:/Result1"; //request 값을 유지하면서 넘어간다.
	}
	
	//Redirect로 받으면 기존의 setAttribute 값이 소멸되고 새로 요청된 정보가 넘어오므로 반환값이 없다.
	@GetMapping("/Result1")
	public String result1(HttpServletRequest request) {
		String data1=(String)request.getAttribute("data1");
		
		System.out.println("data1 -> "+data1);
		
		return "Result1";
	}
	
	@GetMapping("/Test2")
	public String test2(Model model) {
		//Model 사용 시 request 영역에 저장
		model.addAttribute("data2", "3교시");
		
		return "forward:/Result2";
	}
	
	/*
	//불가능한 code
	//Model 객체에서 Model 객체로 전달 받을 수 없다.
	@GetMapping("/Result2")
	public String result2(Model model) {
		String data2=(String)model.getAttribute("data2");
		
		System.out.println("data2 -> "+data2);
		
		return "Result2";
	}
	*/
	
	@GetMapping("/Result2")
	public String result2(HttpServletRequest request) {
		String data2=(String)request.getAttribute("data2");
		
		System.out.println("data2 -> "+data2);
		
		return "Result2";
	}
	
	@GetMapping("/Test3")
	public ModelAndView test3(ModelAndView mv) {
		mv.addObject("data3", "점심시간");
		mv.setViewName("forward:/Result3");
		
		return mv;
	}
	
	@GetMapping("/Result3")
	public String result3(HttpServletRequest request) {
		String data3=(String)request.getAttribute("data3");
		
		System.out.println("data3 -> "+data3);
		
		return "Result3";
	}
	
	//Bean 주입 활용
	@GetMapping("/Test4")
	public String test4(Model model) {
		DataBean1 bean1=new DataBean1();
		
		bean1.setData1("Butter");
		bean1.setData2("Permission to dance");
		
		model.addAttribute("bean1", bean1);
		
		return "forward:/Result4";
	}
	
	@GetMapping("/Result4")
	public String result4(HttpServletRequest request) {
		DataBean1 bean1=(DataBean1)request.getAttribute("bean1");
		
		System.out.printf("bean1.getData1 -> %s\n", bean1.getData1());
		System.out.printf("bean1.getData2 -> %s\n", bean1.getData2());
		
		return "Result4";
	}
	
	//testbean이라는 이름으로 주입
	@GetMapping("/Test5")
	public String test5(@ModelAttribute("testbean") DataBean1 bean1) {
		bean1.setData1("IDOL");
		bean1.setData2("Dynamite");
		
		return "forward:/Result5";
	}
	
	/*
	//불가능한 code
	//새로운 객체 주입으로 인해 request에 저장된 data를 삭제
	@GetMapping("/Result5")
	public String result5(@ModelAttribute("testbean") DataBean1 bean1) {
		System.out.printf("bean1.getData1 -> %s\n", bean1.getData1());
		System.out.printf("bean1.getData2 -> %s\n", bean1.getData2());
		
		return "Result5";
	}
	*/
	
	@GetMapping("/Result5")
	public String result5(HttpServletRequest request) {
		DataBean1 bean1=(DataBean1)request.getAttribute("testbean");
		
		System.out.printf("bean1.getData1 -> %s\n", bean1.getData1());
		System.out.printf("bean1.getData2 -> %s\n", bean1.getData2());
		
		return "Result5";
	}
}
