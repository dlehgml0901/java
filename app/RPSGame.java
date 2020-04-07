package com.jse.app;

public class RPSGame {
	private int user;
	private int comp;
	//디스크 상의 존재.
	public String rpsgame() {
		String result = "";

		if (user == comp) {
			result = "비겼습니다.";
		}else if (user < comp) {
			result = "컴퓨터 승리";
		}else if (user > comp) {
			result = "사용자 승리";
		}
		
		return result;
	}
	
	public int getUser() {
		return user;
	}
	
	public void setUser(int user) {
		this.user = user;
	}
	
	public int getComp() {
		return comp;
	}
	
	public void setComp(int comp) {
		this.comp = comp;
	}
}
