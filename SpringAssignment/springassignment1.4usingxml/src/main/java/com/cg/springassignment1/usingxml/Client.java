package com.cg.springassignment1.usingxml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class Client 
{
	private static List<Employee> emp;
	public static Employee getEmplyeeById(int empId)
	{    
		emp=new ArrayList<>();
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	        emp.add((Employee)ctx.getBean("employee"));

		for (Employee employee : emp) {
			if(employee.getEmpId()==empId)
			{
				return employee;
			}
			
		}
		return null;
	}
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
        System.out.print( "EmployeeID			:" );
        int id=sc.nextInt();
        Employee employ=getEmplyeeById(id);
        System.out.println(employ);
    }
}
