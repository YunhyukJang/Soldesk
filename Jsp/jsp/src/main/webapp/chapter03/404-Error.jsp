<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404-Error</title>

<jsp:useBean id="now" class="java.util.Date"/>

</head>
<body>
	<div align="center">
		<h2>404-Error</h2>
		<hr />
		
		<table>
			<tr width=100% bgcolor="pink">
				<td>요청하신 페이지를 찾을 수 없습니다. <br/>
					URL주소를 확인하세요.
				</td>
			</tr>
			
			<tr>
				<td>
					${now} <!-- EL code --> <p/>
					요청하신 페이지 -> ${pageContext.errorData.requestURI} <br />
					상태 코드 -> ${pageContext.errorData.statusCode} <br />
					
					예외 코드 -> ${pageContext.errorData.throwable}
					<!-- page directive에 isErrorPage="true"를 추가해야 실행 가능 -->
				</td>
			</tr>
		</table>
	</div>
</body>
</html>