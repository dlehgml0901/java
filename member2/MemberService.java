package com.jse.member2;

public interface MemberService {
	public void add(Member member);
	public Member[] list();
	public Member detail(String userid);
	public int count();
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);
	
}
