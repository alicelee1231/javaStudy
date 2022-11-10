package ch05;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		//열거 타입 변수를 선언
		Week today = null;
		
		//열거 값 대입
		
		today = Week.TUHRSDAY;
		
		//열거 값 비교
		if(today != Week.FRIDAY) {
			System.out.println("오늘은 불금이 아닙니다.");
		}else {
			System.out.println("오늘은 신나는 금요일	입니다.");
		}
		
		//컴퓨터의 요일 정보 얻기
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNESDAY; break;
		case 5 : today = Week.TUHRSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
	}
		if(today == Week.FRIDAY) {
			System.out.println("오늘은 불금이 아닙니다.");
		}else {
			System.out.println("오늘은 신나는 금요일	입니다.");
		}
	
	}
	

}
