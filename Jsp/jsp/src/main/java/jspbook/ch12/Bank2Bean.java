package jspbook.ch12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Bank2Bean {
	//멤버 선언
	private int aID;
	private String aName;
	private int balance;
	
	//DB 연결
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	
	//JNDI 방식의 DB 연동
	public void connect() {
		try {
			//new InitialContext()로 context 객체를 확보
			Context initContext=new InitialContext();
			
			//JNDI(Java Name Directory Interface) java:/comp/env를 이용해서 context의 환경 설정에 접근
			Context envContext=(Context)initContext.lookup("java:/comp/env");
			
			//jdbc/xe로 DataSource 객체를 확보
			DataSource ds=(DataSource)envContext.lookup("jdbc/xe");
			
			//연결
			conn=ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
			
			System.err.println(e);
		}
		
	}
	
	//Connection 반납
	public void disconnect() {
		try {
			if(conn != null) {
				conn.close();
			}
			
		}catch(SQLException e) {
			System.err.println(e);
		}
		
		System.out.println("Close");
	}
	
	//bank2 table 정보 출력
	public void getData() {
		connect();
		
		try {
			stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("Select * from bank2");
			
			rs.next();
			
			aID=rs.getInt("aID");
			aName=rs.getString("aName");
			balance=rs.getInt("balance");
		}catch(Exception e) {
			System.err.println(e);
			System.err.println(aID+", "+aName+", "+balance);
		}finally {
			disconnect();
		}
		
	}
	
	public int getaID() {
		return aID;
	}
	
	public String getaName() {
		return aName;
	}
	
	public int getBalance() {
		return balance;
	}
}