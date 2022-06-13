package com.Enursery.Model;

import javax.validation.constraints.NotBlank;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


/*
 * This contains all the required  variables for the login of user/admin/nursery
 * contains the getters and setters to set and return these values
 */

@Component
public class Login {
@NotBlank(message = "UserName Cannot be Empty")
@Size(min = 4, max=50,message = "User Name Should be in range 4-50")
private String username;
@NotBlank(message = "Password cannot be empty")
@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}", message="Password Should Contain One Uppercse, Lowercase, Numbers and Special Character")
@Size(min=6, message="Minimum 6 Characters")
private String password;
private String type;
@NotBlank(message="Name Cannot be empty")
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
