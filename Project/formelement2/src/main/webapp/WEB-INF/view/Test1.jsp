<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test1</title>
</head>
<body>
	<h1>Test1</h1>
	
	<form:form modelAttribute="dataBean" action="Result">
		<form:select path="a1">
			<form:option value="data1">data1</form:option>
			<form:option value="data2">data2</form:option>
			<form:option value="data3">data3</form:option>
		</form:select>
		<hr />
		
		<form:select path="a2">
			<form:options items="${requestScope.dataList1}"/>
		</form:select>
		<hr />
		
		<form:select path="a3">
			<form:options items="${requestScope.dataList2}"/>
		</form:select>
		<hr />
		
		<form:select path="a4">
			<form:options items="${requestScope.dataList3}" itemLabel="key" itemValue="value"/>
		</form:select>
		<hr />
		
		<!-- CheckBox -->
		<!-- data1, data3만 check -->
		<form:checkbox path="a5" value="data1"/>data1
		<form:checkbox path="a5" value="data2"/>data2
		<form:checkbox path="a5" value="data3"/>data3
		<hr />
		
		<!-- String 배열 CheckBox -->
		<!-- dataList1에는 data1, data2, data3가 저장되어 있고 그 중 a6에 저장되어 있는 data1, data3만 선택 -->
		<form:checkboxes path="a6" items="${requestScope.dataList1}"/>
		<hr />
		
		<!-- ArrayList 배열 CheckBox -->
		<form:checkboxes path="a7" items="${requestScope.dataList2}"/>
		<hr />
		
		<!-- KeyValueBean 배열 CheckBox -->
		<form:checkboxes path="a8" items="${requestScope.dataList3}" itemLabel="key" itemValue="value"/>
		<hr />
		
		<!-- RadioButton -->
		<form:radiobutton path="a9" value="data1"/>data1
		<form:radiobutton path="a9" value="data2"/>data2
		<form:radiobutton path="a9" value="data3"/>data3
		<hr />
		
		<!-- String 배열 RadioButton -->
		<form:radiobuttons path="a10" items="${requestScope.dataList1}"/>
		<hr />
		
		<!-- ArrayList 배열 RadioButton -->
		<form:radiobuttons path="a11" items="${requestScope.dataList2}"/>
		<hr />
		
		<!-- KeyValueBean 배열 RadioButton -->
		<form:radiobuttons path="a12" items="${requestScope.dataList3}" itemLabel="key" itemValue="value"/>
	</form:form>
</body>
</html>