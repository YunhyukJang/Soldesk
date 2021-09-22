package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.KeyValueBean;

@Controller
public class TestController {
	@GetMapping("/Test1")
	public String test1(DataBean bean, Model model) {
		bean.setA1("data2");
		bean.setA2("data2");
		bean.setA3("data2");
		bean.setA4("data2");
		
		//String 배열
		String[] dataList1={"data1", "data2", "data3"};
		
		model.addAttribute("dataList1", dataList1);
		
		//ArrayList 배열
		ArrayList<String> dataList2=new ArrayList<String>();
		
		dataList2.add("data1");
		dataList2.add("data2");
		dataList2.add("data3");
		
		model.addAttribute("dataList2", dataList2);
		
		//KeyValueBean
		KeyValueBean keyBean1=new KeyValueBean();
		KeyValueBean keyBean2=new KeyValueBean();
		KeyValueBean keyBean3=new KeyValueBean();
		
		//key에 value가 저장
		keyBean1.setKey("항목1");
		keyBean1.setValue("data1");
		
		keyBean2.setKey("항목2");
		keyBean2.setValue("data2");
		
		keyBean3.setKey("항목3");
		keyBean3.setValue("data3");
		
		//설정된 data를 ArrayList에 저장
		ArrayList<KeyValueBean> dataList3=new ArrayList<KeyValueBean>();
		
		dataList3.add(keyBean1);
		dataList3.add(keyBean2);
		dataList3.add(keyBean3);
		
		model.addAttribute("dataList3", dataList3);
		
		//CheckBox
		//data1, data3 선택
		String[] checkList={"data1", "data3"};
		
		//각 배열에 checkList를 주입
		bean.setA5(checkList);
		bean.setA6(checkList);
		bean.setA7(checkList);
		bean.setA8(checkList);
		
		//RadioButton
		bean.setA9("data2");
		bean.setA10("data2");
		bean.setA11("data2");
		bean.setA12("data2");
		
		return "Test1";
	}
}
