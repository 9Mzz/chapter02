package com.javaex.ex;

public class Shape {

	//필드
	private String lineColor;
	private String fillColor;
	//생성자
	public Shape() {}
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	//메소드
	public String getLineColor() {
		return lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	
}
