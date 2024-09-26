<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:red">${errorMsg }</h3>
<form action="login">
	<input type="text" name="userName" placeholder="enter user name">
	<input type="text" name="password" placeholder="enter password">
	<input type="submit" value="login">
</form>
</body>
</html>