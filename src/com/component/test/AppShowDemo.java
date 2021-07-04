package com.component.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Arijit Roy
 *
 */
public class AppShowDemo {
	


	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = appContext.getBean("cricket", Coach.class);
		System.out.println(coach.whatToDo());
		System.out.println(coach.howIsLuck());
		
		coach = appContext.getBean("footBallCoach", Coach.class);
		System.out.println(coach.whatToDo());
		System.out.println(coach.howIsLuck());
		
		coach = appContext.getBean("baseBallCoach", Coach.class);
		System.out.println(coach.whatToDo());
		System.out.println(coach.howIsLuck());
		
		appContext.close();
	}

}
