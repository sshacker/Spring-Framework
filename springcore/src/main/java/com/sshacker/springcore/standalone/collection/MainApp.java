package com.sshacker.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sshacker.springcore.ci.Person;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sshacker/springcore/standalone/collection/standalonecollectionconfig.xml");
		People p1 = context.getBean("people1", People.class);
		
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		
		System.out.println(p1.getFeeStructures());
		System.out.println(p1.getFeeStructures().getClass().getName());
		
		System.out.println(p1.getDbConfigs());
		System.out.println(p1.getDbConfigs().getClass().getName());
		
		System.out.println(p1.getColors());
		System.out.println(p1.getColors().getClass().getName());
	}
}
