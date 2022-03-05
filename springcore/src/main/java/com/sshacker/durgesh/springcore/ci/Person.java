package com.sshacker.durgesh.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certificate;
	private List<String> items;

	public Person(String name, int personId, Certificate certificate, List<String> items) {
		this.name = name;
		this.personId = personId;
		this.certificate = certificate;
		this.items = items;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + " : " + this.certificate.name + " : " + this.items;
	}

}
