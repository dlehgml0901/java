package com.jse.inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("0.Exit, 1.Go");
			switch (scan.nextInt()) {
			case 0: return;
			case 1:
				System.out.println("Go");
				break;
			}
		}
	}
}
