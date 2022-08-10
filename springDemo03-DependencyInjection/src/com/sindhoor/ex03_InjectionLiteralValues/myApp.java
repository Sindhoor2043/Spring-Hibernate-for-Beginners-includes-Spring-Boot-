package com.sindhoor.ex03_InjectionLiteralValues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ex03.xml");
		Coach theCoach = context.getBean("myCoachBean", Coach.class);
		System.out.println("\n" + theCoach.getTrackInfo());
		System.out.println("\n" + theCoach.getDailyFortune());
		// call our new methods to get the literal values
		System.out.println("\nFrom The Literal Value:-\n" + theCoach.getMailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
	}
}