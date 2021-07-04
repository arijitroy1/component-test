package com.component.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class BaseBallCoach implements Coach {

	//Field Injection 
	@Autowired
	@Qualifier("sadFortuneService")
	FortuneService fortuneService;
	@Override
	public String whatToDo() {
		// TODO Auto-generated method stub
		return "Play Baseball";
	}

	@Override
	public String howIsLuck() {
		// TODO Auto-generated method stub
		return fortuneService.provideFortune();
	}
}