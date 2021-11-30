package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s01 = new Shape("빨강", "빨강");
		System.out.println(s01.toString());
		System.out.println("-----------------------");

		Rectangle r01 = new Rectangle("빨강", "빨강", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "노랑", 10, 5);
		Rectangle r03 = new Rectangle("파랑", "파랑", 10, 10);

		Rectangle[] rArray = new Rectangle[3];

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		

	}

}
