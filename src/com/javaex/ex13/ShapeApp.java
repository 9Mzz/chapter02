package com.javaex.ex13;

public class ShapeApp {
	public static void main(String[] args) {

		// 메모리가 움직이는 스토리
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03 = new Rectangle("빨강", "빨강", 55, 77);

		// 사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];

		// 사각형을 배열에 넣는다(주소)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		// 모두 그리기
		for (int i = 0; i < rArray.length; i++) {
			System.out.println(rArray[i]);
			rArray[i].draw();
			System.out.println("-----------------");
		}

		// 모든 사각형에 선색만 출력
		Rectangle[] lineA = new Rectangle[3];
		for (int i = 0; i < rArray.length; i++) {
			System.out.println(rArray[i].getLinecolor());
		}
		System.out.println("-------------------------------");
		/////////////////////////////////////////////
		// 원을 관리할 배열
		Circle[] cArray = new Circle[3];

		// 원(c01)을 배열에 넣기

		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("검정", "노랑", 15);
		Circle c03 = new Circle("파랑", "초록", 15);

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		// 원을 배열에 넣기
		for (int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);
			cArray[1].draw();
		}
		System.out.println("-------------------------------");
		//////////////////////////////////////////

		Triangle[] tArray = new Triangle[4];

		////////////////////////////////////
		Triangle t00 = new Triangle("파랑", "초록", 15, 20);
		Triangle t01 = new Triangle("빨강", "검정", 20, 10);
		Triangle t02 = new Triangle("초록", "파랑", 30, 30);
		Triangle t03 = new Triangle("노랑", "초록", 40, 40);

		tArray[0] = t00;
		tArray[1] = t01;
		tArray[2] = t02;
		tArray[3] = t03;

		for (int i = 0; i < tArray.length; i++) {
			System.out.println(tArray[i]);
		}
		System.out.println("-------------------------------");
		////////////////////////////////////////////////////////

		
		

	}
}
