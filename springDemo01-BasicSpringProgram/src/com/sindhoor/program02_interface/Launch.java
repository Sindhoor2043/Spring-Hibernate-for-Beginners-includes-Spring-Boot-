package com.sindhoor.program02_interface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		Student st = (Student) context.getBean("studentBean", University.class);
		
		// call the methods on bean
		System.out.println(st.displayInfo());
		
		// close the context
		context.close();
	}
}