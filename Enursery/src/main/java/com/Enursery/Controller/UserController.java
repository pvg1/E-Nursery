package com.Enursery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Enursery.Dao.UserDao;
import com.Enursery.Model.Search;
import com.Enursery.Model.User;
import com.Enursery.Nursery.AddService;
@Controller
public class UserController {
	@Autowired
	public UserDao userdao;
	
	/*@author Sanket
	 * After login as a user
	 */
	@RequestMapping(value ="/userhome")
	public String servicePage(User user,AddService addservice,Model m) {
		return "userhome";
	}
	
	/*@author Sai Kalayani
	 * 
	 * user search plants 
	 */
	@RequestMapping("/search")    
    public String addservicepage(AddService addservice,Model m){  
		 List<Search> slist=userdao.search(addservice);
	      m.addAttribute("slist",slist); 
				return "search";
	}
	
	
	/* @author Sai Krishna
	 * Returns the values based on the preference of the user byType(name) using userDao
	 */
	@ModelAttribute("SearchName")
	public List<String> SerName(){
		return userdao.searchname();
	}
	
	/*@author Vasavi
	 * Returns the values based on the preference of the user byType(name) using userDao
	 */
	@ModelAttribute("searchseason")
	public List<String> searchseason(){
		return userdao.searchseason();
	}
	
	/*@author Prem
	 * Based on the search result it returns the address of the Nursery details
	 */
	@RequestMapping("/address/{id}")    
    public String addresspage(@PathVariable String id ,Model m){  
		Search s=userdao.getAddById(id);
	      m.addAttribute("search",s); 
				return "address";
	}	
	
	
	@RequestMapping(value ="/refer")
	public String refer() {
		return "refer";
	}
	
	@RequestMapping(value="/help_feedback")
	public String Help() {
		return "help_feedback";
	}
	
	
	
	@RequestMapping(value="/mng_usr_profile")
	public String Manageprofile() {
		return "mng_usr_profile";
	}
	
	
	
	
	
	
	
}
