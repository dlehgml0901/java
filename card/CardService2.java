package com.jse.card;

public class CardService2 {
	private CardBean[][] cardBox;
	
	public CardService2() {
		cardBox = new CardBean[3][10];
	}
	
	public void setCardBox(CardBean[][] cardBox) {
		this.cardBox = cardBox;
	}
	public CardBean[][] getCardBox(){
		return cardBox;
	}
}
