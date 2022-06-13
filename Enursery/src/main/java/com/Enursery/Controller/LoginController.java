//Login Controller(Admin,Nursery ,User)


package com.Enursery.Controller;

import javax.servlet.http.HttpSession;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Enursery.Dao.LoginDao;
import com.Enursery.Model.Login;

@Controller
public class LoginController {
	@Autowired
	public LoginDao logindao;

	/*@author Vasavi
	 * After the registration login page will be displayed to either of
	 * admin , nursery and user
	 */
	@RequestMapping(value = "/loginpage")
	public String loginPage(Login login) {
		return "login";
	}

	
	/*@author Prem
	 * This method will validate the login credentials provided by the admin
	 * and redirects to adminhome on successful login
	 * Else will ask the admin to enter valid details
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") Login login, HttpSession session, ModelMap m) {
		if (login.getType().equals("admin")) {
			boolean log = logindao.adminlogin(login.getUsername(), login.getPassword());
			if (log) {
				session.setAttribute("username", login.getUsername());
				return "adminhome";
			} else {
				m.put("msg", "Please enter valid Credentials");
				return "login";
			}
		}

		/*@author Sai Kalyani
		 * This method will validate the login credentials provided by the User
		 * and redirects to User home on successful login
		 * Else will ask the User to enter valid details
		 */
		else if (login.getType().equals("user")) {
			boolean log = logindao.userlogin(login.getUsername(), login.getPassword());
			if (log) {
				session.setAttribute("username", login.getUsername());
				return "redirect:/userhome";
			} else {
				m.put("msg", "Please enter valid Credentials");
				return "login";
			}
		} 
		
		/*@author Sai Krishna
		 * This method will validate the login credentials provided by the nursery
		 * 1. Redirects to nursery home upon correct details and admin approval
		 * 2. Asks to wait till the admin approval for pending users
		 * 3. Asks to enter valid Credentials fro incorrect details
		 */
		else {
			boolean log = logindao.servicelogin(login.getUsername(), login.getPassword());
			if (log) {
				boolean approve = logindao.approve(login.getUsername(), login.getPassword());
				if (approve) {
					session.setAttribute("username", login.getUsername());
					return "servicehome";
				} else {
					m.put("msg", "Approval pending with Admin");
					return "login";
				}
			} 
			
			else {
				m.put("msg", "Please enter valid Credentials");
				return "login";
			}

		}
	}
	
	/*@author Sanket
	 * This method will end the session of user/admin/nursery 
	 * and logs out of their profile
	 */
	@RequestMapping(value = "/logout/{username}")
	public String logout(HttpSession session, @PathVariable String username, ModelMap m) {
		session.removeAttribute(username);
		return "redirect:/loginpage";
	}

	@RequestMapping(value = "/Welcome")
	public String welcome() {
		// m.addAttribute("command", new login());
		return "Welcome";
	}

	/*@author Vasavi
	 * This method takes the user to enter valid
	 *  user name and number for restoring the password
	 */
	@RequestMapping(value="/forgot")
	public String forgotUserId() {
		return "forgot";
	}
	
	@RequestMapping(value="/displaypassword")    
    public String getDisplay(){
        return "displaypassword";    
    }
	
}



/*
@@RequestMapping("/address/{id}")    
    public String addresspage(@PathVariable String id ,Model m){  
		Search s=userdao.getAddById(id);
	      m.addAttribute("search",s); 
				return "address";
	}	
*/
