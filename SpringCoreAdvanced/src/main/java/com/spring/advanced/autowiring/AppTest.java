package com.spring.advanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/advanced/autowiring/config.xml");
		Employee emplyee = (Employee) ctx.getBean("employee");
		System.out.println(emplyee);
	}
}