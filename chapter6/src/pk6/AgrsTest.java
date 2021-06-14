package pk6;

public class AgrsTest {

	public static void main(String[] args) {
		//배열의 초기화
		//int a[]=new int[5];
		//int[] a;
		//a=new int[5];	
		int aVal;
		int bVal;
		int tot;
		
		args=new String[2];
		
		args[0]="1";
		args[1]="2";
		
		if(args.length == 2) {
			//String -> int
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);	
		}else {
			aVal=0;
			bVal=0;
		}
		
		tot=aVal+bVal;
		
		System.out.println(tot);
	}
}
