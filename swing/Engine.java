package com.jse.swing;

import java.util.Scanner;
import com.jse.swing.GradeService;
import com.jse.swing.MemberService;

public class Engine {
	public static void main(String[] args) {
		GradeService gradeService = new GradeService();
		MemberService memberService = new MemberService();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("0.종료 , 1.성적표입력, 2.성적표출력, 3.총점별로 1, 2, 3등 이름 나열하기"
					+ ", 4.회원등록, 5.회원목록");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				for (int i = 0; i < 3; i++) {
					System.out.println("이름, 국어, 영어, 수학 입력");
					gradeService.add(
							new GradeBean(
									scan.next(),
									scan.nextInt(),
									scan.nextInt(),
									scan.nextInt()));
					}
				break;
			case 2:
				GradeBean[] grade = gradeService.getGrades();
				for (int i = 0; i < 3; i++) {
//					GradeBean grade = grades[i];
					System.out.println(String.format(" %s : 총점 %d점, 평균 %d점, 학점 : %s",
							grade[i].getName(), grade[i].total(), grade[i].aver(), grade[i].grade2()));
				}
				break;
			case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기.");
				String[] rank = new String[3];
//				for (int i = 0; i < 3; i++) {
//					if (grades[i].total() > grades[i+1].total() && grades[i].total() > grades[i+2].total()) {
//						rank[0] = grades[i].getName();
//						if (grades[i+1].total() > grades[i+2].total()) {
//							rank[1] = grades[i+1].getName();
//							rank[2] = grades[i+2].getName();
//						}else {
//							rank[1] = grades[i+2].getName();
//							rank[2] = grades[i+1].getName();
//						}
//					}
//				}
//				System.out.println(String.format("1등 : %s, 2등 : %s, 3등 : %s", rank[0], rank[1], rank[2]));
//				if(grades[0].total() > grades[1].total()&&grades[0].total() > grades[2].total()) {
//					System.out.println("1등 : " + grades[0].getName());
//					if(grades[1].total() > grades[2].total()) {
//						System.out.println("2등 : " + grades[1].getName());
//						System.out.println("3등 : " + grades[2].getName());
//						}
//					else {
//						System.out.println("2등 : " + grades[2].getName());
//						System.out.println("3등 : " + grades[1].getName());
//						}
//					}
//				else if(grades[1].total() > grades[0].total()&&grades[1].total() > grades[2].total()) {
//					System.out.println("1등 : " + grades[1].getName());
//					if(grades[0].total() > grades[2].total()) {
//						System.out.println("2등 : " + grades[0].getName());
//						System.out.println("3등 : " + grades[2].getName());
//						}
//					else {
//						System.out.println("2등 : " + grades[2].getName());
//						System.out.println("3등 : " + grades[0].getName());
//						}
//					}
//				else if(grades[2].total() > grades[0].total()&&grades[2].total() > grades[1].total()) {
//					System.out.println("1등 : " + grades[2].getName());
//					if(grades[0].total() > grades[1].total()) {
//						System.out.println("2등 : " + grades[0].getName());
//						System.out.println("3등 : " + grades[1].getName());
//						}
//					else {
//						System.out.println("2등 : " + grades[1].getName());
//						System.out.println("3등 : " + grades[0].getName());
//						}
//					}
				break;
			case 4:
				System.out.println("회원 등록");
				for (int i = 0; i < 3; i++) {
					System.out.println("ID, PASSWORD, 이름, 나이 입력");
					memberService.add(
							new MemberBean(scan.next(), 
									scan.next(), 
									scan.next(), 
									scan.nextInt()));
//					members[i] = join(scan);
				}
				break;
			case 5:
				System.out.println("회원 목록");
				MemberBean[] members = memberService.getMembers();
				for (int i = 0; i < 3; i++) {
					MemberBean member = members[i];
					System.out.println(String.format("아이디 : %s, 패스워드 : %s, 이름 : %s, 나이 : %d", 
							member.getUserid(), member.getPasswd(), member.getName(), member.getAge()));
				}
				break;
			}
		}
	}
	
	static GradeBean input(Scanner scan) {
		System.out.println("이름, 국어, 영어, 수학 입력");
		return new GradeBean(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextInt());
	}
	
	static MemberBean join(Scanner scan) {
		System.out.println("ID, PASSWORD, 이름, 나이 입력");
		return new MemberBean(scan.next(), scan.next(), scan.next(), scan.nextInt());
//		Member member = new Member();
//		
//		System.out.print("ID : ");
//		member.setUserid(scan.next());
//		System.out.print("Password : ");
//		member.setPasswd(scan.next());
//		System.out.print("이름 : ");
//		member.setName(scan.next());
//		System.out.print("나이 : ");
//		member.setAge(scan.nextInt());
	
//		return member;
	}
}
