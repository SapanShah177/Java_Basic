<%@include file="include/header.jsp"  %>
<%@ page import="java.util.List"%>
<%@ page import="org.java.entity.user"%>


<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			<h1>List Of User</h1>
			<hr />

			<table border="2">
				<thead align="center">
					<th al>User ID</th>
					<th>User Name</th>
					<th>User Email</th>
					<th>Operation</th>
				</thead>
				<%! String deleteURL; %>
				<%
					List<user> listusers = (List) request.getAttribute("listusers");
					String updateURL;
				for (int i = 0; i < listusers.size(); i++) {
					out.print("<tr>");
					out.print("<td>" + listusers.get(i).getUsers_id() + "</td>");
					out.print("<td>" + listusers.get(i).getUsername() + "</td>");
					out.print("<td>" + listusers.get(i).getEmail() + "</td>");
					updateURL = request.getContextPath()+"/operation?page=updateUser"+
						"&users_id="+listusers.get(i).getUsers_id()+
						"&username="+listusers.get(i).getUsername()+
						"&email="+listusers.get(i).getEmail();
					deleteURL = request.getContextPath()+"/operation?page=deleteUser"+
						"&users_id="+listusers.get(i).getUsers_id();
					out.print("<td><a href="+updateURL+"> Update</a>|");
				%>
				<a href="<%= deleteURL%>" onclick="if(!confirm('Are you sure to delete the User?')) return false"> Delete</a></td>
				</tr>
				<%} %>
				 
			</table>



		</div>
	</div>
</div>
<%@include file="include/footer.jsp"  %>