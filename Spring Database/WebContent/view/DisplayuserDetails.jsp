<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User details</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<h3>List Of users in Project:</h3>
	<hr>
	
	<a href="${pageContext.request.contextPath}/addUser"> Add User</a>
	<hr>
	</p>

	<table border="1" align="left">
		<tr>
			<th>User ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		
		<c:forEach items="${users }" var="user">
			<tr> 
				<td>${user.userID }</td>
				<td>${user.name }</td>
				<td>${user.email }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>