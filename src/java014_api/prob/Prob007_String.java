package java014_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		return data.toCharArray();
	}// end process()

	public static void display(char[] arr) {
		int lowCnt = 0;
		int upCnt = 0;
		int numCnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])){
				upCnt++;
			}else if(Character.isLowerCase(arr[i])) {
				lowCnt++;
			}else if(Character.isDigit(arr[i])) {
				numCnt++;
			}
		}

		System.out.println("영어 소문자 갯수:" + lowCnt);
		System.out.println("영어 대문자 갯수:" + upCnt);
		System.out.println("숫자 갯수:" + numCnt);

	}// end display()

}// end class
