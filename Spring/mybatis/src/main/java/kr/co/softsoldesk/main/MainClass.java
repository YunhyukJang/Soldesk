package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JDBCBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper=ctx.getBean(MapperInterface.class);
		
		/*
		//Insert
		JDBCBean bean1=new JDBCBean();
		
		bean1.setInt_data(100);
		bean1.setStr_data("Fake love");
		
		mapper.insert_data(bean1);
		
		JDBCBean bean2=new JDBCBean();
		
		bean2.setInt_data(200);
		bean2.setStr_data("Idol");
		
		mapper.insert_data(bean2);
		
		System.out.println("저장 완료.");
		*/
		
		/*
		//Update
		JDBCBean bean3=new JDBCBean();
		
		bean3.setStr_data("봄날");
		bean3.setInt_data(200);
		
		mapper.update_data(bean3);
		*/
		
		//Delete
		mapper.delete_data(200);
		
		//Select
		List<JDBCBean> list=mapper.select_data();
		
		for(JDBCBean bean4:list) {
			System.out.printf("int_data -> %d\n", bean4.getInt_data());
			System.out.printf("str_data -> %s\n", bean4.getStr_data());
			System.out.println();
		}
		
		ctx.close();
	}
}
