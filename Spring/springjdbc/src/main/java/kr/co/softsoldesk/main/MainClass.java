package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JDBCBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.db.JDBCDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		JDBCDAO dao=ctx.getBean(JDBCDAO.class);
		
		/*
		//Insert
		JDBCBean bean1=new JDBCBean();
		
		bean1.setInt_data(1);
		bean1.setStr_data("Dynamite");
		
		dao.insert_data(bean1);
		
		JDBCBean bean2=new JDBCBean();
		
		bean2.setInt_data(2);
		bean2.setStr_data("Butter");

		dao.insert_data(bean2);
		
		System.out.println("저장 완료.");
		*/
		
		/*
		//Update
		JDBCBean bean4=new JDBCBean();
		
		bean4.setInt_data(2);
		bean4.setStr_data("Permission to dance");
		
		dao.update_data(bean4);
		*/
		
		//Delete
		dao.delete_data(2);
		
		//Select
		List<JDBCBean> list=dao.select_data();
		
		for(JDBCBean bean3:list) {
			System.out.printf("int_data -> %d\n", bean3.getInt_data());
			System.out.printf("str_data -> %s\n", bean3.getStr_data());
			System.out.println();
		}
		
		ctx.close();
	}
}
