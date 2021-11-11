package com.test.day2;

public class Point extends Shape{
	//data members
	private int x;
	private int y;
	
	//overriden abstract method
	@Override
	public double calcArea() {
		System.out.println("It's just a point");
		return 0;
	}
	
	//1st constructor
   public Point(Point p) {
	   
	   this.x = p.x;
	   this.y = p.y;
   }
   
   //2 default constructor
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	//3rd two args constructor
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return super.toString() + "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
