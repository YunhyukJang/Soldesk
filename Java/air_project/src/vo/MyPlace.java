package vo;

public class MyPlace {
	String date; //예매 날짜
	String time; //예매 시간
	int client; //고객 인원 수
	
	public MyPlace() {
	}
	
	public MyPlace(String date, String time, int client) {
		this.date=date;
		this.time=time;
		this.client=client;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}
}
