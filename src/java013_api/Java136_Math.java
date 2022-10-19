package java013_api;

import static java.lang.Math.*;
/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오
 * 	ex)0.5689... => 5.7
 * 
 */
public class Java136_Math {
	
	public static void main(String[] args) {
		double ran = Math.random();
		//System.out.println(ran);
		double res = (round(ran*100))/10.0;
		//System.out.println(res);
		
		System.out.printf("%.4f... => %.1f", ran, res);
	}//end main()
	
}//end class
