package com.khushi.Springann;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(appconfig.class);
    	Samsung s7 = factory.getBean(Samsung.class);
    	s7.config();
    	
    	
    }
}
