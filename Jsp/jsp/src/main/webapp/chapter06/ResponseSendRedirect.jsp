<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% request.setCharacterEncoding("UTF-8"); %>
<%-- response.sendRedirect method=처음 클라이언트가 요청한 URL과 전혀 다른 페이지로 넘어감. *param이 넘어갈 수 없음. --%>
<% response.sendRedirect("PageControlEnd.jsp"); %>