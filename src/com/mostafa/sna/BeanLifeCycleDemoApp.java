package com.mostafa.sna;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach coach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		context.close();

	}

}
