package com.spring.advanced.collection.list;

import java.util.List;

public class ProductsList {
	private List<String> productname;

	public List<String> getProductname() {
		return productname;
	}

	public void setProductname(List<String> productname) {
		this.productname = productname;
	}

	@Override
	public String toString() {
		return "ProductsList [productname=" + productname + "]";
	}


	
}
