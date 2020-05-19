package com.rakesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoDriverApp {

	public static void main(String[] args) {
		
	//read Spring configuration-
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//get bean from container
	Coach theCoach=context.getBean("tennisCoach",Coach.class);
	
	//call a method on the bean
	System.out.println(theCoach.getDailyWorkout());
	
	//call method get daily fortune
	System.out.println(theCoach.getDailyFortune());
	
	//close the context
	context.close();
	}

}
