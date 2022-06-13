package com.Enursery.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


/*
 *  This contains all the required  variables of a nursery and contains the 
 *   getters and setters to set and return these values like planttype,season etc.
 */
@Component
public class Service {
	@NotBlank(message="Name Field Cannot be Empty")
	@Size(min = 4, max=50,message = "Name should be in range 4-50")
	private String name;
	@Pattern(regexp = "[98765]{1}[0-9]{9}", message = "Contact Number should be 10 digits")
	private String number;
	@NotBlank(message = "UserName Cannot be Empty")
	private String username;
	@NotBlank(message = "Password cannot be empty")
    @Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}", message="password should contain one Uppercse, Lowercase, numbers and special character")
    @Size(min=6, message="Minimum 6 Characters")
	private String password;
	@NotBlank(message="Service Location Field Cannot be Empty")
	private String location;
	@NotBlank(message=" Field Cannot be Empty")
	private String hours;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHours( ) {
		return hours;
	}
	public void setHours (String hours){
		this.hours = hours;
	}
	
}
