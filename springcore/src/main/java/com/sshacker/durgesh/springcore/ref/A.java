package com.sshacker.durgesh.springcore.ref;

public class A {
	private int val;
	private B objB;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public B getObjB() {
		return objB;
	}

	public void setObjB(B objB) {
		this.objB = objB;
	}

	public A(int val, B objB) {
		super();
		this.val = val;
		this.objB = objB;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [val=" + val + ", objB=" + objB + "]";
	}

}
