package vo;

public class Place {
	String pName; //여행지
	String pInfo; //여행지 정보
	String pPrice; //가격
	String period; //추천 여행 기간
	
	public Place(String pName, String pInfo, String pPrice, String period) {
		this.pName=pName;
		this.pInfo=pInfo;
		this.pPrice=pPrice;
		this.period=period;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpInfo() {
		return pInfo;
	}

	public void setpInfo(String pInfo) {
		this.pInfo = pInfo;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
}
