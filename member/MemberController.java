package com.jse.member;

import javax.swing.JOptionPane;

import java.util.Scanner;
import com.jse.member.MemberBean;
import com.jse.member.MemberService;
import com.jse.util.Constants;

public class MemberController {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner scan = new Scanner(System.in);
		while (true) {
//			System.out.println("0.종료 , 1.성적표입력, 2.성적표출력, 3.총점별로 1, 2, 3등 이름 나열하기"
//					+ ", 4.회원등록, 5.회원목록");
			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				System.out.println("회원 등록");
				for (int i = 0; i < 3; i++) {
					System.out.println("ID, PASSWORD, 이름, 나이 입력");
//					memberService.add(
//							new MemberBean(scan.next(), 
//									scan.next(), 
//									scan.next(), 
//									scan.nextInt()));
//					members[i] = join(scan);
				}
				break;
			case "2":
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
