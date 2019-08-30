package com.nayank.f.persistance;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements java.io.Serializable   {
	private String streetName = null;
	private Integer streetNumber = null;
	private Integer zip = null;
	private String city = null;
	private String state = null;
	private String country = null;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Integer getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", streetNumber=" + streetNumber + ", zip=" + zip + ", city="
				+ city + ", state=" + state + ", country=" + country + "]";
	}


	
	

}

