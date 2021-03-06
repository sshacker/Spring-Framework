package com.sshacker.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// to call init-method no special thing
		// need to be changes in code
		// But to call destroy-method we need to
		// enable/register pre-shutdown hook on context
		// for this we need to use AbstractApplicationContext interface

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sshacker/springcore/lifecycle/lifecycleconfig.xml");
		context.registerShutdownHook();

//		Samosa samosa = (Samosa) context.getBean("s1");
//		System.out.println(samosa);
//		
//		Pepsi pepsi = (Pepsi) context.getBean("p1");
//		System.out.println(pepsi);
		
		Example example = (Example) context.getBean("e1");
		System.out.println(example);

	}
}
