package com.springcore;

public class Student {
	private int stdid;
	private String name;
	private String address;
	public int getStdid() {
		return stdid;
	}
	
	
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public Student(int stdid, String name, String address) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.address = address;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
