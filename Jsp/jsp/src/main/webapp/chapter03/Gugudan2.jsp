<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gugudan2</title>
</head>
<body>
	<center>
		<table width="800" height="400" border="1">
			<% 
			int a=1;
			int b=9;
			boolean flag=false;
			
			for(int i=1; i<10; i++){
				for(int j=1; j<10; j++){
					if(i%2 != 0){
						out.print(a+"*"+j+"="+a*j+"<br/>");
						
						flag=true;
					}else{
						out.print(b+"*"+j+"="+b*j+"<br/>");
						
						flag=false;
					}
					
				}
				
				if(flag){
					a++;
				}else{
					b--;
				}
				
			}
			%>
		</table>
	</center>
</body>
</html>