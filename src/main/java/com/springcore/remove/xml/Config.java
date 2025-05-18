package com.springcore.remove.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = " com.springcore.remove.xml ")
public class Config {
	
	@Bean(name = {"rajni" , "mani"})  // here we can also change the name also id we needed 
	public Student getStudent() {
		Student student = new Student();
		return student;
		
	}
}
