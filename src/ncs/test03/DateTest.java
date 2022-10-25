package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.toString());
		gc1.set(1987, 5, 27);
		gc.set(2016, 4, 18);
		
		String pattern = "yyyy년 MM월 dd일 EEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(gc));
		
		
		System.out.printf("생일 : 1987년 5월 27일 수요일\n");
		System.out.printf("현재 : 1987년 5월 27일 수요일\n");
		System.out.printf("나이 : %d 세\n");
		
	}
}
