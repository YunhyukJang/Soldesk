<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>_Login</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>

</head>
<body>
	<div class="container">
		<form action="Login.jsp" method="POST" class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			
			<p>
				<label for="id" class="sr-only">ID</label>
				
				<input type="text" id="id" name="id" class="form-control" placeholder="ID" required autofocus/>
			</p>
			
			<p>
				<label for="pw" class="sr-only">Password</label>
				
				<input type="password" id="pw" name="pw" class="form-control" placeholder="Password" required/>
			</p>
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form>
	</div>
</body>
</html>