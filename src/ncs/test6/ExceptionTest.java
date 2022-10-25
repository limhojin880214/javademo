package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		double sum = 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("2부터 5까지 정수형 데이터만 입력 :");
			int data = sc.nextInt();
			Calculator cal = new Calculator();
			cal.getSum(data);
		}
	}
}
