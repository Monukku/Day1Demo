package com.test.day2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Rectangle rect = null;
		Shape shape = null;
		System.out.println("1.Point");
		System.out.println("2.Line");
		System.out.println("3.Rectangle");
		System.out.println("4.Cube");
		System.out.println("5.Circle");
		System.out.println("6.Cylinder");
		
		//creating scanner object of type Scanner
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter your choice of object to be created");
		//return value of nextInt in the int variable choice
		int choice =  scanner.nextInt();
		
		
		switch(choice) {
		
		case 1:{
			//p1 is the return value of acceptPointvalues method which we are invoking on line 28
			Point p1 = acceptPointValues(scanner);
			//user choice is 1 , we have to create a Point object
			//we have to call Point constructor
			
			shape = new Point(p1);
			System.out.println("point created");
			break;
			
		}
		case 2: {
			//to create a Line object i need two Point objects
			//hence we will call acceptPointValues() method twice
			Point p3 = acceptPointValues(scanner);
			Point p4 = acceptPointValues(scanner);
			//user enter to create a Line obj,we are calling Line constructor
			shape = new Line(p3,p4);
			break;
			
		}
		case 3: {
			//user choice is Rectangle
			//control will go to acceptRect() methods
			//static method 
			//so dont need the object of this class to invoke
			
			shape = acceptRect();
			break;
			
			
		}
		case 4: {
			
			//user choice is cube
			//first we will reuse the code by which we will get Rectangle
			shape=acceptRect();
			//we will downcast after checking the instance of shape
			if(shape instanceof Rectangle)
			rect=(Rectangle) shape;
			//accept height
			System.out.println("Enter height");
			double height =  scanner.nextDouble();
			//we will call Cube constructor
			shape= new Cube(rect.getLength(),rect.getBreadth(),height);
			
			break;
			
		}
		case 5: {
			//here i am not using scanner to accept radius from the user
			//if you want you can write separate code like below ones to accept using scanner
			//here i have hard coded values
			shape = new Circle(4,5,3.4);
			break;
		}
		case 6: {
			shape = new Cylinder(3, 4, 5);
			break;
		}
		default : {System.out.println("wrong choice");
		System.exit(0);
		}
		
		
		
		
		}
		double area = calculateArea(shape);
		System.out.println("resultant number is "+area);
		
		
	}

	private static double calculateArea(Shape shape) {
		if (shape instanceof Cube || shape instanceof Cylinder)
			return shape.calcVol();
		else
		return shape.calcArea();
	}

	private static Shape acceptRect() {
		//created a shape which is null 
		Shape shape = null;
		//created a scanner2
		Scanner scanner2=  new Scanner(System.in);
		//accepted length
		System.out.println("Enter length");
		double l =  scanner2.nextDouble();
		//accepted breadth
		System.out.println("Enter breadth");
		double b =  scanner2.nextDouble();
		
		//called constructor of Rectangle class with two values
		
		shape =  new Rectangle(l, b);
		//returned that shape object
		return shape;
	}

	private static Point acceptPointValues(Scanner scanner) {
		System.out.println("enter values for  x and y");
		int a =  scanner.nextInt();
		int b =  scanner.nextInt();
		Point p1 = new Point(a,b);
		return p1;
	}

}
