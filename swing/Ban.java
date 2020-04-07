package com.jse.swing;

public class Ban {
	private GradeBean[] grades;
	public Ban() {
		grades = new GradeBean[100];
	}
	
	public void setGrades(GradeBean[] grades) {
		this.grades = grades;
	}
	public GradeBean[] getGrades() {
		for (int i = 0; i < 3; i++) {
			GradeBean grade = grades[i];
			System.out.println(String.format(" %s : 총점 %d점, 평균 %d점, 학점 : %s",
					grade.getName(), grade.total(), grade.aver(), grade.grade2()));
		}
		return grades;
	}
}
