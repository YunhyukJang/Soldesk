<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.sql.*, javax.naming.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
request.setCharacterEncoding("UTF-8");

//DB 연결 관련 클래스의 인스턴스 변수 선언
Connection conn=null; //연결
PreparedStatement pstmt=null; //sql code

try{
	//new InitialContext()로 context 객체를 확보
	Context initContext=new InitialContext();
	
	//JNDI(Java Name Directory Interface) java:/comp/env를 이용해서 context의 환경 설정에 접근
	Context envContext=(Context)initContext.lookup("java:/comp/env");
	
	//jdbc/xe로 DataSource 객체를 확보
	DataSource ds=(DataSource)envContext.lookup("jdbc/xe");
	
	//연결
	conn=ds.getConnection();
	
	if(request.getParameter("name") != null){
		//sql문 작성을 위한 statement 작성
		String sql="insert into jdbc_test values(?, ?)";
		
		pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, request.getParameter("name"));
		pstmt.setString(2, request.getParameter("email"));
		
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