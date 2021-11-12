<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>This is store success page</h2>
	Stored user is: ${u}
	<!-- you can access the user object properties -->
	<p>Id: ${u.userId}</p> <!-- userId is the property of User class -->
	<p>Name: ${u.username }</p> <!-- username is the property of User class -->
</body>
</html>
