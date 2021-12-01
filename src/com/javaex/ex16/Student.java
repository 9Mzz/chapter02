package com.javaex.ex16;

public class Student extends Person {

	private String SchoolName;

	// 생성자
	public Student() {
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		SchoolName = schoolName;
	}

	// 메소드
	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Student [SchoolName=" + SchoolName + ", name=" + name + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.println("***********************************");
		System.out.println("이름: " + name + ", 나이: " + age);
		System.out.println("***********************************");	
	}

}
