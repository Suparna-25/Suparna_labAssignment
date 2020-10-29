package com.cg.eis.service;

import com.cg.eis.bean.*;
import java.util.Scanner;

public class Services implements EmployeeService {

	@Override
	public Employee getEmployeeDetails() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		String id = sc.nextLine();
		System.out.println("Enter the employee name");
		String name = sc.nextLine();
		System.out.println("Enter the employee salary");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee designation");
		String designation = sc.nextLine();
		Employee emp = new Employee(id, name, salary, designation);
		return emp;
	}

	@Override
	public void findInsuranceScheme(Employee emp) {
		// TODO Auto-generated method stub
		if ((emp.getSalary()>=20000 && emp.getSalary()<30000) || (emp.getDesignation().equalsIgnoreCase("Analyst"))) {
			emp.setInsuranceScheme("A");
		} else if ((emp.getSalary()>=30000 && emp.getSalary()<50000) || (emp.getDesignation().equalsIgnoreCase("Project Leader"))) {
			emp.setInsuranceScheme("B");
		} else if ((emp.getSalary()>=50000 && emp.getSalary()<12370000) || (emp.getDesignation().equalsIgnoreCase("Manager"))) {
			emp.setInsuranceScheme("C");
		}
	}

	@Override
	public void display(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Employee's id: " + emp.getId());
		System.out.println("Employee's name: " + emp.getName());
		System.out.println("Employee's salary: " + emp.getSalary());
		System.out.println("Employee's designation: " + emp.getDesignation());
		System.out.println("Employee's insurance scheme: " + emp.getInsuranceScheme());
	}

}
