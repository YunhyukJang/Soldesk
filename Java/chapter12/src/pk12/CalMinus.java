package pk12;

public class CalMinus extends CalculatorExam {

	@Override
	public int getResult(int n1, int n2) {
		int sum=n1-n2;
		
		if(n1<n2) {
			sum=n2-n1;
		}
		
		return sum;
	}
}
