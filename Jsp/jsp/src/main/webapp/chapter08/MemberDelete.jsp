<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Delete</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	
	String id=request.getParameter("id");
	%>
	
	<center>
		<h2>회원 정보삭제</h2>
		
		<form action="MemberDeleteProc.jsp" method="POST">
			<table width="600" border="1" cellpadding="1" cellspacing="1">
				<tr height="40">
					<td width="200" align="center">아이디</td>
					<td width="400">
						<%= id %>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">비밀번호</td>
					<td width="400">
						<input type="password" name="pw1"/>
					</td>
				</tr>
				
				<tr height="40">
					<td colspan="2" width="600" align="center">
						<input type="hidden" name="id" value="<%= id %>"/>
						<input type="submit" value="삭제"/>
						<input type="button" value="취소" onclick="location.href='MemberList.jsp'"/>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>