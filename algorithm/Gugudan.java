package com.jse.algorithm;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 몇단을 출력할까요?");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
					System.out.print(j + " * " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}
}
