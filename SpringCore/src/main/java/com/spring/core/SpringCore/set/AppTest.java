package com.spring.core.SpringCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/spring/core/SpringCore/set/setconfig.xml");
        CarDealer carDealer=(CarDealer) ctxt.getBean("car");
        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModel());
	}

}
