package com.test.day2;

public class Rectangle  extends Line{
	//data members
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calcArea() {
		
		return this.length * this.breadth;
		
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle(Point a, Point b, double length, double breadth) {
		super(a, b);
		this.length = length;
		this.breadth = breadth;
	}

	//default constructor
	public Rectangle() {
		super();
		
	}

	
	public Rectangle(Point a, Point b) {
		super(a, b);
		
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	

}
