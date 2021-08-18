<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Control End</title>
</head>
<body>
	<div align="center">
		<h2>Forward action 및 Send redirect() 결과</h2>
		<hr />
		
		지금 보이는 화면은 PageControlEnd.jsp에서 출력되는 결과입니다.
		<hr />
		
		이름 <%= request.getParameter("username") %> <br />
		전화번호 <%= request.getParameter("tel") %>
	</div>
</body>
</html>