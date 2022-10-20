package java014_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요
 * [출력결과]
 * 2016-2-29 월요일
 * 
 */
public class Java150_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		
		int date = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.toString());
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		char week = ' ';
		switch (day) {
		case 1: week='일'; break;
		case 2: week='월'; break;
		case 3: week='화'; break;
		case 4: week='수'; break;
		case 5: week='목'; break;
		case 6: week='금'; break;
		case 7: week='토'; break;
		}
		
		System.out.printf("%d-%d-%d %c요일\n", year, month, date,week);
//		cal.set(year, month-1, 1);
//		int lastday = cal.getActualMaximum(Calendar.DATE);
//		cal.set(year, month-1, lastday-1);
//		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//
//		switch (dayOfWeek) {
//		case 0:
//			System.out.println("일요일");
//			break;
//		case 1:
//			System.out.println("월요일");
//			break;
//		case 2:
//			System.out.println("화요일");
//			break;
//		case 3:
//			System.out.println("수요일");
//			break;
//		case 4:
//			System.out.println("목요일");
//			break;
//		case 5:
//			System.out.println("금요일");
//			break;
//		case 6:
//			System.out.println("토요일");
//			break;
//		default:
//			System.out.println("잘못된 숫자");
//
//		}
		

	}// end main()

}// end class
