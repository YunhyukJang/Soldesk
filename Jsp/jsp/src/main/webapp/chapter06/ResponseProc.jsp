<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Response Proc</title>
</head>
<body>
	<% 
	String dbId="yunhyuk";
	String dbPw="1004";
	
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	//Database에 있는 아이디와 비밀번호가 입력한 아이디, 비밀번호와 모두 일치하는지 확인
	if(dbId.equals(id) && dbPw.equals(pw)){
		session.setAttribute("id", id);
		
		response.sendRedirect("ResponseLogin.jsp");
	}else{
	%>
	
	<script type="text/javascript">
		alert("아이디 또는 비밀번호가 틀립니다.");
		
		history.go(-1);
	</script>
	
	<% 
	}
	%>
	
	감사합니다. *출력 불가능
</body>
</html>