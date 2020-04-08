package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PhoneService service = new PhoneService();
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog("0.Exit\t 1.입력\t 2.출력"
					+"\t 3.휴대전화 입력\t 4.휴대전화 출력"
					+ "\t 5.IPhone 입력 \t 6.IPhone 출력"
					+ "\t 7.GalaxyNote 입력 \t 8.GalaxyNote 출력")) {
			case "0": return;
			case "1":
//				String[] values = msg.split(",");
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company").split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}
				break;
			case "2":
				Phone[] phones = service.getPhones();
				String message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("출력 : %s, %s, %s \n", 
							phones[i].getPhoneNumber(), phones[i].getName(), phones[i].getCompany());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company").split(",");
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}
				break;
			case "4":
				CelPhone[] celPhones = service.getCelPhones();
				String message2 = "";
				for (int i = 0; i < 3; i++) {
					message2 += String.format("출력 : %s, %s, %s , %b\n",
							celPhones[i].getPhoneNumber(), celPhones[i].getName(), celPhones[i].getCompany(), celPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message2);
				break;
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company, search").split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "6":
				Iphone[] iphones = service.getIphones();
				String message3 = "";
				for (int i = 0; i < 3; i++) {
					message3 += String.format("출력 : %s, %s, %s, %b, %s \n", 
							iphones[i].getPhoneNumber(), iphones[i].getName(), iphones[i].getCompany(), iphones[i].getMove(), iphones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message3);
				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company, bigSize").split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "8":
				GalaxyNote[] galaxyNotes = service.getGalaxyNotes();
				String message4 = "";
				for (int i = 0; i < 3; i++) {
					message4 += String.format("출력 : %s, %s, %s, %b, %s \n",
							galaxyNotes[i].getPhoneNumber(), galaxyNotes[i].getName(), galaxyNotes[i].getCompany(), galaxyNotes[i].getMove(), galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message4);
				break;
			}
		}
	}
}
