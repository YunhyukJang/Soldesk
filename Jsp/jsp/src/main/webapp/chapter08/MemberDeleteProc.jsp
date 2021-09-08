<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Delete Proc</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	%>
	
	<jsp:useBean id="mbean" class="model.MemberDBBean">
		<jsp:setProperty name="mbean" property="*"/>
	</jsp:useBean>
	
	<% 
	MemberDAO mDAO=new MemberDAO();
	
	String pw=mDAO.getPw(mbean.getId());
	
	if(mbean.getPw1().equals(pw)){
		mDAO.deleteMember(mbean.getId());
	%>
	
	<!-- 방법 1 -->
	<script type="text/javascript">
		alert("삭제되었습니다.");
		
		location.replace("MemberList.jsp");
	</script>
		
		<!-- 방법 2
		response.sendRedirect("MemberList.jsp"); -->
		
	<% 
	}else{
	%>
	
	<script type="text/javascript">
		alert("비밀번호가 일치하지 않습니다.");
		
		history.go(-1);
	</script>
	
	<% 
	}
	%>
</body>
</html>