package com.component.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Here the default name 'CricketCoach' will not be used, bean name will be 'cricket'
@Component("cricket")
public class CricketCoach implements Coach {
	
	FortuneService fortuneService;
	
	//inject properties file
	@Value("${game.type}")
	private String gameType;

	//Constructor injection 
	@Autowired
	CricketCoach(@Qualifier("happyFortuneService") FortuneService fortuneService){
		System.out.println("Cricket : Constructor call is happening");
		this.fortuneService=fortuneService;
	}
	
	@PostConstruct
	public void constructionAfterBeanCreation() {
		System.out.println("Cricket : Post construct is getting invoked");
	}
	
	//This is invoked during appContext.close()
	@PreDestroy
	public void workBeforeDestruction() {
		System.out.println("Cricket : Calling before the destruction of the Bean");
	}
	
	@Override
	public String whatToDo() {
		return "Play "+gameType;
	}

	@Override
	public String howIsLuck() {
		return fortuneService.provideFortune();
	}
}
