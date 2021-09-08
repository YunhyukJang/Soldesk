<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Join Proc</title>
</head>
<body>
	<center>
		<h2>회원정보 출력</h2>
		
		<% 
		request.setCharacterEncoding("UTF-8");
		%>
		
		<!-- jsp 내용을 java bean class(MemberBean)에 data를 mapping(setter) -->
		<jsp:useBean id="mbean" class="jspbook.ch07.MemberBean">
			<%-- <jsp:setProperty name="mbean" property="id"/>
			<jsp:setProperty name="mbean" property="pw"/>
			<jsp:setProperty name="mbean" property="email"/>
			<jsp:setProperty name="mbean" property="tel"/>
			<jsp:setProperty name="mbean" property="address"/> --%>
			
			<jsp:setProperty name="mbean" property="*"/>
		</jsp:useBean>
		
		<!-- java bean class(MemberBean)에 data를 mapping(setter)한 data를 출력(getter) -->
		<h2>아이디 
			<jsp:getProperty property="id" name="mbean"/>
		</h2>
		
		<h2>비밀번호 
			<jsp:getProperty property="pw" name="mbean"/>
		</h2>
		
		<h2>이메일 
			<jsp:getProperty property="email" name="mbean"/>
		</h2>
		
		<h2>전화번호 
			<jsp:getProperty property="tel" name="mbean"/>
		</h2>
		
		<h2>주소 
			<jsp:getProperty property="address" name="mbean"/>
		</h2>
		<hr />
		
		<h2>전화번호 <%= mbean.getTel() %></h2>
	</center>
</body>
</html>