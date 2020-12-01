package com.cg.springassignment1.usingxmlannotation;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		SBU sbu=(SBU)ctx.getBean("sbu");
		System.out.println(sbu);
    }
}
