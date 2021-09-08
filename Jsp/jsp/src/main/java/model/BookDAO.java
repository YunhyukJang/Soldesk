package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class BookDAO {
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="madang";
	String pw="12341234";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Vector<BookDBBean> allSelectBook(){
		Vector<BookDBBean> v=new Vector<BookDBBean>();
		
		try {
			getConn();
			
			String sql="Select * from book";
			
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BookDBBean bean=new BookDBBean();
				
				bean.setBookID(rs.getString(1));
				bean.setBookName(rs.getString(2));
				bean.setPublisher(rs.getString(3));
				bean.setPrice(rs.getInt(4));
				
				v.add(bean);
			}
			
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return v;
	}
	
	public BookDBBean selectBook(String bookID) {
		BookDBBean bBean=new BookDBBean();
		
		try {
			getConn();
			
			String sql="Select * from book where bookid=?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, bookID);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				bBean.setBookID(rs.getString(1));
				bBean.setBookName(rs.getString(2));
				bBean.setPublisher(rs.getString(3));
				bBean.setPrice(rs.getInt(4));
			}
			
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bBean;
	}
}
