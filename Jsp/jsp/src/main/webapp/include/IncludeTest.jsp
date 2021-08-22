<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Include Test</title>
</head>
<body>
	<% 
	String campURL="";
	String camping=request.getParameter("camping");
	
	if(camping == null){
		campURL="ChoanCamping.jsp";
	}else{
		if(camping.equals("1")){
			campURL="ChoanCamping.jsp";
		}else if(camping.equals("2")){
			campURL="CampingTheCity.jsp";
		}else if(camping.equals("3")){
			campURL="ChoanCamping.jsp";
		}else if(camping.equals("4")){
			campURL="CampingTheCity.jsp";
		}else if(camping.equals("5")){
			campURL="ChoanCamping.jsp";
		}else if(camping.equals("6")){
			campURL="CampingTheCity.jsp";
		}
		
	}
	%>
	
	<center>
		<table width="1200">
			<!-- Top -->
			<tr>
				<td align="center" colspan="2">
					<%-- <%@ include file="Top.jsp" %> --%>
					<jsp:include page="Top.jsp"/>
				</td>
			</tr>
			
			<tr>
				<!-- Left -->
				<td align="center" width="250">
					<jsp:include page="Left.jsp"/>
				</td>
			
				<!-- Center -->
				<td align="center width="900">
					<jsp:include page="<%= campURL %>"/>
				</td>
			</tr>
			
			<!-- Bottom -->
			<tr height="100">
				<td align="center" colspan="2">
					<jsp:include page="Bottom.jsp"/>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>