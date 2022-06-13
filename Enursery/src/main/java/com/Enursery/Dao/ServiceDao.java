package com.Enursery.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Enursery.Nursery.AddService;



@Repository
public class ServiceDao {
	@Autowired(required = true)
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/*@author Prem
	 * Getting plant categories from database(by Name)
	 * selecting the plantnames from plantcategories
	 */
	public List<String> sername(){    
	    return template.queryForList("select distinct plantname from servicecategories",String.class); 
	} 
	
	/*
	 * Getting plant categories from database(by Type) of the palnt
	 */
	/**
	 * 
	 * @return 
	 */
	public List<String> sertype(){    
	    return template.queryForList("select distinct planttype from servicecategories",String.class);
	}
	
	/*@author Sai Krishna
	 * This action inserts the plant details into the plant details table 
	 */
	public int addservice(AddService u,String user){    
	    String sql="insert into addService (username,plantId,plantname,planttype,season,origin,variety) values(?,?,?,?,?,?,?)";  
	   return template.update(sql,user,u.getPlantId(),u.getPlantname(), u.getPlanttype(), u.getSeason(),u.getOrigin(),u.getVariety());    
	} 

	/* @author Sai Kalyani
	 * This action return teh plant details of a particular nursery 
	 * by executing the query on databse
	 */
	public List<AddService> services(String username){    
	    return template.query("select * from addservice where username='"+username+"';",new RowMapper<AddService>() {  
	        public AddService mapRow(ResultSet rs,  int row)throws SQLException {    
	            AddService s=new AddService();
	            s.setPlantId(rs.getString(2));    
	            s.setPlantname(rs.getString(3));    
	            s.setPlanttype(rs.getString(4));    
	            s.setSeason(rs.getString(5));
	            s.setOrigin(rs.getString(6));
	            s.setVariety(rs.getString(7));
	           
	            return s;    
	        }    
	    }); 
	}
	
	/* @author Vasavi
	 * Get plants  already added by the  Nursery(by Id) to update and delete
	 */
	public AddService getSerById(String id){  
	    String sql="select plantId, plantname, planttype, season, origin, variety from addservice where plantId=?;";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<AddService>(AddService.class));    
	} 
	
	/*
	 * This action perfroms plant updation action by the nursery controller
	 */
	public int updated(AddService p,String user){    
	    String sql="update addService set plantname='"+p.getPlantname()+"', planttype='"+p.getPlanttype()+"',season='"+p.getSeason()+"',origin='"+p.getOrigin()+"',variety='"+p.getVariety()+"'where plantId ='"+p.getPlantId()+"'and username='"+user+"';";    
	    return template.update(sql);    
	} 
	
	
	/*@author Sanket
	 * This action deletes the plant from the table using the plantId by
	 *  nusrsery controller
	 */
	public int delete(String id){    
	    String sql="delete from addservice where plantId="+id+";";    
	    return template.update(sql);    
	} 
}








