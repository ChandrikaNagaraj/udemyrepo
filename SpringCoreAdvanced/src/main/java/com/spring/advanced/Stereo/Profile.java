package com.spring.advanced.Stereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Profile {
	@Value("Sri")
	private String name;
	@Value("Java")
	private String specilization;
	

	@Override
	public String toString() {
		return "Profile [name=" + name + ", specilization=" + specilization + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

}
