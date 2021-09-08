package jspbook.ch12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Bank1Bean {
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
	
	public void getData() {
		connect();
		
		//sql 구현
		try {
			stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("Select * from bank1");
			
			rs.next(); //실제 data가 있는지 확인
			
			aID=rs.getInt("aID");
			aName=rs.getString("aName");
			balance=rs.getInt("balance");
		}catch(Exception e) {
			System.err.println(aID+", "+aName+", "+balance);
			System.err.println(e);
		}finally {
			disconnect();
		}
		
	}
	
	//이체 처리
	public boolean transfer(int bal) {
		connect();
		
		try {
			//Auto commit mode가 true일 시 프로그램 내에서 update, delete을 수행하지 못한다.
			conn.setAutoCommit(false); //AutoCommit 해제
			
			pstmt=conn.prepareStatement("update bank1 set balance=balance-? where aID=101");
			
			pstmt.setInt(1, bal); //? mapping
			
			pstmt.executeUpdate();
			
			//
			pstmt=conn.prepareStatement("update bank2 set balance=balance+? where aID=201");
			
			pstmt.setInt(1, bal);
			
			pstmt.executeUpdate();
			
			//
			stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("Select balance from bank2 where aID=201");
			
			rs.next();
			
			if(rs.getInt(1)>10000) {
				conn.rollback();
				
				return false;
			}else {
				conn.commit();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			disconnect();
		}
		
		return true;
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
