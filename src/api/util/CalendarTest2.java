package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.DAY_OF_YEAR); // Calendar.DAY_OF_YEAR상수에 설정된 값
		// Calendar.DAY_OF_YEAR 2024년 1월 1일 부터 경과한 day
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));// 오늘날짜를 기준으로 Calendar.DAY_OF_YEAR
															// 를 적용한 값

		System.out.println(Calendar.AM);// 0
		System.out.println(Calendar.PM);// 1
		// 현재시간을 기준으로 오전?오후? - 0이나 1을 반환
		System.out.println(cal.get(Calendar.AM_PM));
		if (cal.get(Calendar.AM_PM) == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		System.out.println(Calendar.SATURDAY);
		System.out.println(Calendar.SUNDAY);
		// DAY_OF_YEAR를 이용해서 dday구하기 - 단, 년도가 다른 경우 년도에 대한 계산을 추가
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		dday.set(Calendar.YEAR, 2024);
		dday.set(Calendar.MONTH, Calendar.JUNE);
		dday.set(Calendar.DAY_OF_MONTH, 18);

		// dday계산
		int day = dday.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR);
		System.out.println(day);
	}

}
