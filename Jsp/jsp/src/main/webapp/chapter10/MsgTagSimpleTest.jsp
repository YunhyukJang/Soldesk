<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mytag" uri="/WEB-INF/tld/msgtagsimple.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Msg Tag Simple Test</title>
</head>
<body>
	<div align="center">
		<h2>Custom tag</h2>
		<hr />
		
		<l>
			<mytag:print/>
		</l>
	</div>
</body>
</html>