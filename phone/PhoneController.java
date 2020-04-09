package com.jse.phone;

import com.jse.util.Constants;
import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		PhoneService service = new PhoneService();
		Phone phone = null;
		CelPhone celPhone = null;
		Iphone iPhone = null;
		GalaxyNote galaxyNote = null;
		String message = "";
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0": return;
			case "1":
//				String[] values = msg.split(",");
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
//					phone = new Phone();
//					phone.setPhoneNumber(values[0]);
//					phone.setName(values[1]);
//					phone.setCompany(values[2]);
//					service.add(phone);
					service.add(new Phone(values[0], values[1], values[2]));
				}
				break;
			case "2":
				Phone[] phones = service.getPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += phones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
//					celPhone = new CelPhone();
//					celPhone.setPhoneNumber(values[0]);
//					celPhone.setName(values[1]);
//					celPhone.setCompany(values[2]);
//					celPhone.setMove(true);
					
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}
				break;
			case "4":
				CelPhone[] celPhones = service.getCelPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += celPhones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "6":
				Iphone[] iphones = service.getIphones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += iphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU).split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[3], values[4]));
				}
				break;
			case "8":
				GalaxyNote[] galaxyNotes = service.getGalaxyNotes();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += galaxyNotes[i].toString()+"\n";
//							String.format("출력 : %s, %s, %s, %b, %s \n",
//							galaxyNotes[i].getPhoneNumber(), galaxyNotes[i].getName(), galaxyNotes[i].getCompany(), galaxyNotes[i].getMove(), galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}
