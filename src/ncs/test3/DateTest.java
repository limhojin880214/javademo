package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		//패턴
		String pattern1 = "yyyy년 MM월 dd일 EEEE";
		String pattern2 = "yyyy년 MM월 dd일";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
		
		//날짜구하기
		Date nowDate = gc.getTime();
		gc.set(1987, 5, 27);
		Date birth = gc.getTime();
		
		//출력
		System.out.printf("생일 : %s\n", sdf1.format(birth));
		System.out.printf("현재 : %s\n", sdf2.format(nowDate));
		System.out.printf("나이 : %d 세\n", nowDate.getYear()-birth.getYear());
		
	}
}
