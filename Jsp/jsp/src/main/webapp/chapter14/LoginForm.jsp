<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>
<body>
	<center>
		<h2>Login</h2>
		
		<form action="LoginProc.do" method="POST">
			<table width="300" border="1" cellspacing="0" cellpadding="5">
				<tr height="40">
					<td width="120" align="center">아이디</td>
					<td width="180" align="center">
						<input type="text" name="id" size="10"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="120" align="center">비밀번호</td>
					<td width="180" align="center">
						<input type="password" name="pw" size="10"/>
					</td>
				</tr>
				
				<tr height="40">
					<td align="center" colspan="2">
						<input type="submit" value="로그인"/>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>