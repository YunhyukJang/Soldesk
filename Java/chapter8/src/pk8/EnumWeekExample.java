package pk8;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today=null;
		
		Calendar cal=Calendar.getInstance();
		
		int week=cal.get(Calendar.DAY_OF_WEEK); //일요일 1, 월요일 2, 화요일 3... 토요일 7
		
		switch(week) {
			case 1:today=Week.SUNDAY;
			break;
			
			case 2:today=Week.MONDAY;
			break;
			
			case 3:today=Week.TUESDAY;
			break;
			
			case 4:today=Week.WEDNESDAY;
			break;
			
			case 5:today=Week.THURSDAY;
			break;
			
			case 6:today=Week.FRIDAY;
			break;
			
			case 7:today=Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘은 "+today+"!!");
		
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 게임을 할거에요!!");
		}else {
			System.out.println("열심히 Java를 공부해야해요!!");
		}
		
	}
}
