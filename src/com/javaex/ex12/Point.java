package com.javaex.ex12;

public class Point {
	
	//메인
	private String name;
	private String number;
	private String Systemname;

	
	//생성자
	public Point() {	
	}
	
	public Point(String name, String number, String systemname) {
		super();
		this.name = name;
		this.number = number;
		this.Systemname = systemname;
	}
	
	//메소드g/s
	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getSystemname() {
		return Systemname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setSystemname(String systemname) {
		Systemname = systemname;
	}
	//메소드일반
	@Override
	public String toString() {
		return "Point [name=" + name + ", number=" + number + ", Systemname=" + Systemname + "]";
	}
	
	public void showInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("숫자 : "+this.number);
		System.out.println("시스템이름: "+this.Systemname);
		
		
	}
	
	

}
