<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test1</title>
</head>
<body>
	<h1>Test1</h1>
	
	<form action="Result" method="POST">
		이름 <input type="text" name="userName" value="${requestScope.userDataBean.userName}"/> <br />
		아이디 <input type="text" name="userID" value="${requestScope.userDataBean.userID}"/> <br />
		비밀번호 <input type="password" name="userPw" value="${requestScope.userDataBean.userPw}"/> <br />
		우편번호 <input type="text" name="userPostCode" value="${requestScope.userDataBean.userPostCode}"/> <br />
		주소 1 <input type="text" name="userAddress1" value="${requestScope.userDataBean.userAddress1}"/> <br />
		주소 2 <input type="text" name="userAddress2" value="${requestScope.userDataBean.userAddress2}"/> <br />
		
		<button type="submit">확인</button>
	</form>
</body>
</html>