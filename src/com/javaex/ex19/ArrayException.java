package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = new int[] { 3, 6, 9 };

		try {
			System.out.println(intArray[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("finally 영역");
		}
	}
}
