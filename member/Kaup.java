package com.jse.member;
/*
개발자님 키와 몸무게를 이용하여
카우프지수를 구하고 그 결과 정상, 저체중, 비만 등으로 
몸의 상태만 알려주는 프로그램을 만들어라.
 */
/*
 공식
BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m))

BMI 18.5이하 - 저체중
18.5 ~ 23 정상
23.0 ~ 25 과체중
25 ~ 30.0 ~ 비만
 */
public class Kaup {
	private double height;
	private double weight;
	
	public void setHeight(double height) {
		this.height = height / 100;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String kaup() {

		double bmi = weight / (height * height);
		System.out.println(bmi);
		
		String result = "";
		
		if (bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23.0) {
			result = "정상";
		}else if(bmi < 25.0) {
			result = "과체중";
		}else if(bmi < 29.0) {
			result = "위험체중";
		}else if(bmi < 30.0) {
			result = "비만 1단계";
		}else if(bmi < 40.0) {
			result = "비만 2단계";
		}else {
			result = "비만 3단계";
		}
		
		return result;
	}
}
