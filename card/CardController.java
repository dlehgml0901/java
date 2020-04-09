package com.jse.card;

import java.util.Scanner;

public class CardController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CardService service = new CardService();
		Card card = null;
		while (true) {
			System.out.println("0.Exit, 1.카드 3장 받기, 2.카드 3장 확인");
			switch (scan.nextInt()) {
			case 0: return;
			case 1:
				System.out.println("카드 3장 받기 모양, 숫자 입력");
				for (int i = 0; i < 3; i++) {
					card = new Card();
					card.setKind(scan.next());
					card.setNumber(scan.nextInt());
					service.add(card);
				}
				break;
			case 2:
				Card[] cards = service.getCards();
				for (int i = 0; i < 3; i++) {
					System.out.println(String.format("모양 : %s, %d", cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			}
		}
	}
}
