package com.test.day1;

import java.time.LocalDate;

//Candidate is a Person
public class Candidate extends Person{
	
	private Long candidateId;
	private LocalDate dateOfApplication;
	private Position position;
	
	
	
	public Candidate(Long id, String name, String mobileNumber, Address address, LocalDate dateOfBirth, String aadharId,
			Long candidateId, LocalDate dateOfApplication, Position position) {
		//super --it invokes parent class constructor ,this constructor will take id name mob add dob adharid
		super(id, name, mobileNumber, address, dateOfBirth, aadharId);
		this.candidateId = candidateId;
		this.dateOfApplication = dateOfApplication;
		this.position = position;
	}


	
	
	
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Candidate(Long id, String name, Long candidateId, LocalDate dateOfApplication, Position position) {
		
		//it will parent class(Person )is the parent for Candidate constructor , person is create with id and name
		super(id, name);
		//we are assigning values to the private data members of the 
		this.candidateId = candidateId;
		this.dateOfApplication = dateOfApplication;
		this.position = position;
	}

     



	public Candidate(Long id, String name, String mobileNumber, LocalDate dateOfApplication, Position position) {
		
		//we are invoking parent class (person) constructor which creates Person with id name andmobilenumber
		
		super(id, name, mobileNumber);
		this.dateOfApplication = dateOfApplication;
		this.position = position;
	}





	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}
	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}





	@Override
	public String toString() {
		return super.toString() + "Candidate [candidateId=" + candidateId + ", dateOfApplication=" + dateOfApplication + ", position="
				+ position + "]";
	}
	
	
	@Override
	public void apply() {
		
		System.out.println("Candidate applied for the job "+ this.position + this.getDateOfApplication());
	}
	

}
