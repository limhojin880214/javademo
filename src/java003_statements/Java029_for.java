package java003_statements;

public class Java029_for {
	public static void main(String[] args) {
		int odd = 0; //홀수
		int even = 0; //짝수
		
		for(int i = 1; i<=10; i++) {
			// i 변수의 값이 짝수이면				// i 변수의 값이 홀수이면
			if(i%2 ==0) {					//	if(i%2==1){
				even += i;					//	odd += i;
			}else {							//}else{
				odd += i;					// even += i;
			}								
		}
		System.out.printf("홀수누적 : %d\n", odd);
		System.out.printf("홀수누적 : %d\n", even);
	}
}
