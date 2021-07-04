package com.component.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceAnnotationDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfigLoader.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(coach.getEmail());
		System.out.println(coach.getType());
		
		context.close();

	}

}
