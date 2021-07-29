package FlyVO;

public class FlycustomerGrade {

	protected String customerGrade; // 등급
	protected String customerID; // 항공사 고객 아이디
	protected String customerName; // 항공사 고객 이름
	protected double BMpoint; // 결제금액의 n% 적립
	protected double SMpoint;
	protected double GMpoint;
	protected double DMpoint;
	protected double SDMpoint;

	protected double price;

	public FlycustomerGrade() {

	}

	// Mpoint 마일리지포인트
	// 생성자 이용(고객의 아이디, 이름)
	// 생성자 이용(등급에 맞는 결제금액의 마일리지포인트 적립)
	public FlycustomerGrade(String customerGrade, String customerID, String customerName, double BMpoint, double SMpoint,
			double GMpoint, double DMpoint, double SDMpoint, double price) {
		this.customerGrade = customerGrade;
		this.customerID = customerID;
		this.customerName = customerName;
		this.BMpoint = BMpoint;
		this.SMpoint = SMpoint;
		this.GMpoint = GMpoint;
		this.DMpoint = DMpoint;
		this.SDMpoint = SDMpoint;
		this.price = price;

		customerGrade = "Bronze";
		BMpoint = price * 0.03;

		customerGrade = "Silver";
		SMpoint = price * 0.05;

		customerGrade = "Gold";
		GMpoint = price * 0.15;

		customerGrade = "Diamond(=VIP)";
		DMpoint = price * 0.20;

		customerGrade = "Special Diamond(=VVIP)";
		SDMpoint = price * 0.25;
	}

	// CustomerGrade
	public String getCustomerGrade() {
		return customerGrade;
	}

	// getBMpoint
	public double getBMpoint() {
		return BMpoint;
	}

	// SMpoint
	public double getSMpoint() {
		return SMpoint;
	}

	// GMpoint
	public double getGMpoint() {
		return GMpoint;
	}

	// DMpoint
	public double getDMpoint() {
		return DMpoint;
	}

	// SDMpoint
	public double getSDMpoint() {
		return SDMpoint;
	}

	// getPrice
	public double getPrice() {
		return price;
	}
}


