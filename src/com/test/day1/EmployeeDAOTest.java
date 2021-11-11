package com.test.day1;

import java.time.LocalDate;

public class EmployeeDAOTest {

	public static void main(String[] args) {
		
		Employee e =  new Employee(12121L, "jaya", "5345345", new Address(), LocalDate.of(2000, 2, 2), "543545345", 5345435L, LocalDate.now(), Position.CFO, 80000, LocalDate.of(2021, 2, 2), 121212L);
		
		//code to the abstraction
		//not to the implementation
		
		EmployeeDAO  dao = new EmployeeDAOImpl();
		
		e = dao.addEmployee(e);
		System.out.println(e);
	    e.setSalary(e.getSalary()*2);
	    e = dao.updateEmployee(e);
	    System.out.println(e);
	    
	}
}
