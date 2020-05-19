package com.rakesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoDriver {

	public static void main(String[] args) {

		//load Spring config
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach thecoach=context.getBean("tennisCoach",Coach.class);
		
		Coach theAlphacoach=context.getBean("tennisCoach",Coach.class);
		
		boolean res=(thecoach==theAlphacoach);
		
		System.out.println(res);
		System.out.println(thecoach);
		System.out.println(theAlphacoach);
		
		context.close();
		
		

	}

}
