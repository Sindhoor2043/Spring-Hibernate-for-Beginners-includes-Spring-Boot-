package com.sindhoor.ex01_ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ex01.xml");
		Coach theCoach = context.getBean("myCoachBean", Coach.class);
		
		System.out.println(theCoach.getBaseballInfo());
		System.out.println(theCoach.getCricketInfo());
		
		System.out.println("\nFortune Service:- " + theCoach.getDailyFortune());
		context.close();
	}
}