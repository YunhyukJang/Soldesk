package pk7;

public class FunTest07 {
	
	public static int Recur(int a) {
		int gop;
		
		System.out.println(a);
		
		if(a == 1) {
			return (1); //return 1=정상 종료지만 실제로 값을 넘겨주진 않음=break;
		}else {
			gop=a*Recur(a-1);
		}
		
		return (gop);
		//return 0;=정상 리턴
	}

	public static void main(String[] args) {
		int res, x=5;
		
		System.out.println("여기는 main() 입니다.");
		System.out.println("메서드를 호출합니다.");
		
		res=Recur(x); //재귀함수로 구현하라
		
		System.out.println("main()으로 다시 돌아왔습니다.");
		System.out.println("1~3까지 수를 곱한 값="+res+"\n");
	}
}
