package pk17_2;

public class GenEx_Main {

	public static void main(String[] args) {
		//String -> 100
		GenEx<String> str=new GenEx<String>();
		
		str.setValue("100");
		
		System.out.println(str.getValue());
		
		//int -> 1000
		GenEx<Integer> num=new GenEx<Integer>();
		
		num.setValue(1000);
		
		System.out.println(num.getValue());
		
		//char -> 'G'
		GenEx<Character> chr=new GenEx<Character>();
		
		chr.setValue('G');
		
		System.out.println(chr.getValue());
		
		//double -> 3.14
		GenEx<Double> dble=new GenEx<Double>();
		
		dble.setValue(3.14);
		
		System.out.println(dble.getValue());
	}
}
