package business;

public class CompanyBasics {
	private String name;
	private String part;
	private String addr;
	private String birthday;
	
	public CompanyBasics() {
	}
	
	public CompanyBasics(String name, String part, String addr, 
			String birthday) {
		this.name=name;
		this.part=part;
		this.addr=addr;
		this.birthday=birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
