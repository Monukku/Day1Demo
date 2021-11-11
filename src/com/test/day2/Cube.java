package com.test.day2;

public class Cube extends Rectangle {
	//data members
	
	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + "Cube [height=" + height + "]";
	}

	//defining the Cube constructor  with 3 parameters 
	//while defining are parameters
	public Cube(double length, double breadth, double height) {
		//calling the super class constructor with two parameters
		//in turn go to call the Rectangle class constructor
		//l and b are args
		
		super(length, breadth);
		this.height = height;
	}

	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double calcVol() {
		return this.calcArea() *this.height;
	}
	

}
