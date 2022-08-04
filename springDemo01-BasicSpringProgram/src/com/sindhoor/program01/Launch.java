package com.sindhoor.program01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		Employee emp = (Employee) context.getBean("employeeBean");
		
		// call the methods on bean
		emp.displayInfo();
		
		// close the context
		context.close();
	}
}