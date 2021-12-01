package com.javaex.ex;

public class Circle extends Shape{
	//필드
	private int radius;
	
	//생성자
	public Circle() {}
	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}
	//메소드
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드 일반.
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public void draw() {
		System.out.println("선색= "+super.getLineColor()+", 면색= "+super.getFillColor()+", 반지름= "+this.radius+"인 원을 그렸습니다.");
	}
	
	public double area(){
		double result = (radius*radius)*3.14;
		return result;
	}
	
	
}
