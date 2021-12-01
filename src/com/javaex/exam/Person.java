package com.javaex.exam;

public class Person {
	
	public String name;
	private int age;
	
	//
	public Person() {
		System.out.println("Person()");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	//메소드 g/s
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
