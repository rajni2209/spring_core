package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
//		
//		Pepsi p = (Pepsi) context.getBean("pepsi");
//		System.out.println(p);
//		
		Example e = (Example) context.getBean("example");
		System.out.println(e);
		
		context.registerShutdownHook();

	}

}
