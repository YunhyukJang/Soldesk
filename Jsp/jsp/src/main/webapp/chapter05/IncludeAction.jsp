<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Include Action</title>
</head>
<body>
	<h2>IncludeAction.jsp에서 Footer.jsp 호출</h2> <hr />
	IncludeAction.jsp에서 출력한 메시지입니다. <br />
	
	<jsp:include page="Footer.jsp">
		<jsp:param value="test@test.net" name="email"/>
		<jsp:param value="000-0000-0000" name="tel"/>
	</jsp:include>
	<br />
	
	<h2>IncludeAction.jsp가 종료됩니다.</h2>
</body>
</html>
<%-- <jsp:include> action tag=소스가 그대로 복사되는 것이 아니라 제어권 자체가 include action으로 
지정된 페이지로 넘어갔다가 다시 원래 페이지로 돌아옴. --%>