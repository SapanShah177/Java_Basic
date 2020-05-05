package org.java.model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.java.entity.user;

public class UsersModel {

	public List<user> listUsers(DataSource datasource) {
		
		List<user> listUsers = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = datasource.getConnection();
			
			String query = "select * from users";
			stmt = connect.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				listUsers.add(new user(rs.getInt("users_id"), rs.getString("username"), rs.getString("email"))); 
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUsers;
		
	
	}

	public Boolean addUser(DataSource datasource, user newUser) {

		Connection connect = null;
		java.sql.PreparedStatement statement = null;
		try {
			connect = datasource.getConnection();
			
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			String query = "insert into users (username,email) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			return statement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void updateUser(DataSource datasource, user updatedUser) {
		
		Connection connect = null;
		java.sql.PreparedStatement statement = null;
		try {
			connect = datasource.getConnection();
			
			int usersId = updatedUser.getUsers_id();
			String username = updatedUser.getUsername();
			String email = updatedUser.getEmail();
			String query = "update users set username = ? ,email = ? where users_id = ?";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, usersId);
			statement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

	public void deleteUser(DataSource datasource, int userID) {
		
		Connection connect = null;
		java.sql.PreparedStatement statement = null;
		try {
			connect = datasource.getConnection();
			
			String query = "delete from users where users_id = ?";
			statement = connect.prepareStatement(query);
			statement.setInt(1, userID);
			statement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	}

