package com.test.day1;


public class DigitalBook extends Book {
	//data members
	private double fileSize;
	private FileFormat fileFormat;
	
	//getters and setters
	
	
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	public FileFormat getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(FileFormat fileFormat) {
		this.fileFormat = fileFormat;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "DigitalBook [fileSize=" + fileSize + ", fileFormat=" + fileFormat + "]";
	}
	
	
	
	
	//constructor
	
	DigitalBook(Long id,String title,double fileSize){
		
		super(id,title);
		this.fileSize = fileSize;
		
		
	}
	
	
	
	
	//what the difference between String and enum
	//enum is a way to validation input
	
	
	
	
}
