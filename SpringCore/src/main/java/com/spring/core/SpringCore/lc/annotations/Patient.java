package com.spring.core.SpringCore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int patientid;

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
@PostConstruct
	public void hi() {
		System.out.println("In the Init method");
	}

@PreDestroy
	public void bye() {
		System.out.println("This is from shutdown method");
	}

	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + "]";
	}

	

}
