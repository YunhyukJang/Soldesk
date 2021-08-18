<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Control</title>
</head>
<body>
	<h2>Forward, Send Redirect test</h2>
	<hr />
	
	<form action="ForwardAction.jsp" method="POST">
		Forward action -> <input type="text" name="username"/>
		<input type="submit" value="request"/>
	</form>
	
	<form action="ResponseSendRedirect.jsp" method="POST">
		Response send redirect -> <input type="text" name="username"/>
		<input type="submit" value="response"/>
	</form>
</body>
</html>
<%-- <jsp:forward> action tag=source copy가 아니라 제어권이 다른 페이지로 넘어갔다가 다시 돌아옴. *param이 넘어감.
response.sendRedirect method=처음 클라이언트가 요청한 URL과 전혀 다른 페이지로 넘어감. *param이 넘어갈 수 없음. --%>