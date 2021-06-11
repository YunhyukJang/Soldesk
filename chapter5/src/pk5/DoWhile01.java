package pk5;

public class DoWhile01 {

	public static void main(String[] args) {
		int num=1; //인덱스 변수 초기화
		int sum=0;
		
		do {
			sum += num; //1, 값을 증가
			
			num++; //2, 인덱스 변수 증가
		}while(num <= 10);
		
		System.out.println("1~10까지의 합="+sum);
	}
}
