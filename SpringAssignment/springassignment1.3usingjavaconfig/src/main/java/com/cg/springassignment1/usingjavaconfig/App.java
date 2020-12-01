package com.cg.springassignment1.usingjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);    
        SBU sbu=(SBU)ctx.getBean(SBU.class);
        System.out.println(sbu);
    }
}
