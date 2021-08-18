<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Response Send Redirect 2</title>
</head>
<body>
	<center>
		<h2>Response login</h2>
	
		<form action="ResponseProc.jsp" method="POST">
			<table align="center" width="300" border="1">
				<tr height="40">
					<td width="120" align="center">아이디</td>
					<td width="180" align="center">
						<input type="text" name="id"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="120" align="center">비밀번호</td>
					<td width="180" align="center">
						<input type="password" name="pw"/>
					</td>
				</tr>
				
				<tr height="40">
					<td colspan="2" align="center">
						<input type="submit" value="로그인"/>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>