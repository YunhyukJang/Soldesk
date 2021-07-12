package pk4;

public class Example01 {

	public static void main(String[] args) {
		/*
		 * 어느 과수원이 있다. 
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다. 
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고 
		 * 모든 과일의 시간당 평균 생산 갯수를 출력해라 
		 * 단, 평균 값을 담는 변수는 float으로 지정해라
		 */
		
		int pear=5;
		int apple=7;
		int orange=5;
		int dayFruit;
		float avgFruit;
		
		dayFruit=pear+apple+orange;
		
		System.out.println(dayFruit);
		
		avgFruit=(float)dayFruit/24;
		
		System.out.println(avgFruit);
	}
}
