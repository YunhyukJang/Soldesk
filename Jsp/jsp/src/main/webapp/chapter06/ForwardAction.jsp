<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% request.setCharacterEncoding("UTF-8"); %>
<!-- 페이지의 param 값을 함께 전송해온다. 즉, request.getParameter 값을 받음. -->
<jsp:forward page="PageControlEnd.jsp">
	<jsp:param name="tel" value="000-0000-0000"/>
</jsp:forward>