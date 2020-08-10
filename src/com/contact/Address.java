package com.contact;

public class Address {

	private int zipCode;
	private String state;
	private String city;
	private String neighbourhood;
	private String street;
	private Types zipcodeType;
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighbourhood() {
		return neighbourhood;
	}
	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Types getZipcodeType() {
		return zipcodeType;
	}
	public void setZipcodeType(Types zipcodeType) {
		this.zipcodeType = zipcodeType;
	}
	
	
}
