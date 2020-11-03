package com.cg.eis.exception;

/**
 * This class contains all attributes of a Employee
 * 
 * @author Suparna Arya
 *
 */
public class Employee {
	private String id;
	private String firstName;
	private String lastName;
	private double salary;

	/**
	 * Employee constructor initializes all the attributes of a Employee class
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param salary
	 * @throws EmployeeException
	 */
	public Employee(String id, String firstName, String lastName, double salary) throws EmployeeException {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		if (salary < 3000) {
			// It validate salary of a Employee and checks if salary less than 3000
			throw new EmployeeException("Salary should not be less than 3000");
		}
		this.setSalary(salary);
	}

	// All the setter and getters are described below
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
