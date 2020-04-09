package com.jse.game;

public class Dice {
	private String expect;
	private int dice;
	
	public String switchDice() {
		String result = "";
		
		switch (dice%2){
		case 1:
			result = "홀";
			break;
		case 0:
			result = "짝";
			break;
		}
		
		return result;
	}
	
	public String resultDice() {
		String result2 = "";
		
		if (expect.equals(switchDice())) {
			result2 = "맞   음";
		}else {
			result2 = "틀   림";
		}
		
		return result2;
	}

	public String getExpect() {
		return expect;
	}

	public void setExpect(String expect) {
		this.expect = expect;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}
}
