package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

//		Rectangle r01 = new Rectangle("빨강", "빨강", 5, 10);
//		System.out.println(r01.area());
//		r01.draw();
//		
//		Circle c01 = new Circle("파랑", "파랑", 5);
//		System.out.println(c01.area());
//		c01.draw();
//		
//		Triangle t01 = new Triangle("빨강", "노랑", 5, 10);
//		System.out.println(t01.area());
//		t01.draw();

		// 배경을 만든다shape[] --> 모든 도형을 1개의 배열로 관리.
		Shape[] sArray = new Shape[3];

		// 메모리에 도형을 만든다
		Shape r02 = new Rectangle("빨강", "파랑", 5, 10);
		Shape c02 = new Circle("파랑", "파랑", 5);
		Shape t02 = new Triangle("빨강", "노랑", 5, 10);

		// 메모리에 도형을 담는다.
		sArray[0] = r02;
		sArray[1] = c02;
		sArray[2] = t02;

		// 모든 도형의 면적 구하기
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}

	}
}