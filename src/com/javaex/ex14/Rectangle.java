package com.javaex.ex14;

public class Rectangle extends Shape {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	//
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//부모쪽에도 같은 메소드가 있다
	
	// 부모쪽의 메소드 사용 못하게 할려고 같은 이름으로 "재정의"
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + "]";
	}
	public void draw() {
		System.out.println("선색: "+lineColor+ ", 면색: "+super.fillColor+", 가로: "+width+", 세로: "+height+" 을 그렸습니다.");
		System.out.println("-------------------------------------------------------");
	}
	
}
