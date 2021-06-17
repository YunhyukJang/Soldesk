package exam;

public class Example08 {

	public static void main(String[] args) {
		int[][] array= {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		int sum=0;
		double avg=0.0;
		int total=0;
		int count=0; //원소의 총 갯수를 파악하기 위한 변수
		int tcount=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				
				count++;
			}
			
			avg=(double)sum/count;
			
			System.out.println(sum);
			System.out.println(avg);
			
			//초기화 전 누적
			total += sum;
			tcount += count;
			//쓰레기값을 버리고 계산하기 위한 초기화
			sum=0;
			avg=0.0;
			count=0;
			
			System.out.println("--------------------");
		}
		
		double avgF=(double)total/tcount;
		
		System.out.println("총합="+total);
		System.out.println("평균="+avgF);
	}
}
