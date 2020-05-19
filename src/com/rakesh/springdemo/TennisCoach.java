package com.rakesh.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fs;
	
	
	public TennisCoach() {
		System.out.println(">>Tennis Coach:: inside default Constructor");
	}


	//Constructor Injection
	/*public TennisCoach(FortuneService fs) {
		this.fs=fs;
	}*/
	
	//Setter Injection
	/*@Autowired
	public void setFs(FortuneService fs) {
		System.out.println(">>inside setter()");
		this.fs = fs;
	}
	*/

	//init method
	@PostConstruct
	public void doInitMethod() {
		System.out.println("Init() called");
	}
	
	
	//destroy method
	@PreDestroy
	public void doDestroyMethod() {
		System.out.println("destroy() called");
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practise shots for 20 Mins";
	}
	@Override
	public String getDailyFortune() {	
		return fs.getFortune();
	}

}
