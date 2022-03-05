package com.sshacker.durgesh.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sshacker/durgesh/springcore/ci/ciconfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
