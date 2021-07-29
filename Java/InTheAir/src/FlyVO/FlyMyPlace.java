package FlyVO;

	public class FlyMyPlace {
		String pName; //여행지 이름
		String month; //선택한 월
		String date; //선택한 일
		String time; //선택한 시간대
		String client; //선택한 인원
		String seat; //선택한 좌석
		
		public FlyMyPlace() {	
		}
		
		public FlyMyPlace(String pName, String month, String date, String time, String client, String seat) {
			this.pName=pName;
			this.month=month;
			this.date=date;
			this.time=time;
			this.client=client;
			this.seat=seat;
		}

		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
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

		public String getClient() {
			return client;
		}

		public void setClient(String client) {
			this.client = client;
		}

		public String getSeat() {
			return seat;
		}

		public void setSeat(String seat) {
			this.seat = seat;
		}
	}
