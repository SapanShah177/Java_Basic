<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet"/>
<title>User Form</title>
</head>
<body>
<h4>Submit Your Information</h4>
<hr>
<form:form action="userdetails" modelAttribute="user">

Name: <form:input path="name" required="true" placeholder="Enter Name"/> <br/>
<form:errors path="name" cssStyle="color:red"/> 
<p/>
Email: <form:input path="email" required="true" placeholder="Enter Email"/> <br/>
<form:errors path="email" cssStyle="color:red"/> 
<p/>
Gender: <form:radiobuttons path="gender" items="${genderMap }" required="true"/>
		<p/>
Country: <form:select path="country" items="${countryMap }"/>
	<p/>		
		 
Visited Countries: 
				China <form:checkbox path="visitedCountry" value="China"/>
				Taiwan <form:checkbox path="visitedCountry" value="Taiwan"/>
				Germany <form:checkbox path="visitedCountry" value="Germany"/>
				UK <form:checkbox path="visitedCountry" value="UK"/>
				<p/>
<input type="submit" value="submit">

</form:form>

</body>
</html>