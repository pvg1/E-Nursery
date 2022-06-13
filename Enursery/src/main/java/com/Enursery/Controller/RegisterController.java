//Register Controller(Admin,Nursery,User)

package com.Enursery.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Enursery.Dao.RegisterDao;
import com.Enursery.Model.Login;
import com.Enursery.Model.Service;
import com.Enursery.Model.User;

@Controller
public class RegisterController {
	@Autowired
	public RegisterDao registerdao;

	/*@author Sanket
	 * Admin Registration by clicking the register button 
	 * and enter required details for registration
	 */
	@RequestMapping(value = "/adminregisterpage")
	public String adminregisterPage(Login login) {
		return "adminregister";
	}

	/*@author Sai Kalyani
	 * Validation for Admin Registration
	 * Upon entering the required fields with satisfying conditions 
	 * details will be submitted successfully else has to register again
	 */
	@RequestMapping(value = "/adminregister", method = RequestMethod.POST)
	public String adminregister(@Valid @ModelAttribute("login") Login login, BindingResult result, ModelMap map) {
		if (result.hasErrors()) {
			return "adminregister";
		}
		if (registerdao.check(login.getUsername(), "admin")) {
			int i = registerdao.adminregister(login);
			if (i == 1)
				map.addAttribute("msg", "Your Details are Submitted Successfully");
			return "login";
		} else {
			map.put("avail", "Username is Not Available");
			return "adminregister";
		}
	}

	/*@author Prem
	 * Nursery Registration by clicking the nursery registration button
	 * The page has to be filled with details
	 */
	@RequestMapping(value = "/serviceregisterpage")
	public String serviceregisterPage(Service service) {
		return "serviceregister";
	}

	/*@author Vasavi
	 * Validaition for Nursery Registration
	 * The details will be sent for the approval on successful registartion 
	 * else has to register again
	 */
	@RequestMapping(value = "/serviceregister", method = RequestMethod.POST)
	public String serviceregister(@Valid @ModelAttribute("service") Service service, BindingResult result,Login login,
			ModelMap map) {
		if (result.hasErrors()) {
			return "serviceregister";
		}
		if (registerdao.check(service.getUsername(), "service")) {
			int i = registerdao.serviceregister(service);
			if (i == 1)
				map.put("msg", "Your Nursery registration sent for approval");
			return "login";
		} 
		else {
			map.put("avail", "Username is Not Available");
			return "serviceregister";
		}
	}

	/*@author Sai Krishna
	 * User Registration by clicking the link user register button
	 *  The page has to be filled with details
	 */
	@RequestMapping(value = "/userregisterpage")
	public String userregisterPage(User user) {
		return "userregister";
	}

	/*@author Sanket
	 * Validaition for user User Registration
	 * The registration will be successful if the username is not taken already
	 */
	@RequestMapping(value = "/userregister", method = RequestMethod.POST)
	public String userregister(@Valid @ModelAttribute("user") User user, BindingResult result, Login login,
			ModelMap map) {
		if (result.hasErrors()) {
			return "userregister";
		}
		if (registerdao.check(user.getUsername(), "user")) {
			int i = registerdao.userregister(user);
			if (i == 1)
				map.put("msg", "Your Details are Submitted Successfully");
			return "login";
		} else {
			map.put("avail", "Username is Not Available");
			return "userregister";
		}

	}
	
	/*@author Vasavi
	 * upon clicking the about button 
	 * About page will be appeared where it contains some developer info abt application
	 */
	@RequestMapping(value = "/About")
	public String about() {
		return "About";
	}

}
