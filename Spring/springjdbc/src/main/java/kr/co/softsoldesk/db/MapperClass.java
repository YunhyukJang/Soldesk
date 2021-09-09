package kr.co.softsoldesk.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JDBCBean;

@Component
public class MapperClass implements RowMapper<JDBCBean> {
	@Override
	public JDBCBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		//ResultSet rs=Select문의 결과를 받는다.
		//받은 결과값을 JDBCBean의 setter 메서드를 활용하여 입력
		JDBCBean bean=new JDBCBean();
		
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
}
