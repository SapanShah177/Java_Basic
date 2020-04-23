<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome to Home Page.</h1>

	<h3>
		<a href="<%=request.getContextPath()%>/Controller?page=Login">Login</a>
	</h3>
	<h3>
		<a href="<%=request.getContextPath()%>/Controller?page=About">About</a>
	</h3>
	<h3>
		<a href="<%=request.getContextPath()%>/Controller?page=signup">Signup</a>
	</h3>

</body>
</html>