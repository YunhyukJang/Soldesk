package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.UserDataBean;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1(UserDataBean bean) {
		bean.setUserName("김연아");
		bean.setUserID("Yuna");
		bean.setUserPw("1004");
		bean.setUserPostCode("12345");
		bean.setUserAddress1("서울시 강남구");
		bean.setUserAddress2("서울시 서초구");
		
		return "Test1";
	}
	
	@GetMapping("/Test2")
	public String test2(UserDataBean bean) {
		bean.setUserName("서현진");
		bean.setUserID("Hyunjin");
		bean.setUserPw("0000");
		bean.setUserPostCode("00000");
		bean.setUserAddress1("서울시 강동구");
		bean.setUserAddress2("서울시 송파구");
		
		return "Test2";
	}
	
	//testBean이라는 이름으로 정의하여 주입
	@GetMapping("/Test3")
	public String test3(@ModelAttribute("testBean") UserDataBean bean) {
		bean.setUserName("홍수현");
		bean.setUserID("Soohyun");
		bean.setUserPw("1234");
		bean.setUserPostCode("00001");
		bean.setUserAddress1("서울시 마포구");
		bean.setUserAddress2("서울시 영등포구");
		
		return "Test3";
	}
	
	@GetMapping("/Test4")
	public String test4(Model model) {
		UserDataBean bean=new UserDataBean();
		
		bean.setUserName("조보아");
		bean.setUserID("Boa");
		bean.setUserPw("1004");
		bean.setUserPostCode("01004");
		bean.setUserAddress1("서울시 강서구");
		bean.setUserAddress2("서울시 용산구");
		
		//Model의 객체로 저장
		model.addAttribute("testBean2", bean);
		
		return "Test4";
	}
	
	@PostMapping("/Result")
	public String result() {
		return "Result";
	}
}
