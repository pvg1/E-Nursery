//Admin Controller(Admin Home Actions)
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

import com.Enursery.Dao.AdminDao;
import com.Enursery.Model.Login;
import com.Enursery.Model.Service;
import com.Enursery.Nursery.ServiceCategories;


@Controller
public class AdminController {
	@Autowired
	public AdminDao admindao;

	/* @author Sai Krishna 
	 *   This action results in the admin homepage
	 *   The first page after successful admin login
	 */
	@RequestMapping(value = "/adminhome")
	public String adminPage(Login login) {
		return "adminhome";
	}

	/*@author Sai Kalyani
	 * The approve page is contained with the new nursery 
	 * registrations waiting for the approval 
	 */
	@RequestMapping("/approve")
	public String approve(Model m) {
		List<Service> list = admindao.Approve();
		m.addAttribute("list", list);
		return "approve";
	}

	/*@author Vasavi
	 * Admin can approve the nusrsery and get it updated in the admindao
	 */
	@RequestMapping(value = "/approve/{username}")
	public String edit(@PathVariable String username, Model m) {
		admindao.approved(username);
		return "redirect:/approve";
	}

	/*@author Prem
	 * Admin action after delete and also delete the nursery in the admindao
	 */
	@RequestMapping(value = "/delete/{username}")
	public String delete(@PathVariable String username) {
		admindao.delete(username);
		return "redirect:/approve";
	}

	/*@author Sai Kalyani
	 *  To Add new Plant categories from adminhome.jsp by the admin
	 */
	@RequestMapping(value = "/addservicecategories")
	public String addServiceCategories(ServiceCategories servicecategories) {
		return "AddServiceCategories";
	}

	/*@author Sai Krishna
	 *  Validation for Plant Categories and then added to AdminDao
	 * 
	 */
	@RequestMapping(value = "/serviceCategories", method = RequestMethod.POST)
	public String serviceCategories(@Valid @ModelAttribute("serviceCategories") ServiceCategories servicecategories,
			BindingResult result, ModelMap map) {
		if (result.hasErrors()) {
			return "AddServiceCategories";
		}
		admindao.addservicecateories(servicecategories);
		map.put("msg", "Service Category is Added Successfully");
		return "adminhome";
	}

	/*@author Sanket
	 * To know the plant Categories Provided by the Admin(Admin action)
	 * This action results in redirection to the page of provided plant categories by the admin
	 */
	@RequestMapping("/categoriesProvided")
	public String categoriesProvided(Model m) {
		List<ServiceCategories> list = admindao.categories();
		m.addAttribute("list", list);
		return "categoriesProvided";
	}

	/*@author Prem
	 * By this action the admin  will redirect to Addplant Categories Edit form 
	 */
     
	@RequestMapping("/update/{id}")
	public String categoriesupdate(@PathVariable String id, ModelMap m) {
		ServiceCategories servicecategories = admindao.getcatById(id);
		m.addAttribute("serviceCategories", servicecategories);
		return "AddServiceCategoriesEditform";
	}

	/*@author Vasavi
	 * By the Update action, it updates the plant categories already provided by the
	 *  admin to the nurseries to add plants
	 */
	@RequestMapping("/updated")
	public String categoriesupdated(@Valid @ModelAttribute("serviceCategories") ServiceCategories servicecategories,
			BindingResult result, ModelMap m) {
		if (result.hasErrors()) {
			return "AddServiceCategoriesEditform";
		}
		admindao.updated(servicecategories);
		return "redirect:/categoriesProvided";
	}

	/* @author Sai Kalyani
	 * By the delete action, it deletes the plant Categories already provide by the
	 * admin and redirects to the same page 
	 */
	@RequestMapping(value = "/deletecat/{id}", method = RequestMethod.GET)
	public String deletecat(@PathVariable String id) {
		admindao.deletecat(id);
		return "redirect:/categoriesProvided";
	}

	
	/*@author Sanket
	 * This action results in the latest plant articles on the plants 
	 * Both the user and admin can see the latest plant articles
	 */
	@RequestMapping(value = "/plant_articles")
	public String Articles() {
		return "plant_articles";
	}

}
