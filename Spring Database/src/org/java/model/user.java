package org.java.model;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class user {

	@Id
	private int userID;
	@Size (min = 3, max = 10, message = "Please Enter Name Between 3 to 10 Characters.")
	private String name;
	@Email (message = "Please Enter Proper Email.")
	private String email;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public user(int userID, String name, String email) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
	}

	public user() {
	}
	
	
	
}
