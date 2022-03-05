package com.sshacker.durgesh.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sshacker/durgesh/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getVal());
		System.out.println(a.getObjB());
		System.out.println(a.getObjB().getNum());
	}

}
