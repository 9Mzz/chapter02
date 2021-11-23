package com.javaex.ex03;

public class Abc {

	private String a1;
	private int b1;
	private double c1;
	
	public void set_a1(String a) {
		a1 = a;
	}
	public String get_a1() {
		return a1;
	}
	public void set_b1(int b) {
		b1 = b;
	}
	public int get_b1() {
		return b1;
	}
	public void set_c1(double c) {
		c1 = c;
	}
	public double get_c1() {
		return c1;
	}
	
	public void set_info() {
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println("--------------");
	}
	
}
