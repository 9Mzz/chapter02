package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

//		Point p01 = new Point(5,7);
//		Drawable p02 = new Point(114, 117);
//		p02.draw();
		//다운캐스팅 해서 사용하면 됨 		((Point)p02).getX()

//		System.out.println(((Point)p02).getX());
//		r01.draw();
//		System.out.println(((Rectangle)r01).getWidth());
//		System.out.println(((Rectangle)r01).getFillColor());
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable p01 = new Point(1,1);
		Drawable r01 = new Rectangle("빨강", "빨강", 5, 7);
		Drawable c01 = new Circle("파랑", "파랑", 12);
		Drawable t01 = new Triangle("노랑", "노랑", 22, 55);
		
		dArray[0]=r01;
		dArray[1]=c01;
		dArray[2]=t01;
		dArray[3]=p01;
		
		for( int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) { //지금주소의 인스턴스 Shape에서 만들어졌니??
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
		
		
		
	}
}