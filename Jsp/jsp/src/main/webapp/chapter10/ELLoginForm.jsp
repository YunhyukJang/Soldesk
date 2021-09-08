<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Login Form</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<center>
		<h2>Login</h2>
		
		<form action="ELLoginProc.jsp" method="POST">
			<table width="300" border="1" cellpadding="5">
				<tr height="40">
					<td width="120">아이디</td>
					<td width="180">
						<input type="text" name="id"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="120">비밀번호</td>
					<td width="180">
						<input type="password" name="pw"/>
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