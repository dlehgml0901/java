package com.jse.grade;

public class GradeServiceImpl implements GradeService{

	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}
	@Override
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	@Override
	public Grade[] getGrades() {
		return grades;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public void add(Grade grade){
		grades[count] = grade;
		count++;
	}
	@Override
	public int total(Grade grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath() + grade.getJava();
	}
	@Override
	public int aver(Grade grade) {
		return total(grade) / 4;
	}
	@Override
	public String record(Grade grade) {
		int average = aver(grade);
		String result = "";
		
		if (aver(grade) >= 90) {
			result = "A";
		}else if (aver(grade) >= 80) {
			result = "B";
		}else if (aver(grade) >= 70) {
			result = "C";
		}else if (aver(grade) >= 60) {
			result = "D";
		}else if (aver(grade) >= 50) {
			result = "E";
		}else if (aver(grade) < 50) {
			result = "F";
		}
		return result;
	}
	@Override
	public String printGrades() {
		String result = "";
		Grade[] grades = getGrades();
		for (int i = 0; i < 5; i++) {
			result += String.format(" %s : 총점 %d점, 평균 %d점, 학점 : %s \n",
					grades[i].getName(), total(grades[i]), aver(grades[i]), record(grades[i]));
		}
		return result;
	}
	@Override
	public String ranking() {
		grades = getGrades();
		int a = total(grades[0]);
		int b = total(grades[1]);
		int c = total(grades[2]);
		if(a > b&&a > c) {
			System.out.println("1등 : " + grades[0].getName());
			if(b > c) {
				System.out.println("2등 : " + grades[1].getName());
				System.out.println("3등 : " + grades[2].getName());
				}
			else {
				System.out.println("2등 : " + grades[2].getName());
				System.out.println("3등 : " + grades[1].getName());
				}
			}
		else if(b > a&&b > c) {
			System.out.println("1등 : " + grades[1].getName());
			if(a > c) {
				System.out.println("2등 : " + grades[0].getName());
				System.out.println("3등 : " + grades[2].getName());
				}
			else {
				System.out.println("2등 : " + grades[2].getName());
				System.out.println("3등 : " + grades[0].getName());
				}
			}
		else if(c > a&&c > b) {
			System.out.println("1등 : " + grades[2].getName());
			if(a > b) {
				System.out.println("2등 : " + grades[0].getName());
				System.out.println("3등 : " + grades[1].getName());
				}
			else {
				System.out.println("2등 : " + grades[1].getName());
				System.out.println("3등 : " + grades[0].getName());
				}
			}
		return null;
	}
}
