package com.Enursery.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Enursery.Model.Search;
import com.Enursery.Nursery.AddService;

@Repository
public class UserDao {
	@Autowired(required = true)
	JdbcTemplate template;
	String x;
	String y;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/*@author Prem
	 * selecting values from the database by distinct plantname from the plants added
	 */
	
	 public List<String> searchname(){    
	    return template.queryForList("select distinct plantname from addservice",String.class); 
	} 
	
	/*@author Sai Krishna
	 * Getting values from the database based on the Distinct season 
	 * from the plant details
	 */
	public List<String> searchseason(){    
	    return template.queryForList("select distinct season from addservice",String.class);
	}
	
	
	
	
	/*@author Vasavi
	 * Based on the user search option it shows the result in the user controller
	 * Data is fetched from the tables by performing  an inner join on tables
	 */
	public List<Search> search(AddService addservice){    
		if(addservice.getPlantname().equals("all")) {
			x=" is not null ";
		}
		else {
			x="='"+addservice.getPlantname()+"' ";
		}
		if(addservice.getSeason().equals("all")) {
			y=" is not null ";
		}
		else {
			y="='"+addservice.getSeason()+"' ";
		}
	
		
		String sql="select s.name,s.number,a.plantId,a.plantname,a.planttype,a.season,a.origin,a.variety,s.location from service as s inner join addservice as a On s.username=a.username";
	    
		return template.query(sql,new RowMapper<Search>() {  
	        public Search mapRow(ResultSet rs,  int row)throws SQLException {    
	        	Search s=new Search();   
	        	s.setName(rs.getString(1)); 
	        	s.setNumber(rs.getString(2));
	            s.setPlantId(rs.getString(3));    
	            s.setPlantname(rs.getString(4));    
	            s.setPlanttype(rs.getString(5));    
	            s.setSeason(rs.getString(6));
	            s.setOrigin(rs.getString(7));
	            s.setVariety(rs.getString(8));
	            s.setLocation(rs.getString(9));
	           
	            return s;    
	        }    
	    }); 
	}
	
	/*@author Sai Kalyani
	 * action to return the details of the plants based on the id of the plant
	 * inner join is performed to fetch details from two tables   
	 */
	
	public Search getAddById(String id){  
		String sql="select s.name,s.number,a.plantId,a.plantname,a.planttype,a.season,a.origin,a.variety,s.location from service as s inner join addservice as a on s.username=a.username where plantId=?;";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Search>(Search.class)); 
	} 
	
	
}
