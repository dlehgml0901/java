package com.jse.grade;
/*
클라이언트에서 프로그램 개발 요청이 왔습니다. 
* 이름과 국,영,수 세과목점수를 입력받아서() 
* [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 

* 단) 평균은 소수점이하는 절삭합니다 

* 평균점수가 90점 이상 A 
* 80점 이상이면 B 
* 70점 이상이면 C 
* 60점 이상이면 D 
* 50점 이상이면 E 
* 50점 미만이면 F 학점입니다
* 라고 출력되게 해주세요
*/
public class GradeBean {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public GradeBean(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	
	public int total() {
		return korean + english + math;
	}
	
	public int aver() {
		return total() / 3 ;
	}
	
	public String grade() {
		String credit = "";
		
		if (aver() >= 90) {
			credit = "A";
		}else if (aver() >= 80) {
			credit = "B";
		}else if (aver() >= 70) {
			credit = "C";
		}else if (aver() >= 60) {
			credit = "D";
		}else if (aver() >= 50) {
			credit = "E";
		}else if (aver() < 50) {
			credit = "F";
		}
		
		return credit;
	}
	
	public String grade2() {
		String credit = "";
		
		switch (aver()/10) {
		case 9:
			credit = "A";
			break;
		case 8:
			credit = "B";
			break;
		case 7:
			credit = "C";
			break;
		case 6:
			credit = "D";
			break;
		case 5:
			credit = "E";
			break;
		case 4: case 3:
		case 2: case 1:
		case 0:
			credit = "F";
			break;
		}
		
		return credit;
	}
	
}
