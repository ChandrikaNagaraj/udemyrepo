package com.spring.core.SpringCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/spring/core/SpringCore/map/mapconfig.xml");
        Customer cust=(Customer) ctxt.getBean("customer");
        System.out.println(cust);
	}

}
