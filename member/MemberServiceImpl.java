package com.jse.member;

import java.util.Arrays;

import javax.swing.JOptionPane;

import com.jse.grade.Grade;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	@Override
	public Member[] list() {
		return members;
	}
	@Override
	public Member[] searchByName(String name) {
		Member[] searchs = null;
		int searchCount = count(name);
		if (searchCount != 0) {
			searchs = new Member[searchCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {
					searchs[j] = members[i];
					j++;
					if (searchCount == j) {
						break;						
					}
				}
			}
		}
		
		return searchs;
	}
	@Override
	public Member[] searchByGender(String ssn) {
		Member[] searchs = null;
		return searchs;
	}
	@Override
	public Member detail(String userid) {
		Member detail = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {
				detail = new Member();
				detail = members[i];
				break;
			}
		}
		return detail;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public int count(String name) {
		int rcount = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				rcount++;
			}
		}
		return rcount;
	}
	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid()) && 
					member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = members[i];
				break;
			}
		}
		return returnMember;
	}
	@Override
	public void update(Member member) {
		 for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
	}
	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid()) && 
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
			}
		}
	}
}
