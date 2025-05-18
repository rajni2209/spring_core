package com.springcore;
import java.util.*;
public class StudentA {
	Set<Integer> stdid;
	List<String> name;
	List<String> address;
	public Set<Integer> getStdid() {
		return stdid;
	}
	public void setStdid(Set<Integer> stdid) {
		this.stdid = stdid;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public StudentA(Set<Integer> stdid, List<String> name, List<String> address) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.address = address;
	}
	public StudentA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentA [stdid=" + stdid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
