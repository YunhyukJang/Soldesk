<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	
	String product=request.getParameter("product");
	
	//session.getAttribute()으로부터 productList라는 이름의 ArrayList 객체를 생성하여 상품 리스트를 가져오기
	//session은 Object 타입으로 반환되므로 (ArrayList)로 다운 캐스팅한다.
	ArrayList<String> list=(ArrayList)session.getAttribute("productList");
	
	//productList가 null이면 새로운 객체를 생성
	if(list == null){
		list=new ArrayList<String>();
		
		session.setAttribute("productList", list);
	}
	
	list.add(product);
	%>
	
	<script>
		alert("<%= product %>를 담았습니다.");
		
		history.go(-1);
	</script>
</body>
</html>
<!-- history.go(0)=현재 페이지 리로드
history.go(-1)=이전 페이지
history.go(-2)=이전전 페이지
histroy.back()=history.go(-1) -->