package com.spring.advanced.Stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/advanced/Stereo/Config.xml");
		Faculty flist = (Faculty) ctx.getBean("faculty");
		System.out.println(flist);
		
		}
}