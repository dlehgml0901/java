package com.jse.app;

public class Calculator {
	private int num1;
	private int num2;
	
	public int calculate() {
		// 첫번째 정수 입력
		// 두번째 정수 입력
		// 두 수 의 합은 ?
//		int c = a + b;
		int c = num1 + num2;
		return c;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
