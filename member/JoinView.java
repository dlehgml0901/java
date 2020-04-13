package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.jse.card.Card;

public class JoinView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton saveBtn, listBtn, loginBtn;
	JLabel[] labels;
	JLabel areaLabel;
	JTextField[] tfields;
	JTextArea textArea;
	JPanel panel;
	MemberService memberService;
	
	public JoinView() {
		memberService = new MemberServiceImpl();
	}
	
	public void open() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		this.add(panel);
		this.setVisible(true);
		
		labels = new JLabel[6];
		tfields = new JTextField[6];
		textArea = new JTextArea();
		
		String[] names = {"이름","아이디","패스워드","SSN","주소"};
		
		for (int i = 0; i < names.length; i++) {
			labels[i] = new JLabel(names[i]);
			tfields[i] = new JTextField();
			panel.add(labels[i]);
			panel.add(tfields[i]);
		}
		areaLabel = new JLabel("검색결과");
		panel.add(areaLabel);
		panel.add(textArea);
		saveBtn = new JButton("저장");
		listBtn = new JButton("목록");
		loginBtn = new JButton("로그인");
		
		saveBtn.addActionListener(this);
		listBtn.addActionListener(this);
		loginBtn.addActionListener(this);
		panel.add(saveBtn);
		panel.add(listBtn);
		panel.add(loginBtn);
		
		labels[0].setBounds(40,10,50,40);
		labels[1].setBounds(40,50,50,40);
		labels[2].setBounds(40,90,70,40);
		labels[3].setBounds(40,130,70,40);
		labels[4].setBounds(40,170,70,40);
		areaLabel.setBounds(40,200,70,40);		
		tfields[0].setBounds(120,15,200,30);
		tfields[1].setBounds(120,55,200,30);
		tfields[2].setBounds(120,95,200,30);
		tfields[3].setBounds(120,135,280,30);
		tfields[4].setBounds(120,175,280,30);
		textArea.setBounds(120,210,280,120);
		saveBtn.setBounds(75, 370, 80, 30);
		listBtn.setBounds(185, 370, 80, 30);
		loginBtn.setBounds(300, 370, 80, 30);
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveBtn) {
			tfields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			tfields[1].setText("hong,you,lee,shin,leedo");
			tfields[2].setText("1,2,3,4,5");
			tfields[3].setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			tfields[4].setText("서울,서울,서울,부산,부산");
			String data = String.format("%s / %s / %s / %s / %s",
					tfields[0].getText(),
					tfields[1].getText(),
					tfields[2].getText(),
					tfields[3].getText(),
					tfields[4].getText());

			String[] arr = data.split("/");
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userIds = arr[1].split(",");
			String[] passwords = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			
			for (int i = 0; i < 5; i++) {
				members[i] = new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userIds[i]);
				members[i].setPasswd(passwords[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddr(addrs[i]);
				memberService.add(members[i]);
			}
		}else if(e.getSource() == listBtn) {
			Member[] members = memberService.getMembers();
			for (int i = 0; i < members.length; i++) {
				String data = String.format("%s, %s, %s, %s, %s \n", 
						members[i].getName(),
						members[i].getUserid(),
						members[i].getPasswd(),
						members[i].getSsn(),
						members[i].getAddr());
				textArea.setText(data);
				System.out.println(data);
			}
//			JOptionPane.showMessageDialog(textArea, members);
		}else if (e.getSource() == loginBtn) {
			
		}
	}
}
