package com.cg.eis.exception;

/**
 * This class take user input of a Employee and validates it's salary.
 * 
 * @author Suparna Arya
 *
 */

public class ValidateSalary {

	public static void main(String[] args) throws EmployeeException {
		// Employee object is created.
		Employee emp = new Employee("1234", "Suparna", "Arya", 2000.0);
		// Prints the Employee value.
		System.out.println("Employee id:" + emp.getId());
		System.out.println("Employee first name:" + emp.getFirstName());
		System.out.println("Employee last name:" + emp.getLastName());
		System.out.println("Employee salary:" + emp.getSalary());

	}

}
