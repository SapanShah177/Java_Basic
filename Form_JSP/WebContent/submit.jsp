<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Page</title>
</head>
<body>

<h4>Name : <%= request.getParameter("name") %></h4> <br>

<h4>Gender: <%= request.getParameter("gender") %></h4> <br>

<h4>Language Known: <%
String[] languages = request.getParameterValues("language");

if(languages != null){
	for(String language : languages){
		out.print("<br/>");
		out.print(language);
	}
}else{
	out.print("None Selected.");
}

%></h4> <br>

<h4>Country: <%= request.getParameter("country") %></h4> <br>
	

</body>
</html>