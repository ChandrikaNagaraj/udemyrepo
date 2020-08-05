package com.spring.core.SpringCore.Placeholder;

public class MyDao {
	
	private String dbserver;
	
	MyDao(String dbserver) {
		this.dbserver= dbserver;
	}

	@Override
	public String toString() {
		return "MyDao [dbserver=" + dbserver + "]";
	}

}
