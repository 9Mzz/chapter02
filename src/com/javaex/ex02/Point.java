package com.javaex.ex02;

public class Point {
	
	//필드!!
	private int intx;
	private int inty;
	
	//
	public void setx(int x) {
		intx = x;
	}
	public int getx() {
		return intx;
	}
	//
	public void sety(int y) {
		inty = y;
	}
	public int gety() {
		return inty;
	}
	//
	public void setinfo() {
		System.out.println("점[x="+intx+", y="+inty+"]를 그렸습니다.");
		System.out.println("---------------------------------");
	}
	
	
	
	
	
}
