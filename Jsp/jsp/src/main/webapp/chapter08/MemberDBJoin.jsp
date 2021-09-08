<%@page import="model.MemberDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member DB Join</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	
	//hobby는 별도 처리
	String[] hobby=request.getParameterValues("hobby");
	
	//배열에 있는 내용을 하나의 스트림으로 저장하기 위한 변수
	String textHobby="";
	
	for(int i=0; i<hobby.length; i++){
		textHobby += hobby[i]+" ";
	}
	%>
	
	<jsp:useBean id="mbean" class="model.MemberDBBean">
		<!-- 서버로 넘어간 속성과 mapping하여 set -->
		<jsp:setProperty name="mbean" property="*"/>
	</jsp:useBean>
	
	<% 
	//기존 주소 번지를 스트림처리된 변수로 대체
	mbean.setHobby(textHobby);
	
	/* String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pw="12341234";
	
	try{
		//1. Driver loading
		Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdbc6.jar를 load
		
		//2. 해당 DB에 접속
		Connection conn=DriverManager.getConnection(url, user, pw);
		//DB 접속 완료
		
		//3. query 준비
		String sql="insert into member values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		//query가 작동하도록 준비
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//?에 맞게 data mapping
		pstmt.setString(1, mbean.getId());
		pstmt.setString(2, mbean.getPw1());
		pstmt.setString(3, mbean.getPw2());
		pstmt.setString(4, mbean.getEmail());
		pstmt.setString(5, mbean.getGender());
		pstmt.setString(6, mbean.getAddress());
		pstmt.setString(7, mbean.getPhone());
		pstmt.setString(8, mbean.getHobby());
		pstmt.setString(9, mbean.getJob());
		pstmt.setString(10, mbean.getAge());
		pstmt.setString(11, mbean.getInfo());
		
		//4. Oracle에 data 입력
		pstmt.executeUpdate();
		
		//5. 자원 반납
		conn.close();
	}catch(Exception e){
		e.printStackTrace();
	} */
	
	MemberDAO mDAO=new MemberDAO();
	
	mDAO.insertMember(mbean);
	
	//가입을 완료하고 가입된 회원들의 list를 출력하는 view
	response.sendRedirect("MemberList.jsp");
	%>
	
	Oracle에 입력 완료.
</body>
</html>