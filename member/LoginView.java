package com.jse.member;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginView extends JFrame implements ActionListener{
	JButton loginBtn, cancelBtn;
	JLabel[] labels;
	TextField[] tfields;
	JPanel panel;
	
	private static final long serialVersionUID = 1L;
	public void login() {
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		this.add(panel);
		this.setVisible(true);
		
		labels = new JLabel[2];
		tfields = new TextField[2];
		
		String[] names = {"아이디 : ", "패드워드 : "};
		
		for (int i = 0; i < names.length; i++) {
			labels[i] = new JLabel(names[i]);
			tfields[i] = new TextField();
			panel.add(labels[i]);
			panel.add(tfields[i]);
		}
		
		loginBtn = new JButton("로그인");
		cancelBtn = new JButton("취소");
		
		loginBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		panel.add(loginBtn);
		panel.add(cancelBtn);
		
		labels[0].setBounds(40,10,70,40);
		labels[1].setBounds(40,50,70,40);
		tfields[0].setBounds(120,10,200,30);
		tfields[1].setBounds(120,50,200,30);
		loginBtn.setBounds(110, 100, 80, 30);
		cancelBtn.setBounds(220, 100, 80, 30);
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginBtn) {
			JOptionPane.showMessageDialog(this,"로그인 성공");
		}else if(e.getSource() == cancelBtn) {
			JOptionPane.showMessageDialog(this,"취소");
		}
		
	}

}
