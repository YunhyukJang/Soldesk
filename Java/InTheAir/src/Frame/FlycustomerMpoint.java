package Frame;

import java.util.ArrayList;

import FlyVO.FlycustomerGrade;


public class FlycustomerMpoint extends FlycustomerGrade {

	public FlycustomerMpoint(String customerGrade, String customerID, String customerName, double BMpoint, double SMpoint,
			double GMpoint, double DMpoint, double SDMpoint, double price) {
		super(customerGrade, customerID, customerName, BMpoint, SMpoint, GMpoint, DMpoint, SDMpoint, price);
	}

	public FlycustomerMpoint() {

		FlycustomerGrade grade = new FlycustomerGrade();

		ArrayList<String> list = new ArrayList<>(); // 등급 저장
		ArrayList<Integer> list2 = new ArrayList<>(); // 마일리지 저장

		list.add("Bronze");
		list.add("Silver");
		list.add("Gold");
		list.add("Diamond(=VIP)");
		list.add("Special Diamond(=VVIP)");

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.equals("Bronze")) {
					grade.getBMpoint();
				} else if (list.equals("Silver")) {
					grade.getSMpoint();
				} else if (list.equals("Gold")) {
					grade.getGMpoint();
				} else if (list.equals("Diamond(=VIP)")) {
					grade.getDMpoint();
				} else if (list.equals("Special Diamond(=VVIP)")) {
					grade.getSDMpoint();
				}
			}
		}
	}
}
