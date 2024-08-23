<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	
	<form action="login" method="post" class="form">
	<h3>Login Page</h3>
	<label>ENTER YOUR EMAIL<span> *</span></label>
	<input type="text" name="email" id="email">
	<span id="error_email"></span>
	<label>ENTER YOUR PASSWORD<span> *</span></label>
	<input type="password" name="password" id="password">
	<span id="error_password"></span>
	<button type="submit" value="login">Submit</button>
	<p>Don't have an account? <a href="Signup.jsp">Sign Up Here</a></p>
	</form>
	<script type="text/javascript" src="login.js"></script>
</body>
</html>