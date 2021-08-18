<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% request.setCharacterEncoding("UTF-8"); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Request Result</title>
</head>
<body>
	<div align="center">
		<h2>Request test-Parameter</h2>
		<hr />
		
		<table width="400" border="1" cellspacing="1" cellpadding="5">
			<tr>
				<td width="50">이름</td>
				<td width="100">
					<%= request.getParameter("name") %>
				</td>
			</tr>
			
			<tr>
				<td width="50">직업</td>
				<td width="100">
					<%= request.getParameter("job") %>
				</td>
			</tr>
			
			<tr>
				<td width="50">관심분야</td>
				<td width="100">
					<% 
					String interest[]=request.getParameterValues("interest");
					
					for(String inter:interest){
						out.println(inter+"<br/>");
					}
					%>
				</td>
			</tr>
		</table>
		<hr />
		
		<h2>Request test-Cookie</h2>
		
		<table>
			<tr>
				<td>
					1. 클라이언트 IP 주소 -> <%= request.getRemoteAddr() %> <br />
					2. 요청 메서드 -> <%= request.getMethod() %> <br />
					
					<% 
					Cookie cookie[]=request.getCookies();
					%>
					
					3. <%= cookie[0].getName() %>에 설정된 쿠키값 -> <%= cookie[0].getValue() %> <br />
					4. 프로토콜 -> <%= request.getProtocol() %>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>