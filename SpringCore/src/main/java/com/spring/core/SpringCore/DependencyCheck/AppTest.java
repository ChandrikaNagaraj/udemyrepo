package com.spring.core.SpringCore.DependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/core/SpringCore/DependencyCheck/config.xml");
		Student pt = (Student) ctx.getBean("student");
		System.out.println(pt);
	}

}
