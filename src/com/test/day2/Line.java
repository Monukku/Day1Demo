package com.test.day2;

public class Line extends Shape{
	//data  members or instance variables
	Point a;
	Point b;
	
	
	
	public Line(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Line() {
		super();
		
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return super.toString() + "Line [a=" + a + ", b=" + b + "]";
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		System.out.println("its a line");
		return 0;
	}
	
	

}
