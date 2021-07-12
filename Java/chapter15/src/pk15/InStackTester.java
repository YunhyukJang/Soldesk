package pk15;

import java.util.Scanner;

public class InStackTester {

	public static void main(String[] args) {
		//최대 64개를 push 할 수 있도록 InStack 객체 생성
		InStack s=new InStack(64);
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("현재 데이터 수="+s.size());
			System.out.println("스택의 용량="+s.capacity());
			System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (0)EXIT -> ");
			
			int menu=sc.nextInt();
			
			if(menu == 0) {
				break;
			}
			
			int x;
			
			switch(menu) {
				case 1: //PUSH
					System.out.println("데이터:");
					
					x=sc.nextInt();
					
					try {
						s.push(x);
					} catch (InStack.overFlowStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					
					break;
					
				case 2: //POP
					try {
						x=s.pop();
						
						System.out.println("팝 데이터:"+x);
					} catch (InStack.emptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					
					break;
					
				case 3: //PEEK
					try {
						x=s.peek();
						
						System.out.println("피크 데이터:"+x);
					} catch (InStack.emptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					
					break;
					
				case 4: //DUMP
					s.clear();
					
					break;
			}
			
		}
	}
}
