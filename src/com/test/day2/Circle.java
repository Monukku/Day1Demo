package com.test.day2;

import java.util.Scanner;

public class Circle extends Point implements Printable,Colorable {
    //data members
	
	private double radius;
	//constants
	private final static double PI = 3.14;
	
	//constructor
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public Circle() {
		super();
		
	}

	public Circle(int x, int y) {
		super(x, y);
		
	}

	@Override
	public double calcArea() {
		return PI *this.radius *this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + "Circle [radius=" + radius + "]";
	}

	@Override
	public void print() {
		
		System.out.println("circle of radius "+this.radius + "is getting printed");
		
	}

	@Override
	public void fill() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter your fav color");
		String color =  scanner.next();
		
		System.out.println("filling  circle"+color+" color");

		
	}
	
}
