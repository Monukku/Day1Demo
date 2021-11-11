package com.test.day2;

import java.util.Scanner;

public class PrintingApp {
	
	public static void main(String[] args) {
		//when you mentioned Circle implements Printable 
		//it got a type of Printable ,Circle is Printable
		Printable p1 =  new Circle(3,4,6.3);
		p1.print();
		if (p1 instanceof Circle)
		((Circle)p1).fill();
		
		//have we mentioned Cube is printable
		p1 = new Cube();
		p1.print();
		
		
		/**
		 *1.create an interface 
		 *2.create a class which implements that interface
		 *3.you create reference of the interface and create object of implementation class
		 *4.call service methods 
		 * 5.sometimes if we need class specific methods , how do we invoke those methods
		 * 6.we downcast 
		 * */
		
		//2 style
		//we dont create new impl class
		//on the fly we provide the implementation for the abstract method
		//anonymous class 
		//internally compiler will create anonymous class 
		//one impl
		Colorable c1 = new Colorable() {
			
			public void fill() {
				System.out.println("filling the object with your fav color");
				
			}
		};
		
		c1.fill();
		//second impl
		Colorable c2 = new Colorable() {
			
			@Override
			public void fill() {
				Scanner scanner =  new Scanner(System.in);
				System.out.println("Enter your fav color");
				String color =  scanner.next();
				
				System.out.println("filling "+color+" color");
				
			}
		};
		c2.fill();
		
	}

}
