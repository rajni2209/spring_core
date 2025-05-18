package com.springcore.expression;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mine {
	
	@Value("#{5+5}")
	private int x;
	@Value("#{10+10}")
	private int y;
	@Value("#{T (java.lang.Math).sqrt(144)}")
	private int z;
	@Value("#{T (java.lang.Math).PI}")
	private double a; 
	@Value("#{8>3}")
	private boolean isactive;

	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Mine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mine [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", isactive=" + isactive + "]";
	}
	
	
	
}
