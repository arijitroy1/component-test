package com.component.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigThoroughJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfigLoader.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		System.out.println(coach.whatToDo());
		System.out.println(coach.howIsLuck());
		
		context.close();
	}
}