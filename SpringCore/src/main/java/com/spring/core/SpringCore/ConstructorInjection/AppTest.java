package com.spring.core.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/core/SpringCore/ConstructorInjection/config.xml");
		Employee emplyee = (Employee) ctx.getBean("employee");
		System.out.println(emplyee);
	}
}