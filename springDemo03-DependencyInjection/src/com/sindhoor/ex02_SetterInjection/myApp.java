package com.sindhoor.ex02_SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ex02.xml");
		Coach theCoach = context.getBean("myCoachBean", Coach.class);
		System.out.println("\n" + theCoach.getTrackInfo());
		System.out.println("\n" + theCoach.getDailyFortune());
		context.close();
	}
}