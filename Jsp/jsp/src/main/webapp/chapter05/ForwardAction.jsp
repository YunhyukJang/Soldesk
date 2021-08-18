<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Forward Action</title>
</head>
<body>
	<h2>ForwardAction.jsp에서 Footer.jsp 호출</h2> <hr />
	ForwardAction.jsp의 모든 내용은 출력되지 않습니다.
	
	<%! 
	int a=10;
	%>
	
	<jsp:forward page="Footer.jsp">
		<jsp:param value="test@test.net" name="email"/>
		<jsp:param value="000-0000-0000" name="tel"/>
	</jsp:forward>
	
	<h2>감사합니다.</h2>
</body>
</html>