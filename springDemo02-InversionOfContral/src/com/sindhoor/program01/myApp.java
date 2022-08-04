package com.sindhoor.program01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoachBean", Coach.class);
		System.out.println(theCoach.getBaseballInfo());
		System.out.println(theCoach.getCricketInfo());
		context.close();
	}
}