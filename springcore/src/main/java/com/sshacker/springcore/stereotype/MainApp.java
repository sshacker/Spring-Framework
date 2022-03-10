package com.sshacker.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sshacker/springcore/stereotype/stereotyepconfig.xml");
		Student s1 = (Student) context.getBean("student1", Student.class);
		System.out.println(s1);
	}
}
