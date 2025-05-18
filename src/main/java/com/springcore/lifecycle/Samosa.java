
// bean life cycle using init and destroy


package com.springcore.lifecycle;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("initicating");
	}
	
	public void destroy() {
		System.out.println("predestroying");
	}
	
	
	
/*  
 
  **Using Programmatic Approach (Interface)**
To provide the facility to the created bean to invoke custom init() method on the startup of a spring container and to invoke the custom destroy() method on closing the container, we need to implement our bean with two interfaces.

In this approach, we implement the ***  InitializingBean and DisposableBean *** interfaces and override their methods afterPropertiesSet() and destroy() method is invoked just after the container is closed.

Note: To invoke destroy method we have to call a close() method of ConfigurableApplicationContext.
 
 */
	
	
}
