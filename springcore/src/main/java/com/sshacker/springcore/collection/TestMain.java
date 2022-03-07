package com.sshacker.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sshacker/springcore/collection/collectionconfig.xml");
		Emp e1 = (Emp) context.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getLogin());
		
		System.out.println(e1.getPhones().getClass().getName());
		System.out.println(e1.getAddresses().getClass().getName());
		System.out.println(e1.getCourses().getClass().getName());
		System.out.println(e1.getLogin().getClass().getName());
	}
}
