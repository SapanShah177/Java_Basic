<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User details</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet"/>
</head>
<body>

Name: ${user.name } <br/>
Email: ${user.email } <br/>
Gender : ${user.gender } <br/>
Country : ${user.country } <br/>

Visited Countries:
<ul> 
<c:forEach items="${user.visitedCountry }" var="item">
<li> ${item }</li>
</c:forEach>
</ul>
</body>
</html>