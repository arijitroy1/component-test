package com.component.test;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortuneMessage={"Don't worry, be happy",
			"Seek uncomfort",
			"Be kind and help others"};
	
	Random random = new Random();
	
	@Override
	public String provideFortune() {
		// TODO Auto-generated method stub
		return fortuneMessage[random.nextInt(fortuneMessage.length)];
	}

}
