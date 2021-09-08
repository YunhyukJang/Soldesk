<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member View</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	%>

	<script type="text/javascript">
		alert("${bean.id}님 회원가입 되었습니다.}");
	</script>
	
	아이디 -> ${bean.id} <br />
	비밀번호 -> ${bean.pw} <br />
	이름 -> ${bean.name} <br />
	연락처 -> ${bean.phone} <br />
	이메일 -> ${bean.email}
</body>
</html>