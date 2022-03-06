package com.sshacker.springcore.autowire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Emp() {
		super();
		System.out.println("inside Emp default constructor");
	}

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
