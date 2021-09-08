<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Join</title>

<!-- Bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>
<body>
	<center>
		<h2>회원가입</h2>
		
		<form action="MemberJoinProc.jsp" method="POST">
			<table width="500" border="1">
				<tr height="40">
					<td width="200" align="center">아이디</td>
					<td width="200" align="left">
						<input type="text" name="id" size="20" placeholder="아이디를 입력하세요."/>
					</td>
				</tr>
					
				<tr height="40">
					<td width="200" align="center">비밀번호</td>
					<td width="200" align="left">
						<input type="password" name="pw" size="20" placeholder="비밀번호를 입력하세요."/>
					</td>
				</tr>
					
				<tr height="40">
					<td width="200" align="center">이메일</td>
					<td width="200" align="left">
						<input type="email" name="email" size="20" placeholder="이메일을 입력하세요."/>
					</td>
				</tr>
					
				<tr height="40">
					<td width="200" align="center">전화번호</td>
					<td width="200" align="center">
						<input type="phone" name="tel" size="40"/>
					</td>
				</tr>
					
				<tr height="40">
					<td width="200" align="center">주소</td>
					<td width="200" align="center">
						<input type="text" name="address" size="40"/>
					</td>
				</tr>
				
				<tr height="50">
					<td align="center" colspan="2">
						<input type="submit" value="회원가입"/>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>