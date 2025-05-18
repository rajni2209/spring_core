package com.springcore.steriotype;

import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component         // here we can create a custom object by @component("ob")
@Scope("prototype")
public class Person {
	
	@Value("#{frinds}")
	private List<String> name;
	
	@Value("12")
	private int id;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}


}
