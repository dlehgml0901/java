package com.jse.grade;

import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class GradeController {
	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();
		
		Grade grade = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);
					}
				break;
			case "2":
				JOptionPane.showMessageDialog(null, gradeService.list());
				break;
			case "3":
				System.out.println("총점별로 1, 2, 3등 이름 나열하기.");
				String[] rank = new String[3];
//				for (int i = 0; i < 3; i++) {
//					if (grades[i].total() > grades[i+1].total() && grades[i].total() > grades[i+2].total()) {
//						rank[0] = grades[i].getName();
//						if (grades[i+1].total() > grades[i+2].total()) {
//							rank[1] = grades[i+1].getName();
//							rank[2] = grades[i+2].getName();
//						}else {
//							rank[1] = grades[i+2].getName();
//							rank[2] = grades[i+1].getName();
//						}
//					}
//				}
//				System.out.println(String.format("1등 : %s, 2등 : %s, 3등 : %s", rank[0], rank[1], rank[2]));
				break;
			}
		}
	}
}
