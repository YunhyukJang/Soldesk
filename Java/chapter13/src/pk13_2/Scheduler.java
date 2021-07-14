package pk13_2;

public interface Scheduler {
	public void getNextCall(); //다음 고객의 콜 가져오기
	public void sendCallToAgent(); //상담원에게 콜 전달
}
