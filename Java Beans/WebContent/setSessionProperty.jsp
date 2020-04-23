<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Beans</title>
</head>
<body>

<jsp:useBean id="user" class="org.java.beans.Demo" scope="session"></jsp:useBean>

<form action="getSessionProperty.jsp " method="get">

First Name : <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>'>
Last Name : <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>'>
<input type="submit" value="submit">

</form>

</body>
</html>