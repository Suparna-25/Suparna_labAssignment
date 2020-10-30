/*
 * This interface holds all the service operations
 * @author: Suparna Arya 
 */
package com.cg.eis.service;
import com.cg.eis.bean.*;

public interface EmployeeService {
	/*
	 * This method takes all the details of an employee as an input
	 */
	Employee  getEmployeeDetails();
	/*
	 * This method set insurance scheme for employees depending on their salay and designation
	 */
	void findInsuranceScheme(Employee emp);
	/*
	 * This method display all the details of an employee
	 */
	void display(Employee emp);

}
