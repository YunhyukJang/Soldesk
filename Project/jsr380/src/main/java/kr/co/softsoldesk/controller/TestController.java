package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController {
	@GetMapping("/InputData")
	public String inputData(DataBean1 dataBean1) {
		return "InputData";
	}
	
	@PostMapping("/InputPro")
	public String inputPro(@Valid DataBean1 dataBean1, BindingResult result) {
		if(result.hasErrors()) {
			return "InputData";
		}
		
		return "InputSuccess";
	}
}
