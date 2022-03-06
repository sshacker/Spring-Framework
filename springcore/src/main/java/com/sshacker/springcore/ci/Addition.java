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

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor with String, String");
	}
	
	public void add() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Sum : "+ (this.a + this.b));
	}
}
