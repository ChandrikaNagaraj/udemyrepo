package com.spring.advanced.Stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
public class Faculty {
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	//@Value("#{new Integer(20)}")
	private int id;
	@Value("#{new java.lang.String('Nagaraj Chandrika').toUpperCase()}")
	private String name;

	@Value("#{subjects}")
	private List<String> subjects;

	@Value("#{2+4<8?true:false}")
	private boolean status;

	
	@Autowired
	private Profile profile;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", subjects=" + subjects + ", status=" + status + ", profile="
				+ profile + "]";
	}



}
