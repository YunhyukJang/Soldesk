<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
request.setCharacterEncoding("UTF-8");

//DB 연결 관련 클래스의 인스턴스 변수 선언
Connection conn=null; //연결
PreparedStatement pstmt=null; //sql code

//sql code 결과 값을 반납하는 클래스의 인스턴스 변수
//ResultSet rs=결과 값

//DB 연결 관련 문자열 선언
String jdbc_driver="oracle.jdbc.driver.OracleDriver";
String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";

try{
	//JDBC driver load
	Class.forName(jdbc_driver);
	
	//연결 정보
	conn=DriverManager.getConnection(jdbc_url, "system", "12341234");
	
	//sql문 작성을 위한 statement 작성
	String sql="insert into jdbc_test values(?, ?)";
	
	pstmt=conn.prepareStatement(sql);
	
	pstmt.setString(1, request.getParameter("name"));
	pstmt.setString(2, request.getParameter("email"));
	
	//name 값을 입력한 경우 sql문 수행
	if(request.getParameter("name") != null){
		pstmt.executeUpdate();
	}
	
}catch(Exception e){
	e.printStackTrace();
}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JDBC Test</title>
</head>
<body>
	<div align="center">
		<h2>사용자 등록</h2>
		<hr />
		
		<form action="JDBCTest.jsp" method="POST">
			이름 <input type="text" name="name"/> <p/>
			이메일 <input type="email" name="email"/> <p/>
			
			<input type="submit" value="등록"/>
		</form>
	</div>
	<hr />
	
	#사용자 목록
	<p/>
	
	<% 
	try{
		//sql문 작성을 위한 statement 작성
		String sql="Select * from jdbc_test";
		
		pstmt=conn.prepareStatement(sql);
		
		//Select를 수행하고 data 정보가 ResultSet 클래스에 담겨서 값을 반환
		ResultSet rs=pstmt.executeQuery();
		
		int i=1;
		
		//마지막 data까지 반복해서 가져옴
		while(rs.next()){
			out.println(i+" -> "+rs.getString(1)+", "+rs.getString("email")+"<br />");
			
			i++;
		}
		
		rs.close();
		pstmt.close();
		conn.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
</body>
</html>