package com.spring.advanced.interfaceinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("blogic")
public class OrderBOimpl implements OrderBO {

	@Autowired
	OrderDAOimpl orderdao;

	public OrderDAOimpl getOrderdao() {
		return orderdao;
	}

	public void setOrderdao(OrderDAOimpl orderdao) {
		this.orderdao = orderdao;
	}

	@Override
	public void orderbooking() {
		System.out.println("Inside Order Booking");
		orderdao.placeOrder();
	}

	@Override
	public String toString() {
		return "OrderBOimpl [orderdao=" + orderdao + "]";
	}

}
