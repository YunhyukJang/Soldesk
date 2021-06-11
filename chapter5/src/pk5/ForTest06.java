package pk5;

public class ForTest06 {

	public static void main(String[] args) {
		/*
		 * 1~100까지 합을 구하되 
		 * 합이 100에 가장 근접한 시점에서 합과 수를 출력하라
		 */
		int i;
		int sum=0;
		
		//합이 100을 초과하면 멈춤
		for(i=1; ; i++) {
			sum += i;
			
			if(sum >= 100) {
				break;
			}
		}
		
		//합이 100보다 작으면 멈춤
		for(i=1; i <= 100; i++) {
			sum += i;
			
			if(sum<100) {
				System.out.println(sum);
			}
		}
		
		System.out.println("합="+sum);
		System.out.println("수="+i);
	}
}
