package com.spring.core.SpringCore.DependencyCheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Student {

	private int rollno;
	private String name;
	private List<String> subjects;

	public int getRollno() {
		return rollno;
	}

	@Required
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", subjects=" + subjects + "]";
	}
}
