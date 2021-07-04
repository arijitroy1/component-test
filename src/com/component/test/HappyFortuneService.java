package com.component.test;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String provideFortune() {
		return "You will have a great day ahead";
	}
}