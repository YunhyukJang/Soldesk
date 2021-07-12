package pk13_2;

public class LeasJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 받아옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 상담 대기시간이 적은 상담원에게 배분됩니다.");
	}
}
