<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
			type="text/css" rel="stylesheet" />
</head>
<body>

<h4>Submit Your Information</h4>
<hr>

<table>
<form:form action="addUser" modelAttribute="user" method="get">

Name: <form:input path="name" required="true" placeholder="Enter Name"/> <br/>
<form:errors path="name" cssStyle="color:red"/> 
<p/>
Email: <form:input path="email" required="true" placeholder="Enter Email"/> <br/>
<form:errors path="email" cssStyle="color:red"/> 
<p/>

<input type="submit" value="submit">

</form:form>
</table>


</body>
</html>