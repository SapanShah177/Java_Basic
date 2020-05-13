package org.java.DAO;

import java.util.List;

import org.java.model.user;

public interface AppDAO {
	
	public List<user> listUsers();
	public void addUser(user user);

}
