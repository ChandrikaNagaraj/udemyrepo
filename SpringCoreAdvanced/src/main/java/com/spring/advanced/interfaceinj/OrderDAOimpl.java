package com.spring.advanced.interfaceinj;

import org.springframework.stereotype.Component;

@Component("dologic")
public class OrderDAOimpl implements OrderDAO {

public void placeOrder() {
		System.out.println("Placed Order Successfully");
	}

@Override
public String toString() {
	return "OrderDAOimpl []";
}

}
