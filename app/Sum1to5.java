package com.jse.app;

public class Sum1to5 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("합은 = " + sum);
	}

}
