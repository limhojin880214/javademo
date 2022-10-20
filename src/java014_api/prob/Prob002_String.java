package java014_api.prob;

/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {
	
	public static void main(String[] args) {
		String data = args[0] + " "+ args[1];
		StringBuffer sb = new StringBuffer(data);
		String convert = "";
		for(char cn : data.toCharArray()) {
			if(Character.isUpperCase(cn)) {
				convert += Character.toLowerCase(cn);
			}else {
				convert += Character.toUpperCase(cn);
			}
		}
		
		//System.out.println(data);
		System.out.println("source : " + data);
		System.out.println("convert : " + convert);
		System.out.println("length : "+ data.length());
		System.out.println("reverse : " + sb.reverse());
		
	}
		
}// end class

