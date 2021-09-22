package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController {
	@GetMapping("/InputData")
	public String inputData() {
		return "InputData";
	}
	
	@PostMapping("/InputPro")
	public String inputPro(@Valid DataBean1 dataBean1, BindingResult result) {
		dataBean1.getData1();
		
		System.out.printf("dataBean1.getData1 -> %s\n", dataBean1.getData1());
		System.out.printf("dataBean1.getData2 -> %d\n", dataBean1.getData2());
		
		System.out.printf("BindingResult -> %s\n", result);
		
		//유효성 검사에 위배된 부분이 있을 경우 true
		if(result.hasErrors()) {
			//유효성 위배 결과를 모두 가져온다.
			//result.getAllErrors(); *Error 정보는 List로 반환된다.
			for(ObjectError obj:result.getAllErrors()) {
				/*
				System.out.printf("Message -> %s\n", obj.getDefaultMessage());
				System.out.printf("Code -> %s\n", obj.getCode());
				System.out.printf("Object name -> %s\n", obj.getObjectName());
				System.out.println();
				*/
				
				String[] codes=obj.getCodes();
				
				for(String c1:codes) {
					System.out.println(c1);
				}
				
				if(codes[0].equals("Size.dataBean1.data1")) {
					System.out.println("data1은 2~10 사이의 글자만 가능합니다.");
				}else if(codes[0].equals("Max.dataBean1.data2")) {
					System.out.println("data2는 100 이하의 숫자만 가능합니다.");
				}
				
			}
			
			return "InputData";
		}
		
		return "InputSuccess";
	}
}
