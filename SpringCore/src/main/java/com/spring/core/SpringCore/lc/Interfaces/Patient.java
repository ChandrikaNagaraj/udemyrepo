package com.spring.core.SpringCore.lc.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

	private int patientid;

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public void hi() {
		System.out.println("In the Init method");
	}

	public void bye() {
		System.out.println("This is from shutdown method");
	}

	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In the destroy method");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In the Initialize  method");

	}

}
