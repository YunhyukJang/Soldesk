package pk15;

import java.util.Scanner;

public class EnumMain {
	public enum Item{
		Start, Pause, Exit
	}

	public static void main(String[] args) {
		while(true) {
			System.out.println("0:게임 시작");
			System.out.println("1:일시 정지");
			System.out.println("2:게임 종료");
			System.out.print("선택 -> ");
			
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			
			Item start=Item.Start;
			Item pause=Item.Pause;
			Item exit=Item.Exit;
			
			//System.out.println(start.ordinal());
			
			if(n == start.ordinal()) {
				System.out.println("Game Start!!");
			}else if(n == pause.ordinal()) {
				System.out.println("Pause");
			}else {
				System.out.println("Exit Game.");
				
				return;
			}
			
		}
	}
}
