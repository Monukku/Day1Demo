package com.test.day1;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public Employee addEmployee(Employee e) {
		System.out.println("adding new employee record " );
		
		return e;
		}

	@Override
	public Employee updateEmployee(Employee e) {
		
		System.out.println("updating exisiting employee");
		return e;
	}
	
	

}
