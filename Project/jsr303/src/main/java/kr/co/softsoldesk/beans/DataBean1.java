package kr.co.softsoldesk.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBean1 {
	@AssertTrue
	private boolean data1;
	
	@AssertFalse
	private boolean data2;
	
	@Min(10)
	@Max(100)
	private String data3;
	
	@DecimalMin(value="19", inclusive=false)
	@DecimalMax(value="36", inclusive=false)
	private String data4;
	
	@Null
	private String data5;
	
	@NotNull
	private String data6;
	
	@Digits(integer=3, fraction=3)
	private String data7;
	
	@Size(min=3, max=10)
	private String data8;
	
	@Pattern(regexp="[a-zA-Z]*")
	private String data9;
	
	@Pattern(regexp=".+@.+\\.[a-z]+", message="올바르지 않은 이메일 형식입니다.")
	private String email;
	
	@Pattern(regexp="^[a-zA-Z0-9]*$", message="아이디는 영대소문자와 숫자 조합만 가능합니다.")
	private String userID;
	
	@Pattern(regexp="^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$", 
			message="비밀번호는 영대소문자와 숫자, 특수문자 조합으로 8~15 글자만 가능합니다.")
	private String userPw;
	
	@Pattern(regexp="^\\d{2,3}-\\d{3,4}-\\d{4}$", message="올바르지 않은 전화번호 형식입니다.")
	private String phone;
	
	@Pattern(regexp="^\\d{3}-\\d{2}$", message="올바르지 않은 우편번호 형식입니다.")
	private String postCode;
	
	public DataBean1() {
		this.data1=true;
		this.data2=false;
		this.data3="50";
		this.data4="20";
		this.data5=null;
		this.data6="check2";
		this.data7="111.111";
		this.data8="김연아";
		this.data9="A";
		this.email="yuna@gmail.com";
		this.userID="Yuna";
		this.userPw="Yuna1004~!@";
		this.phone="010-0000-0000";
		this.postCode="000-00";
	}
}
