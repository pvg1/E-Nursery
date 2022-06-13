package com.Enursery.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Enursery.Dao.ServiceDao;
import com.Enursery.Model.Service;
import com.Enursery.Nursery.AddService;

@Controller
public class ServiceController {
		
	@Autowired
	public ServiceDao servicedao;
	
	/*@author Prem
	 * After login as Nursery from the login page 
	 * the nursery homepage will be displayed
	 */
	@RequestMapping(value ="/servicehome")
	public String servicePage(Service service) {
		return "servicehome";
	}
	
	/*@author Sai Kalyani
	 * From Nursery home to add plants page will be redirected by this action
	 */
	@RequestMapping("/addservicepage")    
    public String addservicepage(AddService addservice,Model m){  
				return "AddService";
	}
	
	@ModelAttribute("SerName")
	public List<String> SerName(){
		return servicedao.sername();
	}
	@ModelAttribute("SerType")
	public List<String> SerType(){
		return servicedao.sertype();
	}
	
	
	/*@author Sanket
	 * Validation for the adding plants and added to ServiceDao
	 * if the details are valid plant will be successfully added to the dao
	 */
	@RequestMapping(value = "/Addservice/{username}", method = RequestMethod.POST)
	   public String addservice(@Valid @ModelAttribute("addService") AddService addservice,BindingResult result,@PathVariable String username,ModelMap m) {
		if (result.hasErrors()) {
			return "AddService";
		}
		servicedao.addservice(addservice,username);
		m.put("msg","Your Service is Added Successfully");
	   return "servicehome";
	}
	
	
	/*@author Sai Krishna
	 * This nursery controller action will result in the 
	 * plants added by the nursery 
	 */
	@RequestMapping("/serviceProvided/{username}")    
    public String serviceProvided(@PathVariable String username,Model m){
       List<AddService> list=servicedao.services(username);    
      m.addAttribute("list",list);  
        return "serviceProvided";    
    } 
	
	/*@author Vasavi	
	 * This nursery controller action will result in
	 * redirecting to the edit added plants page
	 */
	@RequestMapping("/update/{username}/{id}")    
    public String serviceProvidedupdate(@PathVariable String username,@PathVariable String id,ModelMap m){  
       AddService addservice=servicedao.getSerById(id);
      m.addAttribute("addService",addservice); 
        return "AddServiceEditform";    
    } 
	
	/*@author  Prem
	 * This controller action will result to update the already
	 *  added plants by the nursery 
	 */
	@RequestMapping("/updated/{username}")    
	public String serviceProvidedupdated(@Valid @ModelAttribute("addService") AddService addservice,BindingResult result,@PathVariable String username,ModelMap m) {
		if (result.hasErrors()) {
				return "AddServiceEditform";
			}
			servicedao.updated(addservice,username);
		   return "redirect:/serviceProvided/"+username;    
		}
	
	
	/*
	 * This nursery controller action is used to delete the already added plant details 
	 */
	 @RequestMapping(value="/delete/{username}/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String username,@PathVariable String id){    
	        servicedao.delete(id);    
	        return "redirect:/serviceProvided/"+username;    
	    }  
	
}
