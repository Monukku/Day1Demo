package com.test.day1;

public class Address {
	private String bldgName;
	private String streetName;
	private String city;
	private String pincode;
	
	
	public String getBldgName() {
		return bldgName;
	}
	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String bldgName, String streetName, String city, String pincode) {
		super();
		this.bldgName = bldgName;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	public Address(String bldgName, String city) {
		super();
		this.bldgName = bldgName;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [bldgName=" + bldgName + ", streetName=" + streetName + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
	
	

}
