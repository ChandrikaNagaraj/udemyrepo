package com.spring.core.SpringCore.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/core/SpringCore/InnerBeans/config.xml");
		Employee  emplyee = (Employee) ctx.getBean("employee");
		System.out.println(emplyee.hashCode());
		Employee  emplyee2 = (Employee) ctx.getBean("employee");
		System.out.println(emplyee2.hashCode());
		
	}

}
