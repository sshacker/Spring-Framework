package com.sshacker.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price..");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void afterPropertySetInit() {
		System.out.println("inside init");
	}
	
	private void beforeDestroy() {
		System.out.println("inside destroy");
	}

}
