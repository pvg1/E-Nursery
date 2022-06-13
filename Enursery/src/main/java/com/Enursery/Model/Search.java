package com.Enursery.Model;

import org.springframework.stereotype.Component;

/*
 *  This contains all the required  variables for the search  of plants by the user
 *   contains the getters and setters to set and return these values like planttype,season etc.
 */
@Component
public class Search {
	private String name;
    private String number;
	  private String plantId;
	  
	  private String plantname;
	  private String planttype;
	  private String season;
	  private String origin;
	  private String variety;
	  private String location;

	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name =name;
		}
		 public String getPlantId() {
				return plantId;
			}
			public void setPlantId(String plantId) {
				this.plantId =plantId;
			}
	  
	  
	
	  public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number =number;
		}

		  public String getPlantname() {
			return plantname;
		}
		public void setPlantname(String plantname) {
			this.plantname =plantname;
		}


		public String getPlanttype() {
			return planttype;
		}
		public void setPlanttype(String planttype) {
			this.planttype =planttype;
		}

		public String getSeason() {
			return season;
		}
		public void setSeason(String season) {
			this.season =season;
		}

		public String getVariety() {
			return variety;
		}
		public void setVariety(String variety){
			this.variety =variety;
		}

		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin =origin;
		}

		 public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location =location;
			}
	  
}
