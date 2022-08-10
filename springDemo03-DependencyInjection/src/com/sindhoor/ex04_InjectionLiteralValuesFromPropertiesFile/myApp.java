package com.sindhoor.ex04_InjectionLiteralValuesFromPropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ex04.xml");
		Coach theCoach = context.getBean("myCoachBean", Coach.class);
		System.out.println("\n" + theCoach.getTrackInfo());
		System.out.println("\n" + theCoach.getDailyFortune());
		// call our new methods to get the literal values from properties file
		System.out.println("\nFrom The Literal Value --> properties file:-\n" + theCoach.getMailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
	}
}