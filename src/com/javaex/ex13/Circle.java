package com.javaex.ex13;

public class Circle {

	// 필드
	private String lineColor;
	private String fillcolor;
	private int radius;

	// 생성자
	public Circle() {
	}

	public Circle(String lineColor, String fillcolor, int radius) {
		super();
		this.lineColor = lineColor;
		this.fillcolor = fillcolor;
		this.radius = radius;
	}

	// 메소드 g/s
	public String getLineColor() {
		return lineColor;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	public int getRadius() {
		return radius;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillcolor=" + fillcolor + ", radius=" + radius + "]";
	}

	public void draw() {
		System.out.println("선색: " + lineColor + "면색: " + fillcolor + "반지름: " + radius);
	}

}
