package com.jse.grade;

public interface GradeService {
	public void setGrades(Grade[] grades);
	public Grade[] getGrades();
	public void add(Grade grade);
	public void setCount(int count);
	public int getCount();
	public int total(Grade grade);
	public int aver(Grade grade);
	public String record(Grade grade);
	public String printGrades();
	public String ranking();
}
