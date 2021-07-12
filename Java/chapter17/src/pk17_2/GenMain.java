package pk17_2;

public class GenMain {

	public static void main(String[] args) {
		Gen g=new Gen();
		
		/*
		 * Generic은 int, double, char와 같은 기본 자료형으로 생성 시 대입이 불가능하다. 
		 * Generic은 반드시 객체로 처리해야 한다.
		 */
		//정수형
		Integer[] iArr= {1, 2, 3, 4, 5};
		
		//더블형
		Double[] dArr= {1.1, 2.2, 3.3, 4.4, 5.5};
		
		//문자형
		Character[] cArr= {'A', 'B', 'C', 'D', 'E'};
		
		g.printArr(iArr);	
		g.printArr(dArr);	
		g.printArr(cArr);
	}
}
