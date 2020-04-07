package com.jse.app;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		switchfind();
	}
	
	static void switchfind() {
		System.out.println("주민번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String ssn = scan.nextLine();
		
		System.out.println(String.format("주민번호 : %s", ssn));
		char ch = ssn.charAt(7);
		String result = "";
		
		switch (ch) {
		case '1':
		case '3':
			result = "남성"; // 1,3 
			break;
		case '2':
		case '4':
			result = "여성"; // 2,4
			break;
		case '5':
		case '6':
			result = "외국인"; // 5,6
			break;
		case '0':
		case '7':
		case '8':
		case '9':
			result = "잘못입력한 값"; // 0,7,8,9
			break;
		}
		System.out.println(result);
	}
	
	static void iffind() {
		System.out.println("주민번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String ssn = scan.nextLine();
		
		System.out.println(String.format("주민번호 : %s", ssn));
		char ch = ssn.charAt(7);
		String result = "";
		
		if (ch == '1' || ch == '3') {
			result = "남성"; // 1,3 
		}else if(ch == '2' || ch == '4') {
			result = "여성"; // 2,4
		}else if(ch == '5' || ch == '6') {
			result = "외국인"; // 2,4
		}else if(ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			result = "잘못입력한 값"; // 2,4
		}
		
		System.out.println(result);
	}

}
