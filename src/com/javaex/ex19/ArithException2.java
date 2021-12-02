package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {
	
	private double num;

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
		result = 100/num;					//ArithmeticException 발생
		System.out.println(result);
		}catch(ArithmeticException e) {		//catch 발생
			System.out.println("catch영역");
		}finally {
			System.out.println("finally 영역");
		}
		
		sc.close();
	}
	
}
