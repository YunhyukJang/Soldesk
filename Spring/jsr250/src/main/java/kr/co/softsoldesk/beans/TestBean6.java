package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

public class TestBean6 {
	//Bean의 이름은 data1. 변수의 이름은 data100
	//Bean의 이름을 변수의 이름과 상이하게 설정하여 bean을 여러번 적용하여 사용하고자 할 때 사용
	@Resource(name="data1")
	private DataBean1 data100;
	@Resource(name="data2")
	private DataBean2 data200;
	
	public DataBean1 getData100() {
		return data100;
	}
	
	public DataBean2 getData200() {
		return data200;
	}
}
