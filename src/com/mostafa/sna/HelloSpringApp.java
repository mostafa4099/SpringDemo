package com.mostafa.sna;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
//		load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve bean from the container
		Coach coach = context.getBean("myTrackCoach", Coach.class);
		
//		Singleton bean. Same object reference.
//		Coach coach2 = context.getBean("myTrackCoach", Coach.class);
//		if (coach == coach2) {
//			System.out.println("Same Bean");
//		} else {
//			System.out.println("Different Bean");
//		}
		
//		use the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		
//		close the context
		context.close();
	}

}
