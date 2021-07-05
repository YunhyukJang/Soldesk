package pk19;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//BinaryOperator:두 개의 매개 변수를 받아서 연산 *@FunctionalInterface에서 제공
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}else {
			return s2;
		}
		
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings= {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		//lambda
		//reduce(초기 값, 전달되는 요소)
		System.out.println(Arrays.stream(greetings).reduce("",(s1, s2) -> 
		{if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}else {
			return s2;
		}
		}));
		
		//BinaryOperator를 이용하여 구현
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		
		System.out.println(str);
	}
}
