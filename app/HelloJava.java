package com.jse.app;

import java.util.Scanner;

public class HelloJava {
	//예약어, 기능어	   method        파라미터
	public static void main(String[] args) {
				//인스턴스 변수, 로컬 변수
		Scanner scanner = new Scanner(System.in);
										//클래스 변수
		//클래스 변수
		System.out.println("이름이 뭐에요?");
		       //인스턴스 변수   //인스턴스 메소드
		String name = scanner.nextLine();
		System.out.println("안녕하세요 " + name + "씨.");
		
		System.out.println("어디 사세요?");
		String x = scanner.nextLine();
		System.out.println("아~ " + x + "사시는군요.");
		
		System.out.println("몇살이에요?");
		int y = scanner.nextInt();
		System.out.println("아~ " + y + "살이네요.");
		
		System.out.println("키는 몇 cm이고, 몸무게는 몇 kg 인가요?");
		float a = scanner.nextFloat();
		double b = scanner.nextDouble();
		System.out.println("키 = " + a + "cm 몸무게 = " + b + "kg");
		
		System.out.println("혈액형이 뭐에요?");
		char c = scanner.next().charAt(0);
		System.out.println("혈액형 = " + c);

	}
}
