package java013_api.prob;

/*[문제]
 * 2~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 배열에서 소수를 구하여 출력하는 primeNumber() 메서드를 각각 구현하시오.
 * [출력결과]
<< 발생된 난수 >>
*  15 7  4  4  8  7  2  11  17  5 
<< 소수 숫자 >>
*  7 7 2 11 17 5
*  */
import java.util.Random;

public class Prob003_random {

	public static void main(String[] args) {
		int[] array = makeArray();
		System.out.println("<< 발생된 난수 >>");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n<< 소수 숫자 >>");
		primeNumber(array);
	}// end main( )

	private static int[] makeArray() {
		// 난수값를 발생시킨후 반환하는 프로그램을 구현하시오.
		int[] res = new int[10];
		Random ran = new Random();
		for(int i=0;i<res.length;i++) {
			res[i] = ran.nextInt(19)+2;
		}
		
		return res;
	}// end makeArray()

	public static void primeNumber(int[] array) {
		// array배열에서 소수만 출력하는 프로그램을 구현하시오.
		for(int data : array) {
			int cnt = 0;
			for(int i = 1 ;i <= data ; i++) {
				if(data%i == 0)
					cnt++;
			}
			if(cnt == 2) {
				System.out.print(data + " ");
			}
		}
		
	}// end primeNumber()

}// end class
