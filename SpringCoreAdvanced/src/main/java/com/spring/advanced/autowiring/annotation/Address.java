package com.spring.advanced.autowiring.annotation;

public class Address {
	private String hno;
	private String city;
	private String pincode;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
