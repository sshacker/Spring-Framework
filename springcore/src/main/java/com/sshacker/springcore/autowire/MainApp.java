package com.sshacker.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sshacker/springcore/autowire/autowireconfig.xml");
		Emp e1 = (Emp) context.getBean("emp");
		System.out.println(e1);
	}

}
