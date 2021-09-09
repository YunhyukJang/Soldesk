package kr.co.softsoldesk.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JDBCBean;

@Component
public class JDBCDAO {
	//DB 연결 관리를 주입
	@Autowired
	private JdbcTemplate db;
	@Autowired
	private MapperClass mapper;
	
	//저장
	public void insert_data(JDBCBean bean) {
		String sql="insert into jdbc_table(int_data, str_data) values(?, ?)";
		
		db.update(sql, bean.getInt_data(), bean.getStr_data());
	}
	
	//Update
	public void update_data(JDBCBean bean) {
		String sql="update jdbc_table set str_data=? where int_data=?";
		
		db.update(sql, bean.getStr_data(), bean.getInt_data());
	}
	
	//Delete
	public void delete_data(int int_data) {
		String sql="delete from jdbc_table where int_data=?";
		
		db.update(sql, int_data);
	}
	
	//저장된 data 가져오기
	public List<JDBCBean> select_data() {
		String sql="Select int_data, str_data from jdbc_table";
		
		List<JDBCBean> list=db.query(sql, mapper);
		
		return list;
	}
}