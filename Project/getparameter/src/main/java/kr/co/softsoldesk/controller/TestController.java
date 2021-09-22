package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1(HttpServletRequest request) {
		String data1=request.getParameter("data1");
		String data2=request.getParameter("data2");
		String[] data3=request.getParameterValues("data3");
		
		System.out.println("data1="+data1);
		System.out.println("data2="+data2);
		
		for(String str1:data3) {
			System.out.println("data3="+str1);
		}
		
		return "Result";
	}
	
	@PostMapping("/Test2")
	public String test2(HttpServletRequest request) {
		String data1=request.getParameter("data1");
		String data2=request.getParameter("data2");
		String[] data3=request.getParameterValues("data3");
		
		System.out.println("data1="+data1);
		System.out.println("data2="+data2);
		
		if(data3 != null) {
			for(String str1:data3) {
				System.out.println("data3="+str1);
			}
			
		}
		
		return "Result";
	}
	
	//포틀릿은 복합 페이지면서 API에 종속되지 않는 타입 *HttpServletRequest+포틀릿 양쪽 모두를 사용할 수 있도록 고안됨
	@GetMapping("/Test3")
	public String test3(WebRequest request) {
		String data1=request.getParameter("data1");
		String data2=request.getParameter("data2");
		String[] data3=request.getParameterValues("data3");
		
		System.out.println("data1="+data1);
		System.out.println("data2="+data2);
		
		for(String str1:data3) {
			System.out.println("data3="+str1);
		}
		
		return "Result";
	}
	
	@GetMapping("/Test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable int data1, 
			@PathVariable int data2, 
			@PathVariable int data3) {
		System.out.println("data1="+data1);
		System.out.println("data2="+data2);
		System.out.println("data3="+data3);
		
		//@PathVariable은 자동 형변환이 가능
		int add=data1+data2+data3;
		
		System.out.println("add="+add);
		
		return "Result";
	}
	
	@GetMapping("/Test5")
	public String test5(@RequestParam int data1, 
			@RequestParam int data2, 
			@RequestParam int[] data3) {
		System.out.println("data1="+data1);
		System.out.println("data2="+data2);
		
		for(int str1:data3) {
			System.out.println("data3="+str1);
		}
		
		return "Result";
	}
	
	//Param에 있는 값을 받지 않을 때는 오류가 없지만 Param에 없는 값을 받을 때는 error
	@GetMapping("/Test6") //Parameter의 이름과 변수명을 다르게 지정할 경우 사용
	public String test6(@RequestParam(value="data1") int value1, 
			//@RequestParam(value="data2") int value2, 
			@RequestParam(value="data3") int[] value3) {
		System.out.println("data1="+value1);
		//System.out.println("data2="+value2);
		
		for(int str1:value3) {
			System.out.println("data3="+str1);
		}
		
		return "Result";
	}
	
	//지도나 결제 API 사용 시 많이 적용
	@GetMapping("/Test7")
	public String test7(@RequestParam int data1, 
			@RequestParam(required=false) String data2, 
			@RequestParam(defaultValue="0") int data3) {
		System.out.println("data1="+data1);
		System.out.println("data2="+data2);
		System.out.println("data3="+data3);
		
		return "Result";
	}
}
