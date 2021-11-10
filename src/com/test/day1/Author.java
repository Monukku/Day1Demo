package com.test.day1;

public class Author {
	
	//private data members 
	private Long id;
	private String name;
	private String emailId;
	
	
	
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public Author(Long id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	public Author(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Author(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
	
	
	//setters and getters
	
	
	//constructors
	
	
	//toString
	
	
	

}
