package pk16;

import java.util.StringTokenizer;

public class StTokenizerTest {

	public static void main(String[] args) {
		String str="Smooth like butter";
		
		//StringTokenizer(자르고 싶은 String, 자르는 기준, 자르는 기준 표시 여부)
		StringTokenizer obj=new StringTokenizer(str, " ", false);
		
		//hasMoreTokens()=다음 Token의 존재 여부 확인
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			
			System.out.println(t);
		}
	}
}
