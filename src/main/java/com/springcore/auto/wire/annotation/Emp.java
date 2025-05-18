package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired						// we can use autowire annotation with prpperty.setter,constructor
	@Qualifier("address2")						// qualifier used when we have 2 or more bean with same class
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//@autowire
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	//@autowire
	public Emp(Address address) {
		super();
		this.address = address;
	}

	
	
}
