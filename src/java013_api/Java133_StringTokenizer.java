package java013_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java,/jsp/spring", ",/");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

		System.out.println("===========================================");
		//구분자 갯수만큼 문자열을 나누어 준다.
		String[] data = new String("java,/jsp/spring").split("[,/]");
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data[i]);
		}
	}// end main()

}// end class
