package com.javaex.ex01;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//메소드 정의
	//값 읽음
	public void setName(String n) {
		name = n;
	}
	//값 씀
	public String getName() {
		return name;
	}

	//setPrice / getPrice
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	//
	//showInfo
	public void showInfo() {
		System.out.println("상품명: "+name);
		System.out.println("가격: "+price);
		System.out.println("============");
	}
	


	
}
