package FlyVO;

public class Flydata {

	private String name;
	private int point;
	private String address;	
	private String check;
	private String rank;
	private String id;
	private String pw;

	public Flydata() {

	}
	public Flydata(String name, String id, String pw, String address) {

		this.name = name;
		this.address = address;
		this.id = id;
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals("")) {
			this.name = name;
		}
	}
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		point=2800;
		this.point = point;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String getRank() {
		return "VIP";
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
