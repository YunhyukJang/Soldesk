package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	private int data1;
	private DataBean1 data2;
	
	//#3
	@Autowired //자동으로 setter 메서드가 추가되어 주입되므로 getter만 추가해주면 된다.
	private DataBean1 data3;
	
	//#4
	@Autowired
	@Qualifier("obj4") //정의되어 있지 않으면 obj5와 같은 객체로 인식하여 error 발생
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	//#5
	@Autowired(required=false) //beans에 등록이 되어 있으면 사용되고 되어 있지 않으면 무시
	@Qualifier("obj6")
	private DataBean2 data6;
	
	/*
	public TestBean1(int data1) {
		this.data1=data1;
	}
	*/
	
	public int getData1() {
		return data1;
	}
	
	@Required //반드시 주입해야 하는 속성 *Spring 5.1 이상에서는 사용되지 않음.
	//반드시 주입해야 하는 속성은 생성자를 이용
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public DataBean1 getData2() {
		return data2;
	}
	
	@Autowired //자동 주입(Type)
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public DataBean2 getData6() {
		return data6;
	}
}
