package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JoinView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton saveBtn, cancelBtn;
	JLabel[] labels;
	JTextField[] tfields;
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
		
		labels = new JLabel[5];
		tfields = new JTextField[5];
		
		String[] names = {"이름 : ", "아이디 : ", "패드워드 : ", "주민번호 : ", "추가사항 : "};
		
		for (int i = 0; i < names.length; i++) {
			labels[i] = new JLabel(names[i]);
			tfields[i] = new JTextField();
			panel.add(labels[i]);
			panel.add(tfields[i]);
		}
		
		saveBtn = new JButton("저장");
		cancelBtn = new JButton("취소");
		
		saveBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		panel.add(saveBtn);
		panel.add(cancelBtn);
		
		labels[0].setBounds(40,10,50,40);
		labels[1].setBounds(40,50,50,40);
		labels[2].setBounds(40,90,70,40);
		labels[3].setBounds(40,130,70,40);
		labels[4].setBounds(40,170,70,40);
		tfields[0].setBounds(120,10,200,30);
		tfields[1].setBounds(120,50,200,30);
		tfields[2].setBounds(120,90,200,30);
		tfields[3].setBounds(120,130,280,30);
		tfields[4].setBounds(120,180,280,120);
		saveBtn.setBounds(125, 330, 80, 30);
		cancelBtn.setBounds(240, 330, 80, 30);
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveBtn) {
			tfields[0].setText("홍길동, 유관순, 이순신, 신사임당, 이도");
			tfields[1].setText("hong, you, lee, shin, leedo");
			tfields[2].setText("1,2,3,4,5");
			tfields[3].setText("900101-1, 960101-2, 980101-1, 011010-4, 020606-3");
			JOptionPane.showMessageDialog(this,String.format("%s / %s / %s / %s",
					tfields[0].getText(),
					tfields[1].getText(),
					tfields[2].getText(),
					tfields[3].getText(),
					tfields[4].getText()));
//			JOptionPane.showMessageDialog(this, data);
			String[] data = String.format("%s / %s / %s / %s",
					tfields[0].getText(),
					tfields[1].getText(),
					tfields[2].getText(),
					tfields[3].getText(),
					tfields[4].getText()).split("/");
			String[] names = data[0].split(",");
			String[] userId = data[1].split(",");
			String[] password = data[2].split(",");
			String[] ssn = data[3].split(",");
			Member[] members = memberService.getMembers();
			for(int i=0;i < members.length; i++) {
				System.out.println(members[i].toString());
			}
		}else if(e.getSource() == cancelBtn) {
			JOptionPane.showMessageDialog(this, "취소");
		}
	}
}
