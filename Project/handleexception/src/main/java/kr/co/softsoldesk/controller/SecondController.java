package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
	@GetMapping("/Test2")
	public String test2() {
		ArrayList<String> list=null;
		
		list.add("문자열");
		
		return "Test2";
	}
	
	/*
	@ExceptionHandler(java.lang.NullPointerException.class)
	public String exception() {
		return "Error2";
	}
	*/
}
