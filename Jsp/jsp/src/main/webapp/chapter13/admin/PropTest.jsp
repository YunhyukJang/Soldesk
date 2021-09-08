<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prop Test</title>
</head>
<body>
	<div align="center">
		<h2>Properties 활용(load)</h2>
		<hr />
		
		version -> ${prop.get('version')} <br />
		url -> ${prop.get('url')} <br />
		user -> ${prop.get('user')} <br />
		pw -> ${prop.get('pw')}
		<hr />
		
		<h2>Admin properties</h2>
		관리자 ID -> ${prop.get('adminID')} <br /> <!-- put -->
		관리자 전화번호 -> ${tel}
	</div>
</body>
</html>