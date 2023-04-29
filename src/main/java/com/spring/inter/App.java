package com.spring.inter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        
    	
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/inter/config.xml");
    	
    	context.registerShutdownHook();
    	Student st=context.getBean("st",Student.class);
    	
    	System.out.println(st);
    	
    	
    	
    }
}
