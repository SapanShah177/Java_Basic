package org.java.conroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.java.entity.user;
import org.java.model.UsersModel;

@WebServlet("/operation")

public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/project")
	private DataSource datasource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page");
		page = page.toLowerCase();

		switch (page) {
		case "listusers":
			listUsers(request, response);
			break;
		case "adduser":
			addUserFormLoader(request, response);
			break;
		case "updateuser":
			updateUserFormLoader(request, response);
			break;
		case "deleteuser":
			deleteUser(Integer.parseInt(request.getParameter("users_id")));
			listUsers(request, response);
			break;	
//		default:
//			errorPage(request, response);
			}

	}
	
	private void deleteUser(int userID) {
		new UsersModel().deleteUser(datasource,userID);
		return;
		
	}

	private void updateUserFormLoader(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("title", "Update User Page");
		try {
			request.getRequestDispatcher("updateUser.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operation = request.getParameter("form");
		operation = operation.toLowerCase();
		
		switch (operation) {
		case "adduseroperation":
			user newUser = new user(request.getParameter("username"), request.getParameter("email"));
			addUserOperation(newUser);
			listUsers(request, response);
			break;
		case "updateuseroperation":
			user updatedUser = new user(Integer.parseInt(request.getParameter("usersId")), request.getParameter("username"), request.getParameter("email"));
			updateUserOperation(datasource ,updatedUser);
			listUsers(request, response);
			break;
		default:
			errorPage(request, response);
			break;
		}
		
	}

	private void updateUserOperation(DataSource datasource, user updatedUser) {
		new UsersModel().updateUser(datasource,updatedUser);
		return;
		
	}

	private void addUserOperation(user newUser) {
		
		new UsersModel().addUser(datasource, newUser);
		return;
	}

	public void listUsers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<user> listusers = new ArrayList<>();
		listusers = new UsersModel().listUsers(datasource);
		request.setAttribute("title", "List Of User Page");
		request.setAttribute("listusers", listusers);
		request.getRequestDispatcher("listuser.jsp").forward(request, response);
	}

	public void addUserFormLoader(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setAttribute("title", "Add User Page");
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}

	public void errorPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("title", "Error Page");
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}
}
