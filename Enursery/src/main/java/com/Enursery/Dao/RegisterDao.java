//Register Dao
package com.Enursery.Dao;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Enursery.Model.Login;
import com.Enursery.Model.Service;
import com.Enursery.Model.User;

@Repository
public class RegisterDao {

	@Autowired(required=true)
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/*@author Sai Kalyani
	 * This action inserts the values into the user table from the details provided
	 * during user registration and update the database
	 */
	@ExceptionHandler(SQLException.class)
	public int userregister(User u){    
		/*System.out.println(u.getFirstname()+u.getLastname()+u.getAge()+u.getEmailr()+u.getNumber()+u.getUsername()+u.getPassword());*/
	    String sql="insert into user values(?,?,?,?,?,?,?,?)";  
	   return template.update(sql,u.getFirstname(),u.getLastname(),u.getDob(),u.getEmail(),u.getNumber(),u.getUsername(),u.getPassword(),u.getAddress());    
	} 
	
	/*@author Sai Krishna
	 * This action will insert the admin registration details into the admin table
	 */
	public int adminregister(Login u){    
	    String sql="insert into admin values(?,?,?)";  
	   return template.update(sql,u.getName(),u.getUsername(),u.getPassword());    
	} 
	
	/*@author Sanket
	 * Gets value from the nusrsery registration and insert those values into
	 * nursery table with status enabled as false always 
	 */
	public int serviceregister(Service u){    
	    String sql="insert into service  values(?,?,?,?,?,?,false)";  
	   return template.update(sql,u.getName(),u.getNumber(),u.getUsername(),u.getPassword(),u.getLocation(),u.getHours());    
	} 
	
	/*@author Prem
	 * This method checks the username is taken already or not 
	 * return true if not taken alraedy
	 */
	public boolean check(String username, String table) {
		String Q = "select count(*) from "+ table +" where username=?";
		int i =template.queryForObject(Q,new Object[] { username},Integer.class);
		if (i == 0) {

			return true;
		}
		return false;
	}
}
