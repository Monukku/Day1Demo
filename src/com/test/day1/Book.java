//package statement means you are grouping
package com.test.day1;

//top level classname Book
//name of the sourcecode is Book.java
public class Book {
	
	//data members
	
	private Long id;
	private String title;
	private Author author;
	private int yearOfPublishing;
	private double price;
	
	
	
	//getters and setters
	
	public void setId(Long id) {
	this.id = id;}

	public Long getId() {
		return this.id;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	//method overloading
	//method having same name different signature 
	//overloaded constructor
	//1.default constructor ,no argument constructor
	Book(){
		System.out.println("book created");
	}
	
	//constructor with 1 arg of Long type
	Book(Long id){
		
		this.id = id;
		System.out.println("book created with "+this.id+"id");
	}
	
	//const with 2 args of Long ,String type
	Book(Long id,String title){
		
		this.id = id;
		this.title =title;
		System.out.println("book created with "+this.id + " id"+this.title + "title");
	}
	
	
	Book(String title,Long id){

		this.id = id;
		this.title =title;
		System.out.println("book created with "+this.id + " id"+this.title + "title");
	
		
	}

	public Book(Long id, String title, Author author, int yearOfPublishing, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
		this.price = price;
	}

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", yearOfPublishing=" + yearOfPublishing
				+ ", price=" + price + "]";
	}

      
	
	
     //overriding toString method
	
	//changing the logic of toString() method  in our Book class ,otherwise we are getting logic of toString() method of java.lang.Object class
	
	
	
	

}
