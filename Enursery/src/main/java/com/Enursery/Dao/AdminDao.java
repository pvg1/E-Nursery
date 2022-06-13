package com.Enursery.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Enursery.Model.Service;
import com.Enursery.Nursery.ServiceCategories;


@Repository
public class AdminDao {
	@Autowired(required = true)
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/*@author Sanket
	 * This action is responsible for displaying all the pending approvals of 
	 * nursery registration by status column in database
	 * Only for those whose status is false approval is pending 
	 */
	public List<Service> Approve(){    
	    return template.query("select * from service where status=false",new RowMapper<Service>(){  
	        public Service mapRow(ResultSet rs,  int row)throws SQLException {    
	            Service s=new Service();    
	            s.setName(rs.getString(1));    
	            s.setNumber(rs.getString(2));    
	            s.setUsername(rs.getString(3));    
	            s.setPassword(rs.getString(4));
	            s.setLocation(rs.getString(5));
	            s.setHours(rs.getString(6));
	            return s;    
	        }    
	    });    
	} 
	
	/*@author Prem
	 * From the Admin Controller upon the approval of a nursery 
	 * status is is set to true from false
	 */
	public int approved(String username){    
	    String sql="update service set status=true where username='"+username+"';";    
	    return template.update(sql);
	} 

	/*@author Sai Krishna
	 * From the Admin Controller(Based on the username nursery is deleted)
	 * Then the nursery details are deleted from the database
	 */
	public int delete(String username){    
	    String sql="delete from service where username='"+username+"';";    
	    return template.update(sql);    
	}    
	
	/*@author Vasavi
	 * From the Admin Controller after the Validation plant categories are added
	 * and updated in the database of plant categories 
	 */
	public int addservicecateories(ServiceCategories u) {
		  String sql="insert into servicecategories (plantId,plantname,planttype) values(?,?,?)";  
		   return template.update(sql,u.getPlantId(),u.getPlantname(),u.getPlanttype());
	}
	
	/*@author Sai Kalyani
	 * This action fetches all the added plant categories  by the admin to the database
	 * and aslo will arrange them in order
	 */
	public List<ServiceCategories> categories(){    
	    return template.query("select * from servicecategories order by plantId;",new RowMapper<ServiceCategories>() {  
	        public ServiceCategories mapRow(ResultSet rs,  int row)throws SQLException {    
	        	ServiceCategories s=new ServiceCategories();
	            s.setPlantId(rs.getString(1));    
	            s.setPlantname(rs.getString(2));    
	            s.setPlanttype(rs.getString(3));    
	            return s;    
	        }    
	    }); 
	}
	
	
	/*@author Vasavi
	 * To Get the plant categories already added by the Admin to either
	 * update or delete those details
	 */
	public ServiceCategories getcatById(String id){  
	    String sql="select plantId,plantname,planttype from servicecategories where plantId=?;";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<ServiceCategories>(ServiceCategories.class));    
	} 
	
	/* @author Sai Krishna
	 * This action will update the plant categories from the admin controller 
	 * with the filled details of values
	 */
	public int updated(ServiceCategories p){    
	    String sql="update servicecategories set plantId='"+p.getPlantId()+"', plantname='"+p.getPlantname()+"', planttype='"+p.getPlanttype()+"' where plantId='"+p.getPlantId()+"';";    
	    return template.update(sql);    
	} 
	
	/*
	 * @author Prem
	 * Removing details from the database by admin(Admin Controller)
	 * by deleting the row from plant categories using plantId
	 */
	public int deletecat(String id){    
	    String sql="delete from servicecategories where plantId='"+id+"';";    
	    return template.update(sql);    
	} 
	
	

}















