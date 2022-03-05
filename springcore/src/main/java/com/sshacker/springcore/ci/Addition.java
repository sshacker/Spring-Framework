package com.sshacker.springcore.ci;

public class Addition {
	private int a;
	private int b;

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor with double, double");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor with int, int");
	}

	public void add() {
		System.out.println("Sum : "+ (this.a + this.b));
	}
}
