<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Update Proc</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	%>
	
	<jsp:useBean id="mbean" class="model.MemberDBBean">
		<!-- 모든 data 갱신 -->
		<jsp:setProperty name="mbean" property="*"/>
	</jsp:useBean>
	
	<% 
	MemberDAO mDAO=new MemberDAO();
	
	String pw=mDAO.getPw(mbean.getId());
	
	if(mbean.getPw1().equals(pw)){
		mDAO.updateMember(mbean);
		
		response.sendRedirect("MemberList.jsp");
	}else{
	%>
	
	<script type="text/javascript">
		alert("비밀번호가 일치하지 않습니다.")
		
		history.go(-1);
	</script>
	
	<% 
	}
	%>
</body>
</html>