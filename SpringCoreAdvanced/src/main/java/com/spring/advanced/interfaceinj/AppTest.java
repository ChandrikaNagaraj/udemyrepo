package com.spring.advanced.interfaceinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/advanced/interfaceinj/Config.xml");
		OrderBO bod = (OrderBO) ctx.getBean("blogic");
		System.out.println(bod);

	}
}