/*
 * This class hold all the details of an Employee
 * @author:Suparna Arya
 */
package com.cg.eis.bean;

public class Employee {
	private String id;
	/*
	 * This variable describes unique id of the Employee
	 */
	private String name;
	/*
	 * This variable describes name of the Employee
	 */
	private int salary;
	/*
	 * This variable describes salary of the Employee
	 */
	private String designation;
	/*
	 * This variable describes designation of the Employee
	 */
	private String insuranceScheme;
	/*
	 * This variable describes insurance scheme of the Employee
	 */

	
	public Employee(String id, String name, int salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
			}
	/*
	 * This employee constructor is used to initialize attributes of Employee class
	 */
	
	
	/*
	 * Setters and getters for each Employee data member is described below
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

}
