package com.Enursery.Nursery;

import org.springframework.stereotype.Component;
/*
 * This contains all the required  variables to adda a plant by the nursery
 * contains the getters and setters to set and return these values
 */

@Component
public class AddService {
private String plantId;
  private String plantname;
  private String planttype;
  private String season;
  private String variety;
  private String origin;
  
public String getPlantId() {
	return plantId;
}
public void setPlantId(String plantId) {
	this.plantId =plantId;
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


}
























































/*package com.Nursery;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Component
public class AddService {
  private String serviceId;
  private String serviceName;
  private String serviceType;
  @Size(min = 4, max=50,message = "Company Name Should be in range 4-50")
  private String name;
  @Size(min = 4, max=50,message = "Address should be in range 4-50")
  private String address;
  @Size(min = 4, max=20,message = "Location should be in range 4-20")
  private String location;
  private String medicalStore;
  private String ambulance;
  
  public String getServiceId() {
	return serviceId;
}
public void setServiceId(String serviceId) {
	this.serviceId = serviceId;
}
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public String getServiceType() {
	return serviceType;
}
public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getMedicalStore() {
	return medicalStore;
}
public void setMedicalStore(String medicalStore) {
	this.medicalStore = medicalStore;
}
public String getAmbulance() {
	return ambulance;
}
public void setAmbulance(String ambulance) {
	this.ambulance = ambulance;
}

}*/
