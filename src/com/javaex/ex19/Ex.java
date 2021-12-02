package com.javaex.ex19;

import java.util.Scanner;

public class Ex {

	private double num;
	
	public static void main(String[] args) {
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			result = 100/num;				//
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}finally {
			//예외상황 유무 관계없이 처리됨
			System.out.println("finally 영역");
		}
		
		
		
		sc.close();
	}
	
}
