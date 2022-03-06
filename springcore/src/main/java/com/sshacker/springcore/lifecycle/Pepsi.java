package com.sshacker.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Pepsi Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside afterPropertiesSet : Pepsi");
		
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy : Pepsi");
		
	}
	
}
