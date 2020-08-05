package com.spring.core.SpringCore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/core/SpringCore/lc/annotations/config.xml");
		Patient pt = (Patient) ctx.getBean("patient");
		System.out.println(pt);
		ctx.registerShutdownHook();
	}

}
