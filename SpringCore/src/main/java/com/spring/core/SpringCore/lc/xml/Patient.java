package com.spring.core.SpringCore.lc.xml;

public class Patient {

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

}
