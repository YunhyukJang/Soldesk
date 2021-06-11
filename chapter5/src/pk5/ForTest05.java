package pk5;

public class ForTest05 {

	public static void main(String[] args) {
		/*
		 * 1~100까지 합을 구하되 
		 * 합이 100에 가장 근접한 시점에서 합과 수를 출력하라
		 */
		int i=0;
		int sum=0;
		
		for(i=0; sum<100; i++) {
			sum += i;
		}
		
		System.out.println("합="+sum);
		System.out.println("수="+i);
	}
}
