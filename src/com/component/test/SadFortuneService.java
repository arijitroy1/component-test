package com.component.test;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String provideFortune() {
		// TODO Auto-generated method stub
		return "Today is not a happy day";
	}

}
