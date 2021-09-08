<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>

<style>
body{
background-color:#F5F5DC;
}
</style>

</head>
<body>
	<div align="center" background-color="#F5F5DC">
		<h2>Login Form</h2>
		<hr />
		
		<form action="Login.jsp" method="POST" name="form1">
			<table border="1">
				<tr>
					<td colspan="2" align="center">로그인</td>
				</tr>
				
				<tr>
					<td align="left">아이디</td>
					<td>
						<input type="text" name="id" placeholder="ID" size="10"/>
					</td>
				</tr>
				
				<tr>
					<td align="left">비밀번호</td>
					<td>
						<input type="text" name="pw" placeholder="Password" size="10"/>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="로그인"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>