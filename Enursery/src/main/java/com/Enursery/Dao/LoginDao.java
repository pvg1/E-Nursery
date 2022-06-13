package com.Enursery.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class LoginDao {
	@Autowired(required = true)
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	
	/* jdbc template*/

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/*@author Vasavi
	 * This action will return true both the admin
	 *  username and password are matched from the admin table
	 */

	public boolean adminlogin(String username, String password) {
		String Q = "select count(*) from admin where username=? and password=?";
	/*login log = template.queryForObject(Q, new Object[] { username, password },new RowMapper<login>());
		String Q="select count(*) from admin where username='"+username+"' and password='"+password+"';";*/
	int i =template.queryForObject(Q,new Object[] { username, password },Integer.class);
		if (i!= 0) {
			return true;
		}
		return false;
	}
	
	/*@author Sai Kalyani
	 * This action will return true if both the 
	 * user username and password are matched from the user table else return false
	 */

	public boolean userlogin(String username, String password) {
		String Q = "select count(*) from user where username=? and password=?";
		int i =template.queryForObject(Q,new Object[] { username, password },Integer.class);
		if (i != 0) {

			return true;
		}
		return false;
	}

	/*@author Sai Krishna
	 * This action will return true if both
	 *  the user username and password are matched from the user table else return false
	 */
	public boolean servicelogin(String username, String password) {
		String Q = "select count(*) from service where username=? and password=?";
		int i =template.queryForObject(Q,new Object[] { username, password },Integer.class);
		if (i != 0) {

			return true;
		}
		return false;
	}
	
	/*@author Sanket
	 * This method returns status 0 if the approval status is pending 
	 * else returns 1 for a particular nursery request
	 */
	public boolean approve(String username, String password) {
		String Q = "select status from service where username=? and password=?";
		return template.queryForObject(Q,new Object[] { username, password },boolean.class);
	}
	

	
	
	/*@author Prem
	 * This method fetches the password from the database depending on the 
	 * user name of the particular user.
	 */
	
public String display(String username)
{
String password= template.queryForObject("select password from user where username=?",String.class);
return password;
}

}
