package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.softsoldesk.beans.JDBCBean;

public interface MapperInterface {
	//Column의 이름과 bean의 이름이 다를 경우 사용 *동일하면 생략 가능
	/*
	@Results({@Result(column="int_data", property="int_data"), 
		@Result(column="str_data", property="str_data")})
	*/
	
	//#{int_data}, #{str_data} -> Bean 객체의 변수에 대입
	@Insert("insert into jdbc_table(int_data, str_data) values(#{int_data}, #{str_data})")
	void insert_data(JDBCBean bean);
	
	@Update("update jdbc_table set str_data=#{str_data} where int_data=#{int_data}")
	void update_data(JDBCBean bean);
	
	@Delete("delete from jdbc_table where int_data=#{int_data}")
	void delete_data(int int_data);
	
	@Select("Select int_data, str_data from jdbc_table")
	List<JDBCBean> select_data();
}
