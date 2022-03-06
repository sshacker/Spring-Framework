package com.sshacker.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside setter : Emp");
		this.address = address;
	}
	
	public Emp() {
		super();
		System.out.println("inside Emp default constructor");
	}

	// @Autowire for constructor
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside Emp parameterized constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
