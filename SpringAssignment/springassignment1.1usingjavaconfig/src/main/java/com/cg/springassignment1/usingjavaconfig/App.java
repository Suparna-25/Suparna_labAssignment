package com.cg.springassignment1.usingjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);    
        Employee employee = ctx.getBean(Employee.class);
        employee.setEmployeeId(12345);
        employee.setEmployeeName("Harriet");
        employee.setSalary(40000.0);
        employee.setBusinessUnit("PES-BU");
        employee.setAge(30);
        System.out.println("Employee Details");
        System.out.println("-------------------------------------");
        System.out.println("Employee ID :"+employee.getEmployeeId());
        System.out.println("Employee Name :"+employee.getEmployeeName());
        System.out.println("Employee Salary :"+employee.getSalary());
        System.out.println("Employee BU :"+employee.getBusinessUnit());
        System.out.println("Employee Age :"+employee.getAge());
    }
}
