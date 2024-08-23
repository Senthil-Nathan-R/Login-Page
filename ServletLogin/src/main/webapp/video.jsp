<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
  
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   
       if(session.getAttribute("email")==null){
	   response.sendRedirect("Login.jsp");
   }
%>
<p> GitHub Link : <a href="https://github.com/Senthil-Nathan-R">https://github.com/Senthil-Nathan-R</a></p>
<p> LinkedIn Link : <a href="https://www.linkedin.com/in/senthil-nathan-r-767b972b2">https://www.linkedin.com/in/senthil-nathan-r-767b972b2</a></p>
<form action="logout" method="post">
    <button value="logout">Log Out</button>
</form>

</body>
</html>