package com.component.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach1 = appContext.getBean("baseBallCoach", Coach.class);
		Coach coach2 = appContext.getBean("baseBallCoach", Coach.class);
		System.out.println("Checking BaseBallCoach");
		findBeanType(coach1, coach2);
		
		Coach coach3 = appContext.getBean("cricket", Coach.class);
		Coach coach4 = appContext.getBean("cricket", Coach.class);
		System.out.println("Checking CricketCoach");
		findBeanType(coach3, coach4);
				
		appContext.close();
	}

	private static void findBeanType(Coach coach1, Coach coach2) {
		if(coach1==coach2) {
			System.out.println("They are same, so singleton");
		}else {
			System.out.println("They are different, so prototype");
		}
	}

}
