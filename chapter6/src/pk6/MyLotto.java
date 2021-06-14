package pk6;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		//로또 번호 배열
		int[] lotto=new int[6];
		
		System.out.println("이번 주 로또 예상 번호");
		
		outer:for(int i=0; i<lotto.length; i++) { //i++ 생략 가능
			lotto[i]=new Random().nextInt(45)+1;
			
			//중복 값을 비교하는 반복문
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			
			System.out.println(lotto[i]+" ");
		}
	}
}
