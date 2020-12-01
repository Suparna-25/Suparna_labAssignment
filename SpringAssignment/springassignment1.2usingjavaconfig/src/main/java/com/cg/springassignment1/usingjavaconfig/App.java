package com.cg.springassignment1.usingjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);    
        Employee employee = ctx.getBean(Employee.class);
        employee.setEmployeeId(12345);
        employee.setEmployeeName("Harriet");
        employee.setSalary(40000.0);
        SBU sbu=ctx.getBean(SBU.class);
        sbu.setSbuCode("PES-BU");
        sbu.setSbuName("Product Engineering Services");
        sbu.setSbuHead("Kiran Rao");
        System.out.println(employee);
    }
}
