package com.Enursery.Nursery;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
/*
 * This contains all the required  variables to add a plant category by the admin
 * contains the getters and setters to set and return these values
 */
@Component
public class ServiceCategories {


	private String plantId;
	@Size(min = 4, max = 50, message = "Service Name Should be in range 4-50")
	private String plantname;
	@Size(min = 5, max = 50, message = "Service Type Should be in range 4-50")
	private String planttype;

	public String getPlantId() {
		return plantId;
	}

	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}
	
	public String getPlantname() {
		return plantname;
	}

	public void setPlantname(String plantname) {
		this.plantname = plantname;
	}

	

	public String getPlanttype() {
		return planttype;
	}

	public void setPlanttype(String planttype) {
		this.planttype = planttype;
	}

}


















