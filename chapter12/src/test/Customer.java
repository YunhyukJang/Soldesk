package test;

public class Customer {
	public int customerID;
	public String customerName;
	public String customerGrade;
	public int bonusPoint;
	public double bonusRatio;
	
	public Customer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	//포인트만 적립
	public int calPrice(int price) {
		bonusPoint += bonusRatio*price;
		
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며 보너스 포인트는 "+bonusPoint+"입니다."; 
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
