package com.javaex.ex15;

public class Circle extends Shape{
	
	private int Radius;
	
	//
	public Circle() {
	}
	public Circle(String lineColor, String fillColor, int Radius) {
		super(lineColor, fillColor);
		this.Radius = Radius;
	}
	//
	public int getRadius() {
		return Radius;
	}
	public void setRadius(int round) {
		this.Radius = round;
	}
	//
	@Override
	public String toString() {
		return "Circle [round=" + Radius + "]";
	}
	
	
	

}
