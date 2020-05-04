package org.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/project")
	private DataSource datasource;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = datasource.getConnection();
			
			String query = "select * from users";
			stmt = connect.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				out.print("<br/>" + rs.getString("username"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}


}
