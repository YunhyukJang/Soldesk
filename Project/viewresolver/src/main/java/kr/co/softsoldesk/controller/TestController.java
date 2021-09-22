package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1() {
		return "Test1";
	}
	
	@GetMapping("/Test2")
	public String test2(HttpServletRequest request) {
		//Data 담기
		//HttpServletRequest -> setAttribute로 등록하고 getAttribute로 전달
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		
		return "Test2";
	}
	
	@GetMapping("/Test3")
	public String test3(Model model) {
		//Model 객체로 저장하면 HttpServletRequest 영역에 담긴다.
		model.addAttribute("data1", 300);
		model.addAttribute("data2", 400);
		
		return "Test3";
	}
	
	@GetMapping("/Test4")
	public ModelAndView test4(ModelAndView mv) {
		//ModelAndView -> model과 view 이름을 지정하는 기능
		//ModelAndView 객체로 저장하면 HttpServletRequest 영역에 담긴다.
		mv.addObject("data1", 500);
		mv.addObject("data2", 600);
		
		//View file명 지정
		mv.setViewName("Test4");
		
		return mv;
	}
}
