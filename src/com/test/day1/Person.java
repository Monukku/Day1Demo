package com.test.day1;

import java.time.LocalDate;

public class Person {
	//protected  will be useful when the child class wants to use it directly 
	//by using this keyword
	
	
	protected Long id;
	private String name;
	private String mobileNumber;
	//Person has a Address
	
	private Address address;
	private LocalDate dateOfBirth;
	private String aadharId;
	
	
	
	public void printId() {
		System.out.println(this.id);
		
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", aadharId=" + aadharId + "]";
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getMobileNumber() {
		return mobileNumber;
	}





	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}





	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}





	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}





	public String getAadharId() {
		return aadharId;
	}





	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}





	public Person(Long id, String name, String mobileNumber, Address address, LocalDate dateOfBirth, String aadharId) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
	}





	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}




//Person is created with id and name
	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}





	public Person(Long id, String name, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}





	public Person( String name, String aadharId,Long id) {
		super();
		this.id = id;
		this.name = name;
		this.aadharId = aadharId;
	}





	public void apply() {
		System.out.println("A regular Person");
		
	}
	
	
	
	
	
	
	

}
