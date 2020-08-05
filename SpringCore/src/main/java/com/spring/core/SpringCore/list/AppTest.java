package com.spring.core.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/spring/core/SpringCore/list/listconfig.xml");
        School sch=(School) ctxt.getBean("school");
        System.out.println(sch.getSchoolname());
        System.out.println(sch.getSubjects());
	}

}
