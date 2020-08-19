package com.spring.advanced.collection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/advanced/collection/list/listconfig.xml");
		ProductsList plist = (ProductsList) ctx.getBean("productsList");
		System.out.println(plist);
	}
}