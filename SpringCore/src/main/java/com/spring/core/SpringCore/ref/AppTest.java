package com.spring.core.SpringCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/spring/core/SpringCore/ref/config.xml");
		Student std=(Student) ctxt.getBean("student");
		System.out.println(std);
	}

}
