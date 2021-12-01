package com.javaex.exam;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person();
		p01.name="구민석";
		p01.setAge(25);
		
		System.out.println(p01.toString());
		
		Person p02 = new Person("구민석1", 25);
		System.out.println(p02.toString());
		
		Person p03 = new Person("강호동", 45);
		System.out.println(p03.toString());
		
		p03.setAge(50);
		System.out.println(p03.toString());
		
		//
		
		Student s01 = new Student("이효리", 30, "제주고등학교");
		s01.toString();
	}
}
