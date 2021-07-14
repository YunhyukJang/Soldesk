package pk13_2;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		//Scheduler 클래스를 기준으로 하여 RoundRobin, LeasJob, PriorityAllocation
		Scanner sc=new Scanner(System.in);
		
		outer:while(true) {
			System.out.println("------------------------------");
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 할당 방식을 선택하세요 : ");
			//System.in.read(); *콘솔에 입력받은 모든 값을 아스키코드로 변환
			//int ch=System.in.read();
			String input=sc.next();
			
			int ch=input.charAt(0);
			
			Scheduler scheduler=null;
			
			if(ch == 'R' || ch == 'r') {
				scheduler=new RoundRobin();
			}else if(ch == 'L' || ch == 'l') {
				scheduler=new LeasJob();
			}else if(ch == 'P' || ch == 'p') {
				scheduler=new PriorityAllocation();
			}else if(ch == 'S' || ch == 's') {
				System.out.println("프로그램을 종료합니다.");
				
				break outer;
			}else {
				System.out.println("입력값이 잘못되었습니다.");
				
				continue; //무시
			}
			
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}
}
