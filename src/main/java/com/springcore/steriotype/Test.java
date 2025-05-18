package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/steriotype/comconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		System.out.println(p.hashCode());//scope checking we have used prototype so every time hascode will get different for different bean
	}

}
