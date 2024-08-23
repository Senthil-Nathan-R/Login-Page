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
    
	<form action="signin" method="post" class="form">
	<h3>SignUp</h3>
	<label>ENTER YOUR USERNAME<span> *</span></label>
	<input type="text" name="username" id="username">
	<span id="err_name"></span>
	<label>ENTER YOUR EMAIL<span> *</span></label>
	<input type="email" name="email" id="email">
	<span id="err_email"></span>
	<label>NEW PASSWORD<span> *</span></label>
	<input type="password" name="password" id="password">
	<span id="err_password"></span>
	<label>CONFIRM PASSWORD<span> *</span></label>
	<input type="password" name="cpassword" id="cpassword">
	<span id="err_cpassword"></span>
	<button type="submit">Submit</button>
	</form>
	<script type="text/javascript" src="signin.js"></script>
</body>
</html>