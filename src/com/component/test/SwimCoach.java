package com.component.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${swim.email}")
	private String email;
	@Value("${swim.type}")
	private String type;
	
	SwimCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String whatToDo() {
		
		return "SwimCoach : Go for Swiming";
	}

	@Override
	public String howIsLuck() {
		return "SwimCoach : "+fortuneService.provideFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getType() {
		return type;
	}
}
