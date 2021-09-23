package kr.co.softsoldesk.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
	@ExceptionHandler(java.lang.NullPointerException.class)
	public String handleException() {
		return "Error2";
	}
}
