package pk5;

public class ForTest07 {

	public static void main(String[] args) {
		//continue
		int total=0;
		int num;
		
		for(num=0; num <= 100; num++) {
			//짝수는 제외하고 더하기
			if(num%2 == 0) {
				//if문이 true일 때 그냥 진행
				continue;
			}
			
			total += num;
		}
		
		System.out.println("1~100까지 홀수의 합="+total);
	}
}
