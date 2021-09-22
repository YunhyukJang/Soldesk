package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.softsoldesk.beans.DataBean;

@Controller
@SessionAttributes({"sessionBean1", "sessionBean2"})
public class TestController {
	//메서드를 찾아서 bean 객체 생성
	@ModelAttribute("sessionBean1")
	public DataBean sessionBean1() {
		return new DataBean();
	}
	
	@ModelAttribute("sessionBean2")
	public DataBean sessionBean2() {
		return new DataBean();
	}
	
	/*
	@GetMapping("/Test1")
	public String test1(HttpServletRequest request) {
		//Session 영역을 사용할 수 있도록 객체 생성
		HttpSession session=request.getSession();
		
		session.setAttribute("data1", "8교시");
		
		return "Test1";
	}
	
	@GetMapping("/Result1")
	public String result1(HttpServletRequest request) {
		HttpSession session=request.getSession();
		
		String data1=(String)session.getAttribute("data1");
		
		System.out.println("data1 -> "+data1);
		
		return "Result1";
	}
	*/
	
	@GetMapping("/Test1")
	public String test1(HttpSession session) {
		session.setAttribute("data1", "8교시");
		
		return "Test1";
	}
	
	//Redirect를 통해서 이동 *redirect여도 session 영역인 browser에서 값을 넘겨주므로 출력이 가능하다.
	@GetMapping("/Test2")
	public String test2(HttpSession session) {
		session.setAttribute("data1", "Wednesday");
		
		return "redirect:/Result1";
	}
	
	//Forward를 통해서 이동
	@GetMapping("/Test3")
	public String test3(HttpSession session) {
		session.setAttribute("data1", "1교시");
		
		return "forward:/Result1";
	}
	
	@GetMapping("/Result1")
	public String result1(HttpSession session) {
		String data1=(String)session.getAttribute("data1");
		
		System.out.println("data1 -> "+data1);
		
		return "Result1";
	}
	
	@GetMapping("/Test4")
	public String test4(HttpSession session, DataBean bean) {
		bean.setData1("Permission to dance");
		bean.setData2("Butter");
		
		session.setAttribute("bean", bean);
		
		return "Test4";	
	}
	
	/*
	//HttpSession session을 이용해서 session 값을 가져올 경우
	@GetMapping("/Result4")
	public String result4(HttpSession session) {
		DataBean bean=(DataBean)session.getAttribute("bean");
		
		System.out.println("bean.getData1 -> "+bean.getData1());
		System.out.println("bean.getData2 -> "+bean.getData2());
		
		return "Result4";
	}
	*/
	
	//@SessionAttribute("bean") -> 주입은 안되고 출력만 가능
	@GetMapping("/Result4")
	public String result4(@SessionAttribute("bean") DataBean bean) {
		System.out.println("bean.getData1 -> "+bean.getData1());
		System.out.println("bean.getData2 -> "+bean.getData2());
		
		return "Result4";
	}
	
	//@ModelAttribute를 이용해서 session 사용 -> 주입과 출력이 둘 다 가능
	@GetMapping("/Test5")
	public String test5(@ModelAttribute("sessionBean1") DataBean sessionBean1, 
			@ModelAttribute("sessionBean2") DataBean sessionBean2) {
		sessionBean1.setData1("sessionBean1 주입1");
		sessionBean1.setData2("sessionBean1 주입2");
		
		sessionBean2.setData1("sessionBean2 주입1");
		sessionBean2.setData2("sessionBean2 주입2");
		
		return "Test5";
	}
	
	@GetMapping("/Result5")
	public String result5(@ModelAttribute("sessionBean1") DataBean sessionBean1, 
			@ModelAttribute("sessionBean2") DataBean sessionBean2) {
		System.out.printf("sessionBean1.getData1 -> %s\n", sessionBean1.getData1());
		System.out.printf("sessionBean1.getData2 -> %s\n", sessionBean1.getData2());
		
		System.out.printf("sessionBean2.getData1 -> %s\n", sessionBean2.getData1());
		System.out.printf("sessionBean2.getData2 -> %s\n", sessionBean2.getData2());
		
		return "Result5";
	}
}
