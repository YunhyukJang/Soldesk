package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.validator.DataBean1Validator;

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
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DataBean1Validator validator1=new DataBean1Validator();
		
		//binder.setValidator(validator1);
		binder.addValidators(validator1);
	}
}
