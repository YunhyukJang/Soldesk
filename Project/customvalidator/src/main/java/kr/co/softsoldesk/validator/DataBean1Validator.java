package kr.co.softsoldesk.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.co.softsoldesk.beans.DataBean1;

public class DataBean1Validator implements Validator {
	//유효성 검사가 가능하도록 class(target)를 등록
	@Override
	public boolean supports(Class<?> clazz) {
		return DataBean1.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//rejectIfEmpty=값이 null이거나 길이가 0인 경우 위배
		ValidationUtils.rejectIfEmpty(errors, "data2", "error2");
		//rejectIfEmptyOrWhitespace=값이 null이거나 길이가 0인 경우 또는 공백으로 구성되어있는 경우
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data3", "error3");
		
		//형변환
		DataBean1 bean1=(DataBean1)target;
		
		String data2=bean1.getData2();
		String data3=bean1.getData3();
		
		if(data2.length()>10) {
			errors.rejectValue("data2", "error4");
		}
		
		if(data3.contains("@") == false) {
			errors.rejectValue("data3", "error5");
		}
		
	}
}
