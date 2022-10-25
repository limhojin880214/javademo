package ncs.test6;

public class Calculator {
	double sum = 0.0;
	
	public double getSum(int data) {
		if(data <2 && data > 5) {
			System.out.println("오류메시지로");
		}else {
			
		}
		sum += data;
		System.out.println("결과값 :" + data);
		return sum;
	}
}
