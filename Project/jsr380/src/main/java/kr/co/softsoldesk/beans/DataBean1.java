package kr.co.softsoldesk.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBean1 {
	@NotEmpty //공백도 문자로 허용
	private String data1;
	
	@NotBlank //공백을 문자로 허용하지 않음
	private String data2;
	
	@Positive //양수만 허용
	private int data3;
	
	@PositiveOrZero //0 또는 양수만 허용
	private int data4;
	
	@Negative //음수만 허용
	private int data5;
	
	@NegativeOrZero //0 또는 음수만 허용
	private int data6;
	
	@Email
	private String data7;
}
