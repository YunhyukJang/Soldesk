package pk13_2;

public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 받아옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("전문 상담원에게 배분됩니다.");
	}
}
