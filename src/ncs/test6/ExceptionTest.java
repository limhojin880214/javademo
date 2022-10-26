package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		boolean ing = true;
		while(ing) {
			System.out.print("2부터 5까지 정수형 데이터만 입력 :");
			int data = sc.nextInt();
			try {
				if(data <2 || data >5) {
					ing = false;
					throw new InvalidException("입력 값에 오류가 있습니다.");
				}else {
					System.out.println("결과값 : " + cal.getSum(data));
				}
				
			}catch(InvalidException ex) {
				
			}
				
		}
		
	}
}
