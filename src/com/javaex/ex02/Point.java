package com.javaex.ex02;

public class Point {

	// 필드!!
	private int intx; // 7
	private int inty; // 7

	// 생성자
//	public Point() {
//		//해당클래스를 메모리에 올리는 일
//		System.out.println();
//	}
	public Point() {
		// 해당클래스를 메모리에 올리는 일
		System.out.println("Point()");
	}

	public Point(int x) {
		// 해당클래스를 메모리에 올리는 일
		this.intx = x;
		System.out.println("Point(1)");
	}

	public Point(int x, int y) {
		// 해당클래스를 메모리에 올리는 일
		this.intx = x;
		this.inty = y;
		System.out.println("Point(2)");
	}

	//
	public void setx(int x) {
		if (x >= 0) {
			this.intx = x;
		} else {
			this.intx = 0;
		}
	}

	public int getx() {
		if (intx < 0) {
			return 0;
		} else {
			return intx;
		}
	}

	//
	public void sety(int y) {
		inty = y;
	}

	public int gety() {
		return inty;
	}

	//
	public void draw() {
		System.out.println("점[x=" + intx + ", y=" + inty + "]를 그렸습니다.");
		System.out.println("---------------------------------");
	}

	@Override
	public String toString() {
		return "Point [intx=" + intx + ", inty=" + inty + "]";
	}

}
