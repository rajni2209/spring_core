package com.springcore.ci;

import java.util.*;
public class Person {
	private int id;
	private String name;
	private List<String> subject;
	
	public Person(int id, String name , List<String> subject) {
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return this.id + ":" + this.name + " : " + this.subject;
	}
	
	
	
	
}
