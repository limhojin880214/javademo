package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		
		for(int i = 1; i<= num;i++) {
			int cnt = 0;
			for(int j=1;j<=num;j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt ==2) {
				System.out.println(i);
			}
		}
		
	}// end primeNumber( )
}//end class