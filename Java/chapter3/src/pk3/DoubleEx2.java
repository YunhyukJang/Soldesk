package pk3;

public class DoubleEx2 {

	public static void main(String[] args) {
		double dNum = 1;
		
		/*
		 * dNum=dNum+0.1;
		 * 
		 * System.out.println(dNum);
		 */

		for (int i = 0; i < 10000; i++) {
			dNum = dNum + 0.1;
		}

		System.out.println(dNum);
	}
}
