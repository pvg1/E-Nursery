package com.Enursery.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

/*
 * This contains all the required  variables related to a user
 * contains the getters and setters to set and return those values.
 */
@Component
public class User {
	@NotBlank(message = "Firstname Cannot be Empty")
	@Size(min = 4, max = 50, message = "First Name Should be in range 4-50")
	private String firstname;
	@NotBlank(message = "Lastname Cannot be Empty")
	@Size(min = 4, max = 50, message = "Last Name should be in range 4-50")
	private String lastname;
	@NotBlank(message = "DOB Cannot be Empty ")
	private String dob;
	@NotBlank(message = "email id")
	private String email;
	@Pattern(regexp = "[98765]{1}[0-9]{9}", message = "Contact Number should be 10 digits")
	private String number;
	@NotBlank(message = "UserName cannot be empty")
	@Size(min = 4, max = 20, message = "Username Should be in range of 4-20")
	private String username;
	@NotBlank(message = "Password cannot be empty")
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}", message = "Password should contain one Uppercse, Lowercase, Numbers and Special Character")
	@Size(min = 6, message = "Minimum 6 Characters")
	private String password;
	@Size(min = 5, max = 50, message = "Address Should be in range of 4-20")
	private String address;

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
