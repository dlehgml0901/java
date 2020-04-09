package com.jse.game;

import java.util.Scanner;

import com.jse.algorithm.Sum1to5;
import com.jse.game.Dice;
import com.jse.game.RPSGame;
import com.jse.member.Kaup;
import com.jse.member.Member;
import com.jse.util.Calculator;

import java.util.Random;

public class GameController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Member member = new Member();
		Calculator calculator = null;
		Dice dice = null;
		//new - 새로운 메모리 공간을 만들어라. 경로 주소(reference)를 발생시킨다.
		RPSGame rpsgame = null; // 메모리가 필요할때만.
//		RPSGame rpsgame = new RPSGame();
		Kaup kaup = null;
		
//		int sum = 0;
		while (true) {
			System.out.println("0. 종료, 1. 계산기, 2. 주사위 홀짝 맞추기,"
					+ " 3. 가위바위보, 4. 1부터 100까지의 합, 5.BMI지수 측정"
					+ ", 6. 회원가입, 7. 로그인");
			int flag = scan.nextInt();
//			sum += flag;
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("계산기");
//				--sum;
//				System.out.println("합은 : " + sum);
				
				calculator = new Calculator();
				System.out.print("첫번째 정수 입력 = ");
				int a = scan.nextInt();
				calculator.setNum1(a);
				System.out.print("두번째 정수 입력 = ");
				int b = scan.nextInt();
				calculator.setNum2(b);
				int c = calculator.calculate();
				System.out.println("두 수의 합은 : "+ c);
				break;
			case 2:
				System.out.println("주사위 홀짝 맞추기");
				System.out.println("기대하는 값 (홀/짝)을 입력해주세요.");
				
				dice = new Dice();
				String expect = scan.next();
				dice.setExpect(expect);
				System.out.println("사용자 = " + expect);
				
				int x = ran.nextInt(6) + 1;
				dice.setDice(x);
				
				String dresult = dice.switchDice();
				System.out.println("결   과 = " + x + " " + dresult + "수입니다.");
				System.out.println(dice.resultDice());
				
				break;
			case 3:
				System.out.println("가위바위보");
				System.out.println("1 가위, 2 바위, 3 보 숫자를 입력하세요.");
				
				rpsgame = new RPSGame();
				int user = scan.nextInt();
				rpsgame.setUser(user);
				System.out.println("사용자 : " + user);
				
				int comp = ran.nextInt(3)+1;
				rpsgame.setComp(comp);
				System.out.println("컴퓨터 : " + comp);
				
				String gresult = rpsgame.rpsgame();
				System.out.println(gresult);
				break;
			case 4:
				System.out.println("1부터 100까지의 합");
				Sum1to5.main(args);
				break;
			case 5:
				System.out.println("MBI지수 측정");
				
				kaup = new Kaup();
				System.out.print("신장 : ");
				kaup.setHeight(scan.nextDouble());
				
				System.out.print("몸무게 : ");
				kaup.setWeight(scan.nextDouble());
				
				System.out.println("결과 : " + kaup.kaup());
				break;
			case 6:
				System.out.println("회원가입");
				System.out.print("아이디입력 : ");
				String id = scan.next();
				member.setId(id);
				break;
			case 7:
				System.out.println("로그인");
				System.out.print("아이디입력 : ");
				String id2 = scan.next();
				
				String returnId = member.getId();
				System.out.println("로그인된 아이디 : " + returnId);
				if (id2.equals(returnId)) {
					System.out.println("로그인 성공.");
				}else {
					System.out.println("로그인 실패.");
				}
				break;
			}
		}

	}

}
