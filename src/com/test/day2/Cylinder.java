package com.test.day2;

public class Cylinder extends Circle {
	//private instance variable or data member
	private double height;

	//getter and setter 
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//default constructor
	public Cylinder() {
		super();
		
	}

	//constructor with 2 parameters
	public Cylinder(int x, int y) {
		super(x, y);
	
	}

	
	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public Cylinder(int x, int y, double height) {
		super(x, y);
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + "Cylinder [height=" + height + "]";
	}
	
	public double calcVol() {
		return this.calcArea()*this.height;
	}
}
