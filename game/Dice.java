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
	
	
//	
//	static void ifDice() {
//		Random random = new Random();
//		
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값(홀/짝)을 입력해주세요.");
//		
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		
//		System.out.println("예상값 = " + expect);
//		
//		int x = random.nextInt(6)+1;
//		String result = "";
//		
//		if (x % 2 == 1) {
//			result = "홀수입니다.";
//		} else if (x % 2 == 0){
//			result = "짝수입니다.";
//		}
//		
////		String result = (x % 2 == 1)? "홀" : "짝";
//		
//		System.out.println("결   과 = " + x + " " + result + "수입니다.");
//		if (expect.equals(result)) {
//			System.out.println("맞   음");
//		}else{
//			System.out.println("틀   림");
//		}
//	}

}
