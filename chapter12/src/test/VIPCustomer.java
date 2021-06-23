package test;

public class VIPCustomer extends Customer {
	private int agentID; //전문 상담원
	double saleRatio; //10% 세일
	
	//생성자 이용(고객의 아이디, 이름, 상담원 아이디)
	//생성자 이용(등급=VIP, bonusRatio=0.05, saleRatio)
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID=agentID;
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	//calPrice -> Overriding
	//return 5000-(5000*0.1) saleRatio 활용
	@Override
	public int calPrice(int price) {
		bonusPoint += bonusRatio*price;
		
		return super.calPrice(price)-(int)(price*saleRatio);
	}
	
	//showCustomerInfo() -> Overriding
	@Override
	public String showCustomerInfo() {
		//부모 클래스의 메서드를 사용하고 상담원 아이디 추가
		return super.showCustomerInfo()+" 담당 상담원 번호는 "+agentID+"입니다.";
	}

	//상담원 아이디
	public int getAgentID() {
		return agentID;
	}
}
