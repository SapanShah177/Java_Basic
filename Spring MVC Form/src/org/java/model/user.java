package org.java.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class user {

	@Size (min = 3, max = 7, message = "Enter the name between 3 to 7 Characters.")
	private String name;
	private String gender;
	private String country;
	@Email (message = "Enter Valid Email Address.")
	private String email;
	private String visitedCountry[];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getVisitedCountry() {
		return visitedCountry;
	}

	public void setVisitedCountry(String[] visitedCountry) {
		this.visitedCountry = visitedCountry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
}
