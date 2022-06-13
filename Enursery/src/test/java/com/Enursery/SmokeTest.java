package com.Enursery;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Enursery.Controller.AdminController;
import com.Enursery.Controller.LoginController;
import com.Enursery.Controller.RegisterController;
import com.Enursery.Controller.ServiceController;
import com.Enursery.Controller.UserController;
import com.Enursery.Nursery.EnurseryApplication;

/*
This Tests whether the controllers are getting started or not
*/
@SpringBootTest(classes=EnurseryApplication.class)
public class SmokeTest {

	
	@Autowired
	private AdminController adminController;
	
	@Autowired
	private UserController userController;

	@Autowired
	private  LoginController loginController;
	
	@Autowired
	private RegisterController registerController;
	
	@Autowired
	private  ServiceController serviceController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(adminController).isNotNull();
		assertThat(registerController).isNotNull();
		assertThat(userController).isNotNull();
		assertThat(loginController).isNotNull();
		assertThat(serviceController).isNotNull();
	}
}
