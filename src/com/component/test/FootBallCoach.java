package com.component.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Bean name will be FootBallCoach which is default
@Component
public class FootBallCoach implements Coach {

	FortuneService fortuneService;
	
	//Method injection, the name of the method can be anything
	@Autowired
	public void setFortuneService(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String whatToDo() {
		return "Play FootBall";
	}

	@Override
	public String howIsLuck() {
		// TODO Auto-generated method stub
		return fortuneService.provideFortune();
	}

}
