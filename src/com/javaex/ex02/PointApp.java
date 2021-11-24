package com.javaex.ex02;

public class PointApp {
	public static void main(String[] args) {

		Point p00 = new Point(); // point(0)
		p00.setx(3);
		p00.sety(6);
		p00.draw();

		Point p01 = new Point(100); // point(1)
		p01.draw();

		Point p02 = new Point(3, 6); // point(2)
		p02.draw();
		
		Point p03= new Point(55, 65);
		p03.draw(true);
		p03.draw(false);
		p03.draw();
	}
}

// Point 파일
// public point() {

// }

// pointApp파일
// Point p02 = new Point();
// p02.setx(3);
// p02.sety(6);
// p02.draw();

// point 파일
// public Point(int x, int y) {
// 해당클래스를 메모리에 올리는 일
// this.intx = x;
// this.inty = y;
// }

// pointApp 파일
// Point p01 = new Point(3, 6);
// p01.draw();