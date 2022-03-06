package com.sshacker.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sshacker/springcore/autowire/annotation/annoautowireconfig.xml");
		Emp e1 = (Emp) context.getBean("emp");
		System.out.println(e1);
	}

}
