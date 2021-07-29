package vo;

public class FlyPlace {
	String pName; //여행지 이름
	String pInfo; //여행지 정보
	String pPrice; //여행지 티켓 가격
	String rPeriod; //추천 여행 기간
	String rInfo; //추천 여행 기간 정보
	
	public FlyPlace(String pName, String pInfo, String pPrice, String rPeriod, String rInfo) {
		this.pName=pName;
		this.pInfo=pInfo;
		this.pPrice=pPrice;
		this.rPeriod=rPeriod;
		this.rInfo=rInfo;
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

	public String getrPeriod() {
		return rPeriod;
	}

	public void setrPeriod(String rPeriod) {
		this.rPeriod = rPeriod;
	}

	public String getrInfo() {
		return rInfo;
	}

	public void setrInfo(String rInfo) {
		this.rInfo = rInfo;
	}
}
