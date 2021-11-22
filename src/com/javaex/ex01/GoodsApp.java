package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(4000000);
		computer.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
		
		
//		String cameraName = camera.getName();
//		int cameraPrice = camera.getPrice();
//
//		
//		System.out.println(cameraName);
//		System.out.println(cameraPrice);

//		camera.name="니콘";
//		camera.price=400000;
//		
//		Goods computer = new Goods();
//		
//		computer.name="LG그램";
//		computer.price=500000;
//		
//		Goods cup = new Goods();
//		cup.name="머그컵";
//		cup.price=2000;
//		
//		Goods exp = new Goods();
//
//
//		
//		System.out.println(camera.name);
//		System.out.println(camera.price);
//		System.out.println("==================");
//		
//		System.out.println(computer.name);
//		System.out.println(computer.price);
//		System.out.println("==================");
//		
//		System.out.println(cup.name);
//		System.out.println(cup.price);
//		
	}

}
