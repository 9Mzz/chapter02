package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {

	private double num;

	public static void main(String[] args) {

		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();

		if (num != 0) {
			result = 100 / num;
			System.out.println(result);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");

		}

		sc.close();
	}

}
