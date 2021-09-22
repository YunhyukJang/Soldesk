package kr.co.softsoldesk.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/SaveCookie")
	//Browser가 응답을 받아서 저장하므로 response
	public String saveCookie(HttpServletResponse response) {
		try {
			//Cookie는 문자만 저장되므로 encoding하여 data 구성
			String data1=URLEncoder.encode("09-16", "UTF-8");
			String data2=URLEncoder.encode("Thursday", "UTF-8");
			
			Cookie cookie1=new Cookie("cookie1", data1);
			Cookie cookie2=new Cookie("cookie2", data2);
			
			//Cookie 수명
			cookie1.setMaxAge(365*24*60*60);
			cookie2.setMaxAge(365*24*60*60);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "SaveCookie";
	}
	
	//요청 정보에 담겨 server에서 browser로 넘어오므로 request 객체를 사용
	@GetMapping("/LoadCookie")
	public String loadCookie(HttpServletRequest request) {
		Cookie[] cookies=request.getCookies();
		
		try {
			for(Cookie cookie:cookies) {
				//Decode=한글 표현을 위해 원래 code로 전환
				String str=URLDecoder.decode(cookie.getValue(), "UTF-8");
				
				//선별적으로 cookie 정보를 가져올 수 없으므로 모두 적용 후 제어 code로 구현
				//Cookie의 이름으로 분류
				if(cookie.getName().equals("cookie1")) {
					System.out.printf("cookie1 -> %s\n", str);
				}else if(cookie.getName().equals("cookie2")) {
					System.out.printf("cookie2 -> %s\n", str);
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "LoadCookie";
	}
	
	//Spring에서 제공하는 방법
	@GetMapping("/LoadCookie2")
	public String loadCookie2(@CookieValue("cookie1") String cookie1, 
			@CookieValue("cookie2") String cookie2) {
		System.out.printf("cookie1 -> %s\n", cookie1);
		System.out.printf("cookie2 -> %s\n", cookie2);
		
		return "LoadCookie2";
	}
}
