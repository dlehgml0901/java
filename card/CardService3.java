package com.jse.card;

public class CardService3 {
	private CardBean[][][] cardKontainer;
	
	public CardService3() {
		cardKontainer = new CardBean[52][10][1000];
	}
	
	public CardBean[][][] getCardKontainer() {
		return cardKontainer;
	}
	public void setCardKontainer(CardBean[][][] cardKontainer) {
		this.cardKontainer = cardKontainer;
	}

}
