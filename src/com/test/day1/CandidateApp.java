package com.test.day1;

import java.time.LocalDate;
import java.util.Scanner;

public class CandidateApp {
	public static void main(String[] args) {
		
		//reference of Parent class
		//object of child class
		//SOLID principles
		//Single Responsibility --means a class can have only single responibility
		//O open close principle -- open to extension and close for modification
		//L Liskov's substitution principle
		//I Interface segregation  means creating smaller interfaces , dont create big interface  sim card --calling
		//D  Dependency injection how the objects are created and provided by external framework rather than client app creating the same
		
		
		/**
		interfaces -- any class whihc implements that interface can also use Liskov's substitution
		
		interface A
		
		class B implements A
		
		A a1 = new B();
		
		
		*/
		
		//we are creating a Candidate object
		/*
		 * Person p1 = new
		 * Candidate(12121L,"Heena",33344L,LocalDate.now(),Position.PROGRAMMER);
		 * System.out.println(p1); applyForJob(p1);
		 * 
		 * p1=new Employee(12131L,"Rakesh",44545L,LocalDate.of(2021, 3,
		 * 14),Position.CEO,200000,LocalDate.now(),99999L); System.out.println(p1);
		 * applyForJob(p1);
		 */
		Person p1 = null ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter type of Person C for Candidate or E for Employee");
		
		String choice =  scanner.next();
		
		if (choice.equalsIgnoreCase("C")) {
			
			p1 =  new Candidate(12121L,"Heena",33344L,LocalDate.now(),Position.PROGRAMMER);
			 
		}
		else
		{
			p1=new Employee(12131L,"Rakesh",44545L,LocalDate.of(2021, 3,
					  14),Position.CEO,200000,LocalDate.now(),99999L);
			
		}
		
		applyForJob(p1);
		
	}

	public static void applyForJob(Person p) {
		p.apply();
	}
}
