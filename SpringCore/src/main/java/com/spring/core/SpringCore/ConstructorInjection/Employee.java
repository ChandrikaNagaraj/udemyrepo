package com.spring.core.SpringCore.ConstructorInjection;

public class Employee {
	private int empid;
	private Address address;

	public Employee(int empid, Address address) {
		this.empid = empid;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", address=" + address + "]";
	}
}
