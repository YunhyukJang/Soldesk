<%@ tag language="java" body-content="scriptless" pageEncoding="UTF-8"%>
<%@ attribute name="width" %>
<%@ attribute name="border" %>
<%@ attribute name="bgcolor" %>
<%@ tag import="jspbook.ch10.Product" %>

<jsp:useBean id="product" class="jspbook.ch10.Product"/>

<h2>
	<!-- 본체 내용 출력 -->
	<jsp:doBody/>
</h2>

<table width="${width}" border="${border}" bgcolor="${bgcolor}">
	<% 
	for(String item:product.getProductList()){
		out.println("<tr><td>"+item+"</td></tr>");
	}
	%>
</table>

<!-- body-content="scriptless" -> EL JSP tag를 text가 아닌 tag로 compile한다.
body-content="tagdependent" -> tag를 text로 compile한다. *text 문서를 주로 사용할 때
body-content="empty" -> body가 비어있어야 한다. *출력 코드가 있으면 error -->