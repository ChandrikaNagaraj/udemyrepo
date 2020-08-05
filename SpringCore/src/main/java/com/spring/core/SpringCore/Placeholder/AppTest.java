package com.spring.core.SpringCore.Placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/spring/core/SpringCore/Placeholder/config.xml");
		MyDao mydao = (MyDao) ctxt.getBean("mydao");
		System.out.println(mydao);
	}

}
