package kr.co.softsoldesk.beans2;

import org.springframework.stereotype.Component;

//<bean class="kr.co.softsoldesk.beans.TestBean3"/>와 같음
//이름이 없으므로 type 선언으로 사용
@Component
public class TestBean3 {
	private int data1;
}
