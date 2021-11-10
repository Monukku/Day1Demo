package com.test.day1;

public class App {
	public static void main(String[] args) {
		
		//here i am creating book object using default constructor
		Book book1 =  new Book();
		book1.setId(111L);
		book1.setTitle("Sleeping Giants");
		book1.setPrice(1002);
		
		System.out.println(book1);
		
		Book book2 =  new Book(1113L, "The Innovators ", new Author("Walter Isaacson"), 2000, 2300);
		System.out.println(book2);
		
		//it will store the return value of getAuthor 
		Author auth1 =  book2.getAuthor();
		auth1.setEmailId("walter@gmail.com");
		auth1.setId(1243L);
		
		System.out.println(book2.getAuthor());
		//reference is of Parent type ie Book
		//object is of Child type ie Digital Book
		//upcasting
		//it is allowed
		
		Book digi = new DigitalBook(123456L, " Homo Deus ",20);
		//bind the method of setAUthor is happening at compilation
		digi.setAuthor(new Author("Yuval Noah Harari"));
	
		
		//checking whether the digi is an instance of which type ? DigitalBook
		
		//what it will return
		//true or false
		//false
		if(digi instanceof DigitalBook) {
			
			//i am downcasting the digi to be of that type so that i can invoke methods which are specific to that type
			
			//Book class does not have FileFormat ,parent class
			
			((DigitalBook)digi).setFileFormat(FileFormat.MOBI);
			
		}
		System.out.println(digi);
		
		
	}

}
