package pk13;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		Calc calc1=new ComputerCalc();
		//Calc calc2=new Calculator(); *추상 클래스
		
		//calc1.showInfo(); *Calc 타입이므로 Calc에 없는 메서드는 선언 불가능
		
		System.out.println("-----default method-----");
		
		calc1.description();
		
		System.out.println("-----static method-----");
		
		int[] arr= {1, 2, 3, 4, 5};
		
		System.out.println(Calc.total(arr));
		
		System.out.println(calc1.add(num1, num2));
		System.out.println(calc1.substract(num1, num2));
		System.out.println(calc1.times(num1, num2));
		System.out.println(calc1.divide(num1, num2));
		
		ComputerCalc calc=new ComputerCalc();
		
		calc.showInfo();
	}
}
