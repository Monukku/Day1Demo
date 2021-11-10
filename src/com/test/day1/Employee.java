package com.test.day1;

import java.time.LocalDate;

public class Employee extends Candidate{
	
	private double salary;
	private LocalDate dateOfJoining;
	private Long employeeId;
	

	public Employee(Long id, String name, String mobileNumber, Address address, LocalDate dateOfBirth, String aadharId,
			Long candidateId, LocalDate dateOfApplication, Position position, double salary, LocalDate dateOfJoining,
			Long employeeId) {
		super(id, name, mobileNumber, address, dateOfBirth, aadharId, candidateId, dateOfApplication, position);
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.employeeId = employeeId;
	}

	public Employee(double salary, LocalDate dateOfJoining, Long employeeId) {
		super();
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.employeeId = employeeId;
	}
  
	
	
	public Employee(Long id, String name, Long candidateId, LocalDate dateOfApplication, Position position,
			double salary, LocalDate dateOfJoining, Long employeeId) {
		super(id, name, candidateId, dateOfApplication, position);
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.employeeId = employeeId;
	}

	public Employee(Long id, String name, Long candidateId, LocalDate dateOfApplication, Position position) {
		super(id, name, candidateId, dateOfApplication, position);
		// TODO Auto-generated constructor stub
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String mobileNumber, Address address, LocalDate dateOfBirth, String aadharId,
			Long candidateId, LocalDate dateOfApplication, Position position) {
		super(id, name, mobileNumber, address, dateOfBirth, aadharId, candidateId, dateOfApplication, position);
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String mobileNumber, LocalDate dateOfApplication, Position position) {
		super(id, name, mobileNumber, dateOfApplication, position);
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", employeeId=" + employeeId + "]";
	}

	@Override
	public void apply() {
		
		System.out.println("I got the job "+ this.getDateOfJoining() );
		
	}
}
